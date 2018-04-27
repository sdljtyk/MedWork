package com.tyk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.service.UserService;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;

@Controller
@RequestMapping("/user")
public class Login {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/first.action")
	public String first(HttpSession session) throws Exception
	{
		if(session.getAttribute("activeUser")==null) {
			return "/base/user/login";
		}else 
			return "/base/first";
	}
	
	@RequestMapping("/login.action")
	@ResponseBody
	public ResultInfo login(HttpSession session,String userpass,String usernumber,String randomcode)
	{
		ActiveUser activeUser;
		ResultInfo ri;
		String validateCode = (String) session.getAttribute("validateCode");
		if(randomcode!=null && !validateCode.equals(randomcode)) { 
			ri = new ResultInfo(0,"验证码错误！");
			return ri;
		}
		activeUser = userService.FindActiveByNumAndPass(usernumber,userpass);
		if(activeUser==null) {
			ri = new ResultInfo(0,"用户名或者密码错误！");
			return ri;
		}else {
			ri = new ResultInfo(1,"登录成功！");
			session.setAttribute("activeUser", activeUser);
			System.out.println("ID:"+activeUser.getUserid()+"Name:"+activeUser.getUsername());
			return ri;
			
		}
	}
	
	@RequestMapping("/welcome.action")
	public String welcome()
	{
		return "/base/welcome";
	}
	
	@RequestMapping("/logout.action")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:first.action";
	}
}
