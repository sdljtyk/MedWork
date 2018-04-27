package com.tyk.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.mapper.MenuMapper;
import com.tyk.pojo.Menu;
import com.tyk.pojo.MenuExample;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.MenuVo;

@Controller
public class MenuAction {

	@Autowired
	private MenuMapper menuMapper;
	
	@RequestMapping("/menu.action")
	@ResponseBody
	public List<MenuVo> getMenus(HttpSession session)
	{
		List<MenuVo> menulist = new ArrayList<MenuVo>();
		ActiveUser activeUser = (ActiveUser)session.getAttribute("activeUser");
		MenuExample menuExample= new MenuExample();
		menuExample.createCriteria()
			.andIsusedEqualTo(1)
			.andMenulevelLike("%"+activeUser.getGroupid()+"%")
			.andMenuparentEqualTo(0);
		List<Menu> menus= menuMapper.selectByExample(menuExample);
		for (Menu menu : menus) {
			System.out.println("MenuName:"+menu.getMenuname());
			MenuVo temp = new MenuVo();
			temp.setMenuid(menu.getId().toString());
			temp.setMenuname(menu.getMenuname());
			temp.setUrl(menu.getMenuurl());
			MenuExample menuExample2= new MenuExample();
			menuExample2.createCriteria()
				.andMenuparentEqualTo(menu.getId())
				.andIsusedEqualTo(1)
				.andMenulevelLike("%"+activeUser.getGroupid()+"%");
			List<Menu> tempMenu = menuMapper.selectByExample(menuExample2);
			List<MenuVo> tempMenuVo = new ArrayList<MenuVo>();
			for (Menu tempm : tempMenu) {
				System.out.println("++++MenuName:"+tempm.getMenuname());
				MenuVo tempvo = new MenuVo();
				tempvo.setMenuid(tempm.getId().toString());
				tempvo.setMenuname(tempm.getMenuname());
				tempvo.setUrl(tempm.getMenuurl());
				tempvo.setMenus(null);
				tempMenuVo.add(tempvo);
			}
			temp.setMenus(tempMenuVo);
			menulist.add(temp);
		}
		activeUser.setMenu(menulist);
		session.setAttribute("activeUser", activeUser);
		return menulist;
	}
}
