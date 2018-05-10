package com.tyk.vo;

import com.tyk.pojo.User;

public class UserCustom extends User{
	
	private String groupName;
	private String unitName;
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
}
