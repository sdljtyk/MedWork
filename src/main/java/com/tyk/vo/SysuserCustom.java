package com.tyk.vo;

import com.tyk.pojo.User;

public class SysuserCustom extends User {
	
	//单位名称 
	private String sysmc;
	
	//用户类型名称 
	private String groupname;

	public String getSysmc() {
		return sysmc;
	}

	public void setSysmc(String sysmc) {
		this.sysmc = sysmc;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	
}
