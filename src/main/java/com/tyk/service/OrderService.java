package com.tyk.service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.GhqyMapper;
import com.tyk.mapper.GhsmedMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.MedinfoMapper;
import com.tyk.mapper.OrderinfoMapper;
import com.tyk.mapper.OrdersMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Ghqy;
import com.tyk.pojo.GhqyExample;
import com.tyk.pojo.Ghsmed;
import com.tyk.pojo.GhsmedExample;
import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.GhsunitExample;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.MedinfoExample;
import com.tyk.pojo.Orderinfo;
import com.tyk.pojo.OrderinfoExample;
import com.tyk.pojo.Orders;
import com.tyk.pojo.OrdersExample;
import com.tyk.pojo.OrdersExample.Criteria;
import com.tyk.pojo.Yyunit;
import com.tyk.vo.GysypmlCustom;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.OrderInfoCustom;

@Service
public class OrderService {

	@Autowired
	private GhqyMapper ghqyMapper;
	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private YyunitMapper yyunitMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	@Autowired
	private OrderinfoMapper orderinfoMapper;
	@Autowired
	private MedinfoMapper medinfoMapper;
	@Autowired
	private GhsunitMapper ghsunitMapper;
	@Autowired
	private GhsmedMapper ghsmedMapper;
	
	public OrderCustom FindCusByOrders(Orders orders)
	{
		OrderCustom custom = new OrderCustom();
		String yyname = yyunitMapper.selectByPrimaryKey(orders.getYyid()).getYyname();
		String orderstatemc = dicinfoMapper.selectByPrimaryKey(orders.getOrderstate()).getInfo();
		
		custom.setId(orders.getId());
		custom.setOrderadvice(orders.getOrderadvice());
		custom.setOrdercreateperson(orders.getOrdercreateperson());
		custom.setOrderctime(orders.getOrderctime());
		custom.setOrdername(orders.getOrdername());
		custom.setOrdernumber(orders.getOrdernumber());
		custom.setOrderother(orders.getOrderother());
		custom.setOrderstate(orders.getOrderstate());
		custom.setOrderstatemc(orderstatemc);
		custom.setOrdersub(orders.getOrdersub());
		custom.setOrderwatime(orders.getOrderwatime());
		custom.setOrderphone(orders.getOrderphone());
		custom.setYyid(orders.getYyid());
		custom.setYyname(yyname);
		
		return custom;
				
	}
	
	public GysypmlCustom FindGhsCusByGhsMedAndMed(Ghsmed ghsmed,Medinfo medinfo)
	{
		GysypmlCustom temp = new GysypmlCustom();
		String lbmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedclass()).getInfo();
		String zlccmc = dicinfoMapper.selectByPrimaryKey(Integer.parseInt(medinfo.getMedzl())).getInfo();
		String jyztmc = dicinfoMapper.selectByPrimaryKey(medinfo.getMedstate()).getInfo();
		String controlmc = dicinfoMapper.selectByPrimaryKey(ghsmed.getGhsmedstate()).getInfo();
		String gHSName = ghsunitMapper.selectByPrimaryKey(ghsmed.getGhsunitid()).getGhsname();
		temp.setId(ghsmed.getId());
		temp.setControlmc(controlmc);
		temp.setGhsmedstate(ghsmed.getGhsmedstate());
		temp.setGHSName(gHSName);
		temp.setGhsunitid(ghsmed.getGhsunitid());
		temp.setJyztmc(jyztmc);
		temp.setLbmc(lbmc);
		temp.setMedclass(medinfo.getMedclass());
		temp.setMeddj(ghsmed.getMeddj());
		temp.setMedgg(medinfo.getMedgg());
		temp.setMedid(ghsmed.getMedid());
		temp.setMedjx(medinfo.getMedjx());
		temp.setMedmake(medinfo.getMedmake());
		temp.setMedname(medinfo.getMedname());
		temp.setMednumber(medinfo.getMednumber());
		temp.setMedstate(medinfo.getMedstate());
		temp.setZlccmc(zlccmc);
		
		return temp;
	}
	
	public List<OrderCustom> FindListByOrderCustom(OrderCustom orderCustom) {
		List<OrderCustom> list = new ArrayList<OrderCustom>();
		OrdersExample example = new OrdersExample();
		if(orderCustom!=null)
		{
			Criteria criteria = example.createCriteria();
			criteria.andOrdernameLike("%" + (orderCustom.getOrdername() == null ? "" : orderCustom.getOrdername()) + "%")
					.andOrdernumberLike("%" + (orderCustom.getOrdernumber() == null ? "" : orderCustom.getOrdernumber()) + "%");
			if(orderCustom.getOrderstate() != null && orderCustom.getOrderstate() != 0)
				criteria.andOrderstateEqualTo(orderCustom.getOrderstate());
			if(orderCustom.getYyid() != null)
				criteria.andYyidEqualTo(orderCustom.getYyid());
		}
		List<Orders> orders = ordersMapper.selectByExample(example);
		for (Orders orders2 : orders) {
			OrderCustom temp = FindCusByOrders(orders2);
			list.add(temp);
		}
		return list;
	}


	public int FindCountByOrderCustom(OrderCustom orderCustom) {
		int count = FindListByOrderCustom(orderCustom).size();
		
		return count;
	}

	public int UpOrderStateByID(String string, String string2) {
		Orders orders = ordersMapper.selectByPrimaryKey(Integer.parseInt(string));
		orders.setOrderstate(Integer.parseInt(string2));
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		orders.setOrderwatime(df.format(date));
		return ordersMapper.updateByPrimaryKeySelective(orders);
	}

	public OrderCustom FindCusByID(String yycgdid) {
		Orders order = ordersMapper.selectByPrimaryKey(Integer.parseInt(yycgdid));
		OrderCustom custom =FindCusByOrders(order);
		return custom;
	}

	public List<OrderInfoCustom> FindOrderListByOrderID(String yycgdid) {
		List<OrderInfoCustom> list = new ArrayList<OrderInfoCustom>();
		OrderinfoExample example = new OrderinfoExample();
		example.createCriteria().andOrderidEqualTo(Integer.parseInt(yycgdid));
		List<Orderinfo> orderinfo = orderinfoMapper.selectByExample(example);
		for (Orderinfo orderinfo2 : orderinfo) {
			OrderInfoCustom temp = FindOrderInfoCusByOrder(orderinfo2);
			list.add(temp);
		}
		return list;
	}

	private OrderInfoCustom FindOrderInfoCusByOrder(Orderinfo orderinfo2) {
		OrderInfoCustom custom = new OrderInfoCustom();
		Medinfo med = medinfoMapper.selectByPrimaryKey(orderinfo2.getMedid());
		Dicinfo dic = dicinfoMapper.selectByPrimaryKey(orderinfo2.getGhstate());
		Ghsunit ghs = ghsunitMapper.selectByPrimaryKey(orderinfo2.getGhsid());
		
		custom.setId(orderinfo2.getId());
		custom.setGhsid(orderinfo2.getGhsid());
		custom.setGhsname(ghs.getGhsname());
		custom.setGhstate(orderinfo2.getGhstate());
		custom.setGhstatemc(dic.getInfo());
		custom.setMeddj(orderinfo2.getMeddj().toString());
		custom.setMedgg(med.getMedgg());
		custom.setMedid(orderinfo2.getMedid());
		custom.setMedjx(med.getMedjx());
		custom.setMedmake(med.getMedmake());
		custom.setMedname(med.getMedname());
		custom.setMednum(orderinfo2.getMednum());
		custom.setMednumber(med.getMednumber());
		custom.setMedsum(orderinfo2.getMedsum().toString());
		custom.setMeddw(med.getMeddw());
		return custom;
	}

	public int FindOrderCountByOrderId(String yycgdid) {
		int count = FindOrderListByOrderID(yycgdid).size();
		return count;
	}

	public int UpdateOrders(Orders orders) {
		return ordersMapper.updateByPrimaryKeySelective(orders);
	}

	public Orders InsertOrders(Orders orders) {
		ordersMapper.insertSelective(orders);
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DecimalFormat df2=new DecimalFormat("00000000");
		try {
			Date parse = df.parse(orders.getOrderctime());
			df = new SimpleDateFormat("yyyyMMdd");
			String str = df.format(parse);
			String ordernumber = str + df2.format(orders.getId());
			orders.setOrdernumber(ordernumber);
			ordersMapper.updateByPrimaryKeySelective(orders);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orders;
	}

	public int DelOrdersByID(String cgddeleteid) {
		
		return  ordersMapper.deleteByPrimaryKey(Integer.parseInt(cgddeleteid));
	}

	public List<GysypmlCustom> FindGhMedListByGysCustom(GysypmlCustom gysypmlCustom, String yycgdid,int yyid) {
		List <GysypmlCustom> list = new ArrayList<GysypmlCustom>();
		List<Medinfo> medinfos = new ArrayList<Medinfo>();
		List<Ghsmed> ghsmeds = new ArrayList<Ghsmed>();
		MedinfoExample example = new MedinfoExample();
		GhsmedExample ghsexample = new GhsmedExample();
		
		//选择医院所属地区供应商
		Yyunit  yyunit = yyunitMapper.selectByPrimaryKey(yyid);
		GhqyExample ghqyexample  = new GhqyExample();
		ghqyexample.createCriteria().andXzqyidEqualTo(yyunit.getYydqid());
		List<Ghqy> ghqy = ghqyMapper.selectByExample(ghqyexample);
		List<Integer> ghsIds = new ArrayList<Integer>();
		for (Ghqy gh : ghqy) {
			ghsIds.add(gh.getGysunitid());
		}
		
		
		//选择已经在供货单中存在药品
		List<Integer> Medids = new ArrayList<Integer>();
		OrderinfoExample orderInfoExample = new OrderinfoExample();
		orderInfoExample.createCriteria().andOrderidEqualTo(Integer.parseInt(yycgdid));
		List<Orderinfo> orderInfos = orderinfoMapper.selectByExample(orderInfoExample);
		for (Orderinfo orderinfo : orderInfos) {
			Medids.add(orderinfo.getMedid());
		}
		
		
		if (gysypmlCustom != null) {
			com.tyk.pojo.MedinfoExample.Criteria criteria = example.createCriteria();
			criteria.andMednameLike("%" + (gysypmlCustom.getMedname()==null ? "" : gysypmlCustom.getMedname()) + "%")
					.andMedjxLike("%" + (gysypmlCustom.getMedjx()==null ? "" : gysypmlCustom.getMedjx()) + "%")
					.andMedggLike("%" + (gysypmlCustom.getMedgg()==null ? "" : gysypmlCustom.getMedgg()) + "%")
					.andMedmakeLike("%" + (gysypmlCustom.getMedmake()==null ? "" : gysypmlCustom.getMedmake()) + "%");
			if (gysypmlCustom.getMedclass() != 0) {
				criteria.andMedclassEqualTo(gysypmlCustom.getMedclass());
			}
			if (gysypmlCustom.getMedstate() != 0) {
				criteria.andMedstateEqualTo(gysypmlCustom.getMedstate());
			}
			if(Medids.size()>0)
				criteria.andIdNotIn(Medids);
			
			com.tyk.pojo.GhsmedExample.Criteria criteria2 = ghsexample.createCriteria();
			criteria2.andGhsunitidIn(ghsIds);
			if(gysypmlCustom.getGhsmedstate()!= null && gysypmlCustom.getGhsmedstate()!= 0)
				criteria2.andGhsmedstateEqualTo(gysypmlCustom.getGhsmedstate());
		}
		medinfos = medinfoMapper.selectByExample(example);
		ghsmeds = ghsmedMapper.selectByExample(ghsexample);
		
		for (Ghsmed ghsmed : ghsmeds) {
			for (Medinfo  medinfo : medinfos) {
				GysypmlCustom temp = new GysypmlCustom();
				if(ghsmed.getMedid() == medinfo.getId())
				{
					temp = this.FindGhsCusByGhsMedAndMed(ghsmed,medinfo);
					
					list.add(temp);
				}
			}
		}
		return list;
	}

	public int FindGhMedCountByGysCustom(GysypmlCustom gysypmlCustom, String yycgdid,int yyid) {
		int count = FindGhMedListByGysCustom(gysypmlCustom, yycgdid,yyid).size();
		return count;
	}

	public int InsertOrderInfo(Orderinfo orderinfo) {
		orderinfo.setMednum(0);
		orderinfo.setMedsum((float) 0);
		orderinfo.setGhstate(33);
		return orderinfoMapper.insertSelective(orderinfo);
	}

	public int DelOrderInfoByID(String string) {
		return orderinfoMapper.deleteByPrimaryKey(Integer.parseInt(string));
	}

	public int UpdateOrderInfo(Orderinfo orderinfo) {
		orderinfo.setMedsum(orderinfo.getMeddj()*orderinfo.getMednum());
		return orderinfoMapper.updateByPrimaryKeySelective(orderinfo);
	}
	
}
