package com.tyk.service;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.GhsunitMapper;
import com.tyk.mapper.MedinfoMapper;
import com.tyk.mapper.OrderinfoMapper;
import com.tyk.mapper.OrdersMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.Orderinfo;
import com.tyk.pojo.OrderinfoExample;
import com.tyk.pojo.Orders;
import com.tyk.pojo.OrdersExample;
import com.tyk.pojo.OrdersExample.Criteria;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.OrderInfoCustom;

@Service
public class OrderService {

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
		
		custom.setGhsid(orderinfo2.getGhsid());
		custom.setGhsname(ghs.getGhsname());
		custom.setGhstate(orderinfo2.getGhstate());
		custom.setGhstatemc(dic.getInfo());
		custom.setMeddj(orderinfo2.getMeddj());
		custom.setMedgg(med.getMedgg());
		custom.setMedid(orderinfo2.getMedid());
		custom.setMedjx(med.getMedjx());
		custom.setMedmake(med.getMedmake());
		custom.setMedname(med.getMedname());
		custom.setMednum(orderinfo2.getMednum());
		custom.setMednumber(med.getMednumber());
		custom.setMedsum(orderinfo2.getMedsum());
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
	
}
