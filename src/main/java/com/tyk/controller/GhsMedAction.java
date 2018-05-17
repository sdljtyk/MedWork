package com.tyk.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Ghsmed;
import com.tyk.service.BaseService;
import com.tyk.service.MedService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.GysypmlCustom;
import com.tyk.vo.YpxxCustom;

@Controller
@RequestMapping("/ypml")
public class GhsMedAction {
	@Autowired
	private MedService medService;
	@Autowired
	private BaseService baseService;
	
	public String MedmlShow(Model model, String url) {
		List<Dicinfo> yplbList = baseService.FindDicByType("001");
		List<Dicinfo> ypghztList = baseService.FindDicByType("002");
		List<Dicinfo> ypjyztList = baseService.FindDicByType("003");
		List<Dicinfo> ypzlccList = baseService.FindDicByType("004");
		model.addAttribute("yplbList", yplbList);
		model.addAttribute("ypghztList", ypghztList);
		model.addAttribute("ypzlccList", ypzlccList);
		model.addAttribute("ypjyztList", ypjyztList);
		return url;
	}
	
	@RequestMapping("/gysypmlquery.action")
	public String gysypmlquery(Model model)
	{	
		String url = "business/ypml/gysypmlquery";
		return MedmlShow(model,url);
	}
	
	@RequestMapping("/gysypmlquery_result.action")
	@ResponseBody
	public DataGridResultInfo gysypmlquery_result(HttpSession session,GysypmlCustom gysypmlCustom, int page, int rows)
	{
		String unitid = null;
		ActiveUser activeUser = (ActiveUser)session.getAttribute("activeUser");
		if(activeUser.getGroupid().equals("28"))
			unitid = activeUser.getUnitID();
		int count = 0;
		try {
			count = medService.FindCountByGysCustom(gysypmlCustom,unitid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<GysypmlCustom> list = medService.FindListByGysCustom(gysypmlCustom,unitid);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	} 
	
	@RequestMapping("/gysypmlsave.action")
	@ResponseBody
	public ResultInfo gysypmlsave(String indexs,GysypmlCustom custom)
	{
		ResultInfo ri = new ResultInfo();
		List<Ghsmed> ghsmeds = custom.getGhsmeds();
		System.out.println("GhsMedAction.gysypmlsave  ghsmeds:" + ghsmeds.toString());
		int ins_success = 0;
		int ins_fail = 0;
		int i, j;
		String[] ids = indexs.split(",");
		for (j = 0; j < ids.length; j++) {
			for (i = 0; i < ghsmeds.size(); i++) {
				try {
					Ghsmed ghsmed = ghsmeds.get(i);
					if (ghsmed.getId() == Integer.parseInt(ids[j]))
						ins_success += medService.UpdateGhsMedDJ(ghsmed);
				} catch (Exception e) {
					ins_fail++;
				}
			}
		}
		ri.setMessage("成功保存" + ins_success + "条信息!失败保存" + ins_fail + "条信息！");
		return ri;
	}
	
	@RequestMapping("/gysypmladdquery.action")
	public String gysypmladdquery(Model model)
	{
		String url = "business/ypml/gysypmladdquery";
		return MedmlShow(model,url);
	}
	
	@RequestMapping("/gysypmladdquery_result.action")
	@ResponseBody
	public DataGridResultInfo gysypmladdquery_result(HttpSession session,YpxxCustom ypxxCustom, int page, int rows) throws Exception {
		ActiveUser activeUser = (ActiveUser)session.getAttribute("activeUser");
		if (ypxxCustom == null) {
			ypxxCustom = new YpxxCustom();
		}
		// 获取记录总数
		int count = 0;
		try {
			count = medService.FindGhsAddCountByCustom(ypxxCustom,activeUser.getUnitID());
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<YpxxCustom> list = medService.FindGhsAddListByCustom(ypxxCustom,activeUser.getUnitID());
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/gysypmladd.action")
	@ResponseBody
	public ResultInfo gysypmladd(HttpSession session, String indexs) {
		ActiveUser activeUser = (ActiveUser)session.getAttribute("activeUser");
		ResultInfo ri = new ResultInfo();
		String[] ids = indexs.split(",");
		int ins_success = 0;
		int ins_fail = 0;
		for (int i = 0; i < ids.length; i++) {
			try {
				Ghsmed ghsmed = new Ghsmed();
				ghsmed.setGhsmedstate(17);
				ghsmed.setMeddj((float)0.0);
				ghsmed.setMedid(Integer.parseInt(ids[i]));
				ghsmed.setGhsunitid(Integer.parseInt(activeUser.getUnitID()));
				ins_success += medService.InsertGhsMed(ghsmed);
			} catch (Exception e) {
				ins_fail++;
			}
		}
		ri.setMessage("成功添加" + ins_success + "条信息!失败添加" + ins_fail + "条信息！");
		return ri;
	}
	
	@RequestMapping("/gysypmldelete.action")
	@ResponseBody
	public ResultInfo gysypmldelete(String indexs) {
		ResultInfo ri = new ResultInfo();
		if (indexs == null || indexs.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		String[] ids = indexs.split(",");
		int del_success = 0;
		int del_fail = 0;
		for (int i = 0; i < ids.length; i++) {
			try {
				del_success += medService.DelGhsMedByID(ids[i]);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
}
