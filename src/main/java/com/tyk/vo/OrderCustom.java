package com.tyk.vo;

import com.tyk.pojo.Orders;

public class OrderCustom extends Orders{

 	private String yyname;
 	private String orderstatemc;
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
}
