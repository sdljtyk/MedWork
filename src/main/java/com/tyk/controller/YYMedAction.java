package com.tyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.service.BaseService;
import com.tyk.service.MedService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.YpxxCustom;

/**
 * 
 * 医院相关药品控制
 * 
 * @author sdljtyk
 *
 */

@Controller
@RequestMapping("/ypml")
public class YYMedAction {
	@Autowired
	private MedService medService;
	@Autowired
	private BaseService baseService;

	// 查询药品外键信息
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

	@RequestMapping("/yyypmlquery.action")
	public String yyypmlquery(Model model) {
		return MedmlShow(model,"/business/ypml/yyypmlquery");
	}
	
	@RequestMapping("/yyypmlquery_result.action")
	@ResponseBody
	public DataGridResultInfo yyypmlquery_result(YpxxCustom ypxxCustom,int yyid,int page, int rows) throws Exception {
		if (ypxxCustom == null) {
			ypxxCustom = new YpxxCustom();
		}
		System.out.println("ypxxCustom:"+ypxxCustom.toString());
		System.out.println("yyid"+yyid);
		// 获取记录总数
		int count = 0;
		try {
			count = medService.FindYYmedCountByCusAndYYid(ypxxCustom,yyid);
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<YpxxCustom> list = medService.FindYYmedListByCusAndYYid(ypxxCustom,yyid);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yyypmldelete.action")
	@ResponseBody
	public ResultInfo yyypmldelete(String indexs) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (indexs == null || indexs.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}

		String[] idAtt = indexs.split(",");
		int del_success = 0;
		int del_cannot = 0;
		int del_fail = 0;
		for (int i = 0; i < idAtt.length; i++) {
			try {
				int temp = medService.DelYYMedByID(idAtt[i]);
				if(temp == 1)
					del_success += temp;
				else
					del_cannot++;
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n因库存量不为0，无法删除"+del_cannot+"条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	
}
