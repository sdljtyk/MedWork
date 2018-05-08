package com.tyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Xzqy;
import com.tyk.pojo.Yyunit;
import com.tyk.service.BaseService;
import com.tyk.service.YYUnitService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.YYCustom;



@Controller
@RequestMapping("/user")
public class YYAction {
	
	@Autowired
	private BaseService baseService;
	@Autowired
	private YYUnitService yyUnitService;
	
	@RequestMapping("/useryyquery.action")
	public String useryyquery(Model model)throws Exception{		
		//医院类型
		List<Dicinfo> yylbList =  baseService.FindDicByType("005");
		List<Xzqy> xzqy =  baseService.FinAllDq();
		System.out.println(xzqy.size());
		model.addAttribute("yylbList", yylbList);
		model.addAttribute("xzqy", xzqy);
		return "/base/user/useryyquery";
	}
	
	@RequestMapping("/useryyquery_result.action")
	@ResponseBody
	public DataGridResultInfo useryyquery_result(YYCustom yyCustom,int page, int rows)
	{
		int count = 0;
		try {
			count = yyUnitService.FindCountByYyCustom(yyCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<YYCustom> list = yyUnitService.FindListByYyCustom(yyCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}

	@RequestMapping("/useryyview.action")
	public String useryyview(Model model,String editid)
	{
		List<Dicinfo> yylbList =  baseService.FindDicByType("005");
		model.addAttribute("yylbList", yylbList);
		if(editid!=null) {
			YYCustom custom = yyUnitService.FindCusById(editid);
			model.addAttribute("useryy", custom);
		}
		return "/base/user/useryyview";
		
	}
	
	@RequestMapping("/useryysave.action")
	@ResponseBody
	public ResultInfo useryysave(Yyunit unit)
	{
		System.out.println(unit);
		ResultInfo ri = new ResultInfo();
		if(unit.getId()!=null){
			int i = yyUnitService.UpdateYy(unit);
			ri.setMessage("成功修改"+i+"条数据！");
		}else{
			int j = yyUnitService.InsertYy(unit);
			ri.setMessage("成功添加"+j+"条数据！");
		}
		return ri;
	}
	
	@RequestMapping("/useryyedit.action")
	public String useryyedit(Model model,String editid)
	{
		List<Dicinfo> yylbList =  baseService.FindDicByType("005");
		List<Xzqy> xzqy =  baseService.FinAllDq();
		model.addAttribute("yylbList", yylbList);
		model.addAttribute("xzqy", xzqy);
		if(editid!=null) {
			YYCustom custom = yyUnitService.FindCusById(editid);
			model.addAttribute("useryy", custom);
		}
		return "/base/user/useryyedit";
		
	}
	
	@RequestMapping("/useryydel.action")
	@ResponseBody
	public ResultInfo useryydel(String delid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (delid == null || delid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		int del_success = 0;
		int del_fail = 0;
			try {
				del_success += yyUnitService.DelYyByID(delid);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
}
