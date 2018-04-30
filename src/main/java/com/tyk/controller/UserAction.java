package com.tyk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.User;
import com.tyk.service.UserService;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;

/**
 * 
 * @author sdljtyk
 * User 相关操作
 *
 */
@Controller
@RequestMapping("/user")
public class UserAction {
	
	@Autowired
	private UserService userService;
	//更新密码跳转页面
	@RequestMapping("/updatepwd.action")
	public String UpdatePwdShow()
	{
		return "/base/user/updatepwd";
	}
	
	//更新密码
	@RequestMapping("/saveapwd.action")
	@ResponseBody
	public ResultInfo SavePwd(HttpSession session,String oldpwd,String newpwd)

	{
		ResultInfo ri = new ResultInfo();
		System.out.println(oldpwd+"+++"+newpwd);
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		int type = userService.updatePwd(oldpwd,newpwd,activeUser.getUserid());
		if(type==1)
		{
			ri.setType(1);
			ri.setMessage("修改成功！");
		}else if(type==0)
		{
			ri.setType(0);
			ri.setMessage("旧密码不正确，请重新输入！");
		}else
		{
			ri.setType(0);
			ri.setMessage("密码修改失败！");
		}
		return ri;
	}
	
	@RequestMapping("/userjdquery")
	public String userjdquery(Model model)throws Exception{
		return "/base/user/userjdquery";
	}

	@RequestMapping("/useryyquery")
	public String useryyquery(Model model)throws Exception{
		
		//医院类型
//		List yyjbList =  baseServiceFacade.getSystemConfigService().findDicttypeinfolist("005");
//		List yylbList =  baseServiceFacade.getSystemConfigService().findDicttypeinfolist("006");
//		model.addAttribute("yyjbList", yyjbList);
//		model.addAttribute("yylbList", yylbList);
		return "/base/user/useryyquery";
	}
	
	
	@RequestMapping("/usergysquery")
	public String usergysquery(Model model)throws Exception{
		return "/base/user/usergysquery";
	}
	
	@RequestMapping("/sysuserquery")
	public String sysuserquery(Model model)throws Exception{
		//List usergroupList =  baseServiceFacade.getSystemConfigService().findDicttypeinfolist("s01");
		//model.addAttribute("usergroupList", usergroupList);
		return "/base/user/sysuserquery";
	}
	
}
