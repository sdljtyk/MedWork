package com.tyk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.service.BaseService;
import com.tyk.service.OrderService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.OrderCustom;




@Controller
@RequestMapping("cgd")
public class OrderAction {

	@Autowired
	private OrderService orderService;
	@Autowired
	private BaseService baseService;
	
	@RequestMapping("/yycgdlist.action")
	public String yycgdlist(Model model) throws Exception{
		List<Dicinfo> cgdztList = baseService.FindDicByType("007");
		model.addAttribute("cgdztList", cgdztList);
		return "/business/cgd/yycgdlist";
	}
	
	@RequestMapping("/yycgdreview.action")
	public String yycgdreview(Model model)
	{
		return "business/cgd/yycgdreview";
	}
	
	@RequestMapping("/yycgdlist_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdlist_result(OrderCustom orderCustom,int page,int rows)
	{
		System.out.println("ordercustom:"+orderCustom);
		int count = 0;
		try {
			count = orderService.FindCountByOrderCustom(orderCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<OrderCustom> list = orderService.FindListByOrderCustom(orderCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	} 
	
	@RequestMapping("/yycgdreviewsubmit.action")
	@ResponseBody
	public ResultInfo yycgdreviewsubmit(String indexs,String states)
	{
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
					upt_success+=orderService.UpOrderStateByID(index[i],state[i]);;
			} catch (Exception e) {
				upt_fail++;
			}
		}
		ri.setType(1);
		ri.setMessage("成功修改" + upt_success + "条信息。\n修改失败" + upt_fail + "条信息");
		return ri;
	} 
	
	@RequestMapping("/yycgdinfo.action")
	public String yycgdinfo(String yycgdid,Model model)
	{
		OrderCustom custom = orderService.FindCusByID(yycgdid);
		model.addAttribute("yycgd", custom);
		return "business/cgd/yycgdinfo";
	}
}
