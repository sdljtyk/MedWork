package com.tyk.vo;

import java.util.List;

/**
 * 用户身份信息，存入session
 * @author sdljtyk
 */
public class ActiveUser  implements java.io.Serializable {
	private String userid;//用户编号
	private String username;//用户名称
	private String groupid;//用户类型
	private String groupname;//用户类型名称
	private List<MenuVo> menu;//操作菜单
	private String unitID;//用户所属单位id
	private String unitName;//单位名称
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getGroupid() {
		return groupid;
	}
	public void setGroupid(String groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	
	public List<MenuVo> getMenu() {
		return menu;
	}
	public void setMenu(List<MenuVo> menu) {
		this.menu = menu;
	}
	public String getUnitID() {
		return unitID;
	}
	public void setUnitID(String unitID) {
		this.unitID = unitID;
	}
	public String getUnitName() {
		return unitName;
	}
	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	@Override
	public String toString() {
		return "ActiveUser [userid=" + userid + ", username=" + username + ", groupid=" + groupid + ", groupname="
				+ groupname + ", menu=" + menu + ", unitID=" + unitID + ", unitName=" + unitName + "]";
	}
}
