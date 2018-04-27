package com.tyk.vo;

import java.util.List;

public class MenuVo {

	//二级菜单
	private List<MenuVo> menus;
	//菜单id、模块id
	private String menuid;
	//菜单名称/模块名称
	private String menuname;
	//菜单链接
	private String url;
	public List<MenuVo> getMenus() {
		return menus;
	}
	public void setMenus(List<MenuVo> menus) {
		this.menus = menus;
	}
	public String getMenuid() {
		return menuid;
	}
	public void setMenuid(String menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Menu [menus=" + menus 
				+ ", menuid=" + menuid + ", menuname=" 
				+ menuname + ", url=" + url + "]";
	}
	
}
