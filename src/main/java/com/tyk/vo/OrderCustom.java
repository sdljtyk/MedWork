package com.tyk.vo;

import java.util.ArrayList;
import java.util.List;

import com.tyk.pojo.Orderinfo;
import com.tyk.pojo.Orders;

public class OrderCustom extends Orders{

 	private String yyname;
 	private String orderstatemc;
 	private List<Orderinfo> yycgdmxs = new ArrayList<Orderinfo>();
	public String getYyname() {
		return yyname;
	}
	public void setYyname(String yyname) {
		this.yyname = yyname;
	}
	public String getOrderstatemc() {
		return orderstatemc;
	}
	public void setOrderstatemc(String orderstatemc) {
		this.orderstatemc = orderstatemc;
	}
	public List<Orderinfo> getYycgdmxs() {
		return yycgdmxs;
	}
	public void setYycgdmxs(List<Orderinfo> yycgdmxs) {
		this.yycgdmxs = yycgdmxs;
	}
	
}
