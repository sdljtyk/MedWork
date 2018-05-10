package com.tyk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Ghsunit;
import com.tyk.pojo.Xzqy;
import com.tyk.service.BaseService;
import com.tyk.service.GHSUnitService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.JacksonUtil;
import com.tyk.util.ResultInfo;
import com.tyk.vo.GHSCustom;
import com.tyk.vo.YYCustom;

@Controller
@RequestMapping("/user")
public class GHSAction {
	
	@Autowired
	private GHSUnitService ghsUnitService;
	@Autowired
	private BaseService baseService;
	
	@RequestMapping("/usergysquery")
	public String usergysquery(Model model)throws Exception{
		return "/base/user/usergysquery";
	}
	
	@RequestMapping("/usergysquery_result.action")
	@ResponseBody
	public DataGridResultInfo usergysquery_result(GHSCustom ghsCustom,int page,int rows)
	{
		int count = 0;
		try {
			count = ghsUnitService.FindCountByGhsCustom(ghsCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<GHSCustom> list = ghsUnitService.FindListByGhsCustom(ghsCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/usergysedit.action")
	public String usergysedit(String editid,Model model)
	{
		List<Xzqy> xzqy =  baseService.FinAllDq();
		String jsonXzqy = JacksonUtil.obj2Json(xzqy);
		model.addAttribute("xzqy", jsonXzqy);
		List<Integer> dqs = new ArrayList<Integer>();
		if(editid != null)
		{
			GHSCustom usergys = ghsUnitService.FindCusByUnit(editid);
			model.addAttribute("usergys", usergys);
			 
			List<Xzqy> temp = usergys.getDqs();
			for (Xzqy xzqy2 : temp) {
				dqs.add(xzqy2.getId());
			}
		}
		model.addAttribute("dqs", dqs);
		return "/base/user/usergysedit";
	}
	
	@RequestMapping("/usergyssave.action")
	@ResponseBody
	public ResultInfo usergyssave(Ghsunit unit,String dqids)
	{
		String [] dqid = dqids.split(",");
		ResultInfo ri = new ResultInfo();
		if(unit.getId()!=null)
		{
			int i = ghsUnitService.UpdateGhs(unit,dqid);
			ri.setMessage("成功修改"+i+"条数据！");
		}else{
			int j = ghsUnitService.InsertGhs(unit,dqid);
			ri.setMessage("成功添加"+j+"条数据！");
		}
		return ri;
	}
	
	@RequestMapping("/usergysdel.action")
	@ResponseBody
	public ResultInfo usergysdel(String delid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (delid == null || delid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		int del_success = 0;
		int del_fail = 0;
			try {
				del_success += ghsUnitService.DelGhsByID(delid);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	
}
