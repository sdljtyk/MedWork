package com.tyk.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.BackinfoMapper;
import com.tyk.mapper.BacksMapper;
import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.MedinfoMapper;
import com.tyk.mapper.OrderinfoMapper;
import com.tyk.mapper.OrdersMapper;
import com.tyk.mapper.YymedMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Backinfo;
import com.tyk.pojo.BackinfoExample;
import com.tyk.pojo.Backs;
import com.tyk.pojo.BacksExample;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.Orderinfo;
import com.tyk.pojo.OrderinfoExample;
import com.tyk.pojo.Orders;
import com.tyk.pojo.Yymed;
import com.tyk.pojo.YymedExample;
import com.tyk.pojo.Yyunit;
import com.tyk.pojo.BacksExample.Criteria;
import com.tyk.vo.BackCustom;
import com.tyk.vo.BackInfoCustom;
import com.tyk.vo.OrderInfoCustom;

@Service
public class BackService {

	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private BacksMapper backsMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	@Autowired
	private YyunitMapper yyunitMapper;
	@Autowired
	private BackinfoMapper backinfoMapper;
	@Autowired
	private MedinfoMapper medinfoMapper;
	@Autowired
	private GhsunitMapper ghsunitMapper;
	@Autowired
	private OrderinfoMapper orderInfoMapper;
	@Autowired
	private YymedMapper yymedMapper;

	private BackCustom FindCusByBacks(Backs backs2) {
		BackCustom backCustom = new BackCustom();
		String yyname = yyunitMapper.selectByPrimaryKey(backs2.getYyid()).getYyname();
		String backstatename = dicinfoMapper.selectByPrimaryKey(backs2.getBackstate()).getInfo();

		backCustom.setBackalter(backs2.getBackalter());
		backCustom.setBackcreat(backs2.getBackcreat());
		backCustom.setBackname(backs2.getBackname());
		backCustom.setBacknumber(backs2.getBacknumber());
		backCustom.setBackother(backs2.getBackother());
		backCustom.setBackphone(backs2.getBackphone());
		backCustom.setBackstate(backs2.getBackstate());
		backCustom.setBackstatename(backstatename);
		backCustom.setBacksub(backs2.getBacksub());
		backCustom.setId(backs2.getId());
		backCustom.setYyid(backs2.getYyid());
		backCustom.setYylxr(backs2.getYylxr());
		backCustom.setYyname(yyname);
		return backCustom;
	}

	private BackInfoCustom FindBackInfoCusByBackInfo(Backinfo backinfo2) {
		BackInfoCustom custom = new BackInfoCustom();
		Backs backs = backsMapper.selectByPrimaryKey(backinfo2.getBackid());
		Medinfo med = medinfoMapper.selectByPrimaryKey(backinfo2.getMedid());
		Dicinfo dic = dicinfoMapper.selectByPrimaryKey(backinfo2.getBackstate());
		Ghsunit ghs = ghsunitMapper.selectByPrimaryKey(backinfo2.getGhsid());
		Orders order = ordersMapper.selectByPrimaryKey(backinfo2.getOrderid());
		Yyunit yyunit = yyunitMapper.selectByPrimaryKey(backs.getYyid());
		OrderinfoExample example = new OrderinfoExample();
		example.createCriteria().andOrderidEqualTo(backinfo2.getOrderid()).andMedidEqualTo(backinfo2.getMedid());
		List<Orderinfo> temp = orderInfoMapper.selectByExample(example);
		
		
		Orderinfo orderinfo = temp.get(0);
		custom.setId(backinfo2.getId());
		custom.setGhsid(backinfo2.getGhsid());
		custom.setGhsname(ghs.getGhsname());
		custom.setBackstate(backinfo2.getBackstate());
		custom.setBackstatemc(dic.getInfo());
		custom.setMeddj(backinfo2.getMeddj().toString());
		custom.setMedgg(med.getMedgg());
		custom.setMedid(backinfo2.getMedid());
		custom.setMedjx(med.getMedjx());
		custom.setMedmake(med.getMedmake());
		custom.setMedname(med.getMedname());
		custom.setMednum(orderinfo.getMednum());
		custom.setMedsum(orderinfo.getMedsum().toString());
		custom.setMednumber(med.getMednumber());
		custom.setMeddw(med.getMeddw());
		custom.setOrderid(backinfo2.getOrderid());
		custom.setBackid(backinfo2.getBackid());
		custom.setBacknum(backinfo2.getBacknum().toString());
		custom.setBackreason(backinfo2.getBackreason());
		custom.setBacksum(backinfo2.getBacksum().toString());
		custom.setOrdernumber(order.getOrdernumber());
		custom.setBacknumber(backs.getBacknumber());
		custom.setBackcreat(backs.getBackcreat());
		custom.setYyname(yyunit.getYyname());

		return custom;
	}

	public Backs InsertBacks(Backs backs) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DecimalFormat df2 = new DecimalFormat("00000000");
		Date date = new Date();
		backs.setBackalter(df.format(date));
		backsMapper.insertSelective(backs);
		try {
			Date parse = df.parse(backs.getBackcreat());
			df = new SimpleDateFormat("yyyyMMdd");
			String str = df.format(parse);
			String backnumber = str + df2.format(backs.getId());
			backs.setBacknumber(backnumber);
			backsMapper.updateByPrimaryKeySelective(backs);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return backs;
	}

	public int UpdateBacks(Backs backs) {
		if (backs.getBacksub() == null) {
			Date date = new Date();
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			backs.setBackalter(df.format(date));
		}
		return backsMapper.updateByPrimaryKeySelective(backs);
	}

	public List<BackCustom> FindListByBackCustom(BackCustom backCustom) {
		List<BackCustom> list = new ArrayList<BackCustom>();
		BacksExample example = new BacksExample();
		if (backCustom != null) {
			Criteria criteria = example.createCriteria();
			criteria.andBacknameLike("%" + (backCustom.getBackname() == null ? "" : backCustom.getBackname()) + "%")
					.andBacknumberLike(
							"%" + (backCustom.getBacknumber() == null ? "" : backCustom.getBacknumber()) + "%");
			if (backCustom.getBackstate() != null && backCustom.getBackstate() != 0)
				criteria.andBackstateEqualTo(backCustom.getBackstate());
			if (backCustom.getYyid() != null)
				criteria.andYyidEqualTo(backCustom.getYyid());
		}
		List<Backs> backs = backsMapper.selectByExample(example);
		for (Backs backs2 : backs) {
			BackCustom temp = FindCusByBacks(backs2);
			list.add(temp);
		}
		return list;
	}

	public int FindCountByBackCustom(BackCustom backCustom) {
		int count = FindListByBackCustom(backCustom).size();
		return count;
	}

	public BackCustom FindCusByBackID(String yythdid) {
		Backs backs = backsMapper.selectByPrimaryKey(Integer.parseInt(yythdid));
		BackCustom backCustom = FindCusByBacks(backs);
		return backCustom;
	}

	public int DelBacksByID(String thddeleteid) {

		return backsMapper.deleteByPrimaryKey(Integer.parseInt(thddeleteid));
	}

	public List<BackInfoCustom> FindBackInfoListByBackID(String yythdid, String backstate, String unitid) {
		BacksExample backsExample = new BacksExample();
		backsExample.createCriteria().andBackstateEqualTo(38);
		List<Backs> backs = backsMapper.selectByExample(backsExample);
		List<Integer> ids = new ArrayList<Integer>();
		for (Backs backs2 : backs) {
			ids.add(backs2.getId());
		}
		
		
		
		List<BackInfoCustom> list = new ArrayList<BackInfoCustom>();
		BackinfoExample example = new BackinfoExample();
		com.tyk.pojo.BackinfoExample.Criteria criteria = example.createCriteria();
		if (yythdid != null && !yythdid.equals("0")) {
			criteria.andBackidEqualTo(Integer.parseInt(yythdid));
		}
		if (backstate != null)
			criteria.andBackstateEqualTo(Integer.parseInt(backstate));
		
		if(unitid != null) {
			criteria.andGhsidEqualTo(Integer.parseInt(unitid));
			criteria.andBackidIn(ids);
		}
		List<Backinfo> Backinfo = backinfoMapper.selectByExample(example);
		for (Backinfo backinfo2 : Backinfo) {
			BackInfoCustom temp = FindBackInfoCusByBackInfo(backinfo2);
			list.add(temp);
		}
		return list;
	}

	public int FindBackInfoCountByBackId(String yythdid, String thstate, String unitid) {
		int count = FindBackInfoListByBackID(yythdid, thstate,unitid).size();
		return count;
	}

	public int UpdateBackInfo(Backinfo backinfo) {
		backinfo.setBacksum(backinfo.getMeddj() * backinfo.getBacknum());
		return backinfoMapper.updateByPrimaryKeySelective(backinfo);
	}

	public int DelBackInfoByID(String string) {
		return backinfoMapper.deleteByPrimaryKey(Integer.parseInt(string));
	}

	public List<OrderInfoCustom> FindOrderListBOrderInfo(List<OrderInfoCustom> temp, String backid, String unitid) {
		List<OrderInfoCustom> list = new ArrayList<OrderInfoCustom>();
		BackinfoExample backinfoExample = new BackinfoExample();
		backinfoExample.createCriteria().andBackidEqualTo(Integer.parseInt(backid));
		List<Backinfo> backinfos = backinfoMapper.selectByExample(backinfoExample);
		for (OrderInfoCustom orderInfoCustom : temp) {
			if (backinfos.size() > 0) {
				for (Backinfo backinfo : backinfos) {
					YymedExample example = new YymedExample();
					example.createCriteria().andYyidEqualTo(Integer.parseInt(unitid))
							.andMedidEqualTo(orderInfoCustom.getMedid());
					List<Yymed> meds = yymedMapper.selectByExample(example);
					System.out.println("BackService meds:" + meds.get(0).toString());
					if (meds.size() > 0 && meds.get(0).getMedsum() >= orderInfoCustom.getMednum()
							&& orderInfoCustom.getMedid() != backinfo.getMedid())
						list.add(orderInfoCustom);
				}
			}else {
				YymedExample example = new YymedExample();
				example.createCriteria().andYyidEqualTo(Integer.parseInt(unitid))
						.andMedidEqualTo(orderInfoCustom.getMedid());
				List<Yymed> meds = yymedMapper.selectByExample(example);
				System.out.println("BackService meds:" + meds.get(0).toString());
				if (meds.size() > 0 && meds.get(0).getMedsum() >= orderInfoCustom.getMednum())
					list.add(orderInfoCustom);
			}
		}
		return list;
	}

	public int InsertBackInfo(Backinfo backinfo) {
		backinfo.setBacknum(0);
		backinfo.setBacksum((float) 0.0);
		backinfo.setBackreason(null);
		backinfo.setBackstate(39);
		return backinfoMapper.insertSelective(backinfo);
	}

	public int ThBackInfoByID(String string) {
		Backinfo info = backinfoMapper.selectByPrimaryKey(Integer.parseInt(string));
		info.setBackstate(40);
		Orders  order = ordersMapper.selectByPrimaryKey(info.getOrderid());
		YymedExample example = new YymedExample();
		example.createCriteria().andYyidEqualTo(order.getYyid())
			.andMedidEqualTo(info.getMedid());
		List<Yymed> temp = yymedMapper.selectByExample(example);
		
		Yymed yymed = temp.get(0);
		yymed.setMedsum(yymed.getMedsum()-info.getBacknum());
		
		yymedMapper.updateByPrimaryKeySelective(yymed);
		return backinfoMapper.updateByPrimaryKeySelective(info);
	}

}
