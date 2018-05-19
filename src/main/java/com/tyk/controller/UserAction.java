package com.tyk.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.User;
import com.tyk.service.BaseService;
import com.tyk.service.UserService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.MD5;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.UserCustom;

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
	@Autowired
	private BaseService baseService;
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
	
	
	@RequestMapping("/loadunit.action")
	@ResponseBody
	public List<Map<String, String>> loadunit(String groupid)
	{
		System.out.println(groupid);
		
		return userService.FinMapByGroupID(groupid);
			
	}
	@RequestMapping("/sysuserquery.action")
	public String sysuserquery(Model model)throws Exception{
		List<Dicinfo> usergroupList =  baseService.FindDicByType("006");
		model.addAttribute("usergroupList", usergroupList);
		return "/base/user/sysuserquery";
	}
	
	@RequestMapping("/sysuserquery_result.action")
	@ResponseBody
	public DataGridResultInfo sysuserquery_result(UserCustom userCustom,int page,int rows)
	{
		int count = 0;
		try {
			count = userService.FindCountByUserCustom(userCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<UserCustom> list = userService.FindListByUserCustom(userCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	} 
	
	@RequestMapping("/sysuseredit.action")
	public String sysuseredit(String editid,Model model)
	{
		List<Dicinfo> usergroupList =  baseService.FindDicByType("006");
		model.addAttribute("usergroupList", usergroupList);
		if(editid!=null)
		{
			UserCustom sysuser = userService.FinCusByID(editid);
			model.addAttribute("sysuser", sysuser);
		}
		return "/base/user/sysuseredit";
	}
	
	
	@RequestMapping("/sysusersave.action")
	@ResponseBody
	public ResultInfo sysusersave(User user)
	{
		ResultInfo ri = new ResultInfo();
		if(user.getId()!=null)
		{
			int i = userService.UpdateUser(user);
			ri.setType(1);
			ri.setMessage("成功修改"+i+"条数据！");
		}else{
			String pwd = "123456";
			user.setUserpass(pwd);
			int j = userService.InsertUser(user);
			ri.setMessage("成功添加"+j+"条数据！");
			ri.setType(1);
		}
		return ri;
	}
	
	
	@RequestMapping("/sysuserdel.action")
	@ResponseBody
	public ResultInfo sysuserdel(String delid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (delid == null || delid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		int del_success = 0;
		int del_fail = 0;
			try {
				del_success += userService.DelUserByID(delid);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	
	
	/*	@RequestMapping("/userjdquery.action")
	public String userjdquery(Model model)throws Exception{
		return "/base/user/userjdquery";
	}
	*/
	
}
