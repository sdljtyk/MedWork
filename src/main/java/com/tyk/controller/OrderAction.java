package com.tyk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("cgd")
public class OrderAction {

	@RequestMapping("/yycgdlist.action")
	public String yycgdlist(Model model) throws Exception{
		return "/business/cgd/yycgdlist";
	}
	
	@RequestMapping("/yycgdreview.action")
	public String yycgdreview(Model model)
	{
		return "business/cgd/yycgdreview";
	}
	
	@RequestMapping("/yycgdlist_result.action")
	@ResponseBody
	public 
	
}
