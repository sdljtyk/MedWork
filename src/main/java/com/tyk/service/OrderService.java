package com.tyk.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.mapper.DicinfoMapper;
import com.tyk.mapper.OrdersMapper;
import com.tyk.mapper.YyunitMapper;
import com.tyk.pojo.Orders;
import com.tyk.pojo.OrdersExample;
import com.tyk.pojo.OrdersExample.Criteria;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.UserCustom;

@Service
public class OrderService {

	@Autowired
	private OrdersMapper ordersMapper;
	@Autowired
	private YyunitMapper yyunitMapper;
	@Autowired
	private DicinfoMapper dicinfoMapper;
	
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

}
