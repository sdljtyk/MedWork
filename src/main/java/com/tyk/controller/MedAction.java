package com.tyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Medinfo;
import com.tyk.service.BaseService;
import com.tyk.service.MedService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.GysypmlCustom;
import com.tyk.vo.YpxxCustom;

/**
 * 监管部门相关药品控制
 * @author sdljtyk
 *
 */

@Controller
@RequestMapping("/ypml")
public class MedAction {
	@Autowired
	private MedService medService;
	@Autowired
	private BaseService baseService;

	//查询药品外键信息
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
	
	//药品信息页面跳转
	@RequestMapping("/ypxxquery.action")
	public String ypxxquery(Model model) throws Exception {
		String url = "/business/ypml/ypxxquery";
		return MedmlShow(model, url);
	}

	//药品信息管理页面跳转
	@RequestMapping("/ypxxmanager.action")
	public String ypxxmanager(Model model) throws Exception {
		model.addAttribute("ismanager", "1");
		return ypxxquery(model);

	}

	//药品信息查询结果
	@RequestMapping("/ypxxquery_result.action")
	@ResponseBody
	public DataGridResultInfo ypxxquery_result(YpxxCustom ypxxCustom, int page, int rows) throws Exception {
		if (ypxxCustom == null) {
			ypxxCustom = new YpxxCustom();
		}
		System.out.println("ypxxCustom:"+ypxxCustom.toString());
		// 获取记录总数
		int count = 0;
		try {
			count = medService.FindCountByCustom(ypxxCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<YpxxCustom> list = medService.FindListByCustom(ypxxCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}

	//药品详细信息显示
	@RequestMapping("/ypxxview.action")
	public String ypxxview(String id,Model model) throws Exception{
		YpxxCustom ypxx = medService.FindCustomByID(id);
		model.addAttribute("ypxx", ypxx);
		return "/business/ypml/ypxxview";
	}
	
	//保存药品信息至数据库
	@RequestMapping("/ypxxsave.action")
	@ResponseBody
	public ResultInfo ypxxsave(Medinfo info) throws Exception{
		ResultInfo ri = new ResultInfo();
		if(info.getId()!=null){
			int i = medService.UpdateMed(info);
			ri.setMessage("成功修改"+i+"条数据！");
		}else{
			int j = medService.InsertMed(info);
			ri.setMessage("成功添加"+j+"条数据！");
		}
		return ri;
		
	}
	
	//修改添加药品信息页面跳转
	@RequestMapping("/ypxxedit.action")
	public String ypxxedit(String editid, Model model) throws Exception {
		if (editid != null) {
			YpxxCustom ypxx = medService.FindCustomByID(editid);
			model.addAttribute("ypxx", ypxx);
		}
		return MedmlShow(model, "/business/ypml/ypxxedit");
	}

	//删除药品信息
	@RequestMapping("/ypxxdel.action")
	@ResponseBody
	public ResultInfo ypxxdel(String ypxxdelid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (ypxxdelid == null || ypxxdelid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}

		String[] idAtt = ypxxdelid.split(",");
		int del_success = 0;
		int del_fail = 0;
		for (int i = 0; i < idAtt.length; i++) {
			try {
				del_success += medService.DelMedByID(idAtt[i]);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	
	//跳转供货商供药状态控制页面
	@RequestMapping("/gysypmlcontrolquery.action")
	public String gysypmlcontrolquery(Model model) throws Exception {
		model.addAttribute("iscontrol", "1");// 控制标记，在页面进行判断
		String url = "/business/ypml/gysypmlcontrolquery";
		return MedmlShow(model, url);
	}

	//供货商药品供应控制信息加载
	@RequestMapping("/gysypmlcontrolquery_result.action")
	@ResponseBody
	public DataGridResultInfo gysypmlcontrolquery_result(GysypmlCustom gysypmlCustom, int page, int rows)
	{
		int count = 0;
		try {
			count = medService.FindCountByGysCustom(gysypmlCustom,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<GysypmlCustom> list = medService.FindListByGysCustom(gysypmlCustom,null);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	//供货商药品供应控制
	@RequestMapping("/gysypmlcontrolsubmit.action")
	@ResponseBody
	public ResultInfo gysypmlcontrolsubmit(String indexs,String states)
	{
		System.out.println("indexs:"+indexs);
		System.out.println("states:"+states);
		ResultInfo ri = new ResultInfo();
		if (states == null || indexs == null) {
			ri.setType(0);
			ri.setMessage("修改失败，请重新选择修改状态！");
			return ri;
		}
		
		String[] index = indexs.split(",");
		String[] state = states.split(",");
		
		int upt_success = 0;
		int upt_fail = 0;
		for(int i=0;i<index.length;i++)
		{
			try {
				if(state[i]!="0")
					upt_success+=medService.UpGhStateByID(index[i],state[i]);;
			} catch (Exception e) {
				upt_fail++;
			}
		}
		ri.setType(1);
		ri.setMessage("成功修改" + upt_success + "条信息。\n修改失败" + upt_fail + "条信息");
		return ri;
	}

	/*导入药品信息
	@RequestMapping("/ypxximport.action")
	public String ypxximport() throws Exception {
		return "/business/ypml/ypxximport";
	}
	*/
}
