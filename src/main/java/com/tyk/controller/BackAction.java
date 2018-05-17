package com.tyk.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Backinfo;
import com.tyk.pojo.Backs;
import com.tyk.pojo.Dicinfo;
import com.tyk.service.BackService;
import com.tyk.service.BaseService;
import com.tyk.service.OrderService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.BackCustom;
import com.tyk.vo.BackInfoCustom;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.OrderInfoCustom;

@Controller
@RequestMapping("/thd")
public class BackAction {
	
	@Autowired
	private BaseService baseService;
	@Autowired
	private BackService backService;
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/yythdlist.action")
	public String yythdlist(Model model)
	{
		List<Dicinfo> thdztList = baseService.FindDicByType("009");
		model.addAttribute("thdztList", thdztList);
		return "business/thd/yythdlist";
	}
	
	@RequestMapping("/yythdadd.action")
	public String yythdadd(HttpSession session, Model model)
	{
		BackCustom yythd = new BackCustom();
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df3 = new SimpleDateFormat("yyyy");
		yythd.setBackcreat(df.format(date));
		yythd.setYyid(Integer.parseInt(activeuser.getUnitID()));
		yythd.setYyname(activeuser.getUnitName());
		yythd.setBackstate(37);
		yythd.setBackstatename("未提交");
		yythd.setBackname(df2.format(date) + activeuser.getUnitName() + "退货单");
		model.addAttribute("yythd", yythd);
		model.addAttribute("year", df3.format(date));
		return "business/thd/yythdadd";
	}

	@RequestMapping("/yythdsave.action")
	@ResponseBody
	public ResultInfo yythdsave(Backs backs) throws Exception {
		System.out.println("BackAction.yythdsave backs:" + backs);
		ResultInfo ri = new ResultInfo();
		if (backs.getId() != null) {
			int i = backService.UpdateBacks(backs);
			ri.setType(1);
			ri.setMessage("成功修改" + i + "条数据！");
			ri.setData(backs);
		} else {
			Backs back = backService.InsertBacks(backs);
			if (back.getId() != null) {
				ri.setType(1);
				ri.setMessage("成功添加1条数据！");
				ri.setData(back);
			} else {
				ri.setType(0);
				ri.setMessage("添加数据失败！");
			}
		}
		return ri;
	}

	@RequestMapping("/yythdmanager.action")
	public String yythdmanager(Model model) throws Exception {
		return "/business/thd/yythdmanager";
	}
	
	@RequestMapping("/yythdmanager_result.action")
	@ResponseBody
	public DataGridResultInfo yythdmanager_result(BackCustom backCustom, int page, int rows, HttpSession session) {
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			backCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
		backCustom.setBackstate(37);
		int count = 0;
		try {
			count = backService.FindCountByBackCustom(backCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<BackCustom> list = backService.FindListByBackCustom(backCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yythdedit.action")
	public String yythdedit(String yythdid, Model model) {
		BackCustom custom = backService.FindCusByBackID(yythdid);
		model.addAttribute("yythd", custom);
		return "/business/thd/yythdedit";
	}
	
	@RequestMapping("/yythddelete.action")
	@ResponseBody
	public ResultInfo yythddelete(String thddeleteid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (thddeleteid == null || thddeleteid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		int del_success = 0;
		int del_fail = 0;
		try {
			del_success += backService.DelBacksByID(thddeleteid);
		} catch (Exception e) {
			del_fail++;
			e.printStackTrace();
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	@RequestMapping("/yythdlist_result.action")
	@ResponseBody
	public DataGridResultInfo yythdlist_result(BackCustom backCustom, int page, int rows, HttpSession session) {
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			backCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
		int count = 0;
		try {
			count = backService.FindCountByBackCustom(backCustom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<BackCustom> list = backService.FindListByBackCustom(backCustom);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	@RequestMapping("/yythdedit_thdmxresult.action")
	@ResponseBody
	public DataGridResultInfo yythdedit_thdmxresult(String yythdid, int page, int rows) {
		int count = 0;
		try {
			count = backService.FindBackInfoCountByBackId(yythdid, null ,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<BackInfoCustom> list = backService.FindBackInfoListByBackID(yythdid, null ,null);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yythdmxadd.action")
	public String yythdmxadd(Model model,HttpSession session,String yythdid)
	{
		OrderCustom orderCustom = new OrderCustom();
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			orderCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
		List<OrderCustom> list = orderService.FindListByOrderCustom(orderCustom);
		model.addAttribute("cgdNameList", list);
		model.addAttribute("yythdid", yythdid);
		return "/business/thd/yythdmxadd";
	}
	
	@RequestMapping("/yythdmxadd_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdrkquery_result(HttpSession session,String ordername, int page, int rows,String backid) {
		System.out.println("ordername:"+ordername+"\nbackid:"+backid);
		int count = 0;
		ActiveUser activeUser = (ActiveUser) session.getAttribute("activeUser");
		try {
			count = orderService.FindOrderCountByOrderId(ordername, "35" , null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<OrderInfoCustom> temp = orderService.FindOrderListByOrderID(ordername, "35" , null);
		List<OrderInfoCustom> list = backService.FindOrderListBOrderInfo(temp,backid,activeUser.getUnitID());
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yythdmxaddsubmit.action")
	@ResponseBody
	public ResultInfo yythdmxaddsubmit(BackCustom backCustom, String indexs) {
		ResultInfo ri = new ResultInfo();
		List<Backinfo> backInfos = backCustom.getYythdmxs();
		System.out.println(indexs);
		System.out.println(backInfos.toString());
		String[] ids = indexs.split(",");
		int ins_success = 0;
		int ins_fail = 0;
		for (int i = 0; i < ids.length; i++) {
			try {
				Backinfo backinfo = backInfos.get(Integer.parseInt(ids[i]));
				ins_success += backService.InsertBackInfo(backinfo);
			} catch (Exception e) {
				ins_fail++;
			}
		}
		ri.setMessage("成功添加" + ins_success + "条信息!失败添加" + ins_fail + "条信息！");
		return ri;
	}
	
	@RequestMapping("/yythdmxsave.action")
	@ResponseBody
	public ResultInfo yythdmxsave(BackCustom backCustom, String indexs) {
		ResultInfo ri = new ResultInfo();
		List<Backinfo> backinfos = backCustom.getYythdmxs();
		System.out.println("BackAction.yycgdmxsave  backinfos:" + backinfos.toString());
		System.out.println("BackAction.yycgdmxsave  indexs:"+indexs);
		int ins_success = 0;
		int ins_fail = 0;
		int i, j;
		String[] ids = indexs.split(",");
		for (j = 0; j < ids.length; j++) {
			for (i = 0; i < backinfos.size(); i++) {
				try {
					Backinfo backinfo = backinfos.get(i);
					if (backinfo.getId() == Integer.parseInt(ids[j]))
						ins_success += backService.UpdateBackInfo(backinfo);
				} catch (Exception e) {
					ins_fail++;
				}
			}
		}
		ri.setMessage("成功保存" + ins_success + "条信息!失败保存" + ins_fail + "条信息！");
		return ri;
	}
	
	@RequestMapping("/yythdmxdelete.action")
	@ResponseBody
	public ResultInfo yythdmxdelete(String indexs) {
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
				del_success += backService.DelBackInfoByID(ids[i]);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}
	
	@RequestMapping("/yythdsubmit.action")
	@ResponseBody
	public ResultInfo yythdsubmit(Backs backs) throws Exception {
		ResultInfo ri = new ResultInfo();
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		backs.setBacksub(df.format(date));
		backs.setBackstate(38);;
		int i = backService.UpdateBacks(backs);
		if (i == 1) {
			ri.setType(1);
			ri.setMessage("提交成功！");
		} else {
			ri.setType(0);
			ri.setMessage("提交失败！");
		}
		return ri;
	}
	
	@RequestMapping("/yythdinfo.action")
	public String yythdinfo(String yythdid, Model model) {
		BackCustom custom = backService.FindCusByBackID(yythdid);
		model.addAttribute("yythd", custom);
		return "/business/thd/yythdinfo";
	}
	
	@RequestMapping("/yythddispose.action")
	public String yycgddispose(Model model)
	{  
		BackCustom backCustom = new BackCustom();
		backCustom.setBackstate(38);
		List<BackCustom> list = backService.FindListByBackCustom(backCustom);
		model.addAttribute("thdNameList", list);
		return "business/thd/yythddispose";
	}
	
	@RequestMapping("/yythddispose_result.action")
	@ResponseBody
	public DataGridResultInfo yythddispose_result(HttpSession session,String backname, int page, int rows) {
		ActiveUser activeUser = (ActiveUser)session.getAttribute("activeUser");
		
		int count = 0;
		try {
			count = backService.FindBackInfoCountByBackId(backname, "39",activeUser.getUnitID());
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<BackInfoCustom> list = backService.FindBackInfoListByBackID(backname, "39",activeUser.getUnitID());
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yythddispose_submit.action")
	@ResponseBody
	public ResultInfo yythddispose_submit(String indexs) {
		ResultInfo ri = new ResultInfo();
		if (indexs == null || indexs.equals("")) {
			ri.setType(0);
			ri.setMessage("退货失败，请重新选择需要退货的信息！");
			return ri;
		}
		int th_success = 0;
		int th_fail = 0;
		String[] ids = indexs.split(",");
		for (int i = 0; i < ids.length; i++) {
			try {
				th_success += backService.ThBackInfoByID(ids[i]);
			} catch (Exception e) {
				th_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功退货" + th_success + "条信息。\n退货失败" + th_fail + "条信息");
		return ri;
	}
	
}
