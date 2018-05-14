package com.tyk.controller;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Orderinfo;
import com.tyk.pojo.Orders;
import com.tyk.service.BaseService;
import com.tyk.service.OrderService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.GysypmlCustom;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.OrderInfoCustom;

@Controller
@RequestMapping("cgd")
public class OrderAction {

	@Autowired
	private OrderService orderService;
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

	// 采购单列表页面跳转
	@RequestMapping("/yycgdlist.action")
	public String yycgdlist(Model model) throws Exception {
		List<Dicinfo> cgdztList = baseService.FindDicByType("007");
		model.addAttribute("cgdztList", cgdztList);
		return "/business/cgd/yycgdlist";
	}

	// 采购单审核页面跳转
	@RequestMapping("/yycgdreview.action")
	public String yycgdreview(Model model) {
		return "business/cgd/yycgdreview";
	}

	// 采购单列表根据条件查询结果
	@RequestMapping("/yycgdlist_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdlist_result(OrderCustom orderCustom, int page, int rows, HttpSession session) {
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			orderCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
		System.out.println("ordercustom:" + orderCustom);
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

	// 采购单提交审核结果
	@RequestMapping("/yycgdreviewsubmit.action")
	@ResponseBody
	public ResultInfo yycgdreviewsubmit(String indexs, String states) {
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
		for (int i = 0; i < index.length; i++) {
			try {
				if (state[i] != "0")
					upt_success += orderService.UpOrderStateByID(index[i], state[i]);
				;
			} catch (Exception e) {
				upt_fail++;
			}
		}
		ri.setType(1);
		ri.setMessage("成功修改" + upt_success + "条信息。\n修改失败" + upt_fail + "条信息");
		return ri;
	}

	// 采购单详细信息查看跳转页面
	@RequestMapping("/yycgdinfo.action")
	public String yycgdinfo(String yycgdid, Model model) {
		OrderCustom custom = orderService.FindCusByID(yycgdid);
		model.addAttribute("yycgd", custom);
		return "business/cgd/yycgdinfo";
	}

	// 采购单明细结果查询
	@RequestMapping("/yycgdlist_cgdmxresult.action")
	@ResponseBody
	public DataGridResultInfo yycgdlist_cgdmxresult(String yycgdid, int page, int rows) {
		int count = 0;
		try {
			count = orderService.FindOrderCountByOrderId(yycgdid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<OrderInfoCustom> list = orderService.FindOrderListByOrderID(yycgdid, null);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}

	@RequestMapping("/yycgdadd.action")
	public String yycgdadd(HttpSession session, Model model) {

		OrderCustom yycgd = new OrderCustom();
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		System.out.println("OrderAction.yycgdadd.active:" + activeuser);
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df3 = new SimpleDateFormat("yyyy");
		yycgd.setOrderctime(df.format(date));
		yycgd.setYyid(Integer.parseInt(activeuser.getUnitID()));
		yycgd.setYyname(activeuser.getUnitName());
		yycgd.setOrderstate(29);
		yycgd.setOrderstatemc("未提交");
		yycgd.setOrdername(df2.format(date) + activeuser.getUnitName() + "采购单");
		model.addAttribute("yycgd", yycgd);
		model.addAttribute("year", df3.format(date));
		return "/business/cgd/yycgdadd";
	}

	@RequestMapping("/yycgdsave.action")
	@ResponseBody
	public ResultInfo yycgdsave(Orders orders) throws Exception {
		System.out.println("OrderAction.yycgdsave orders:" + orders);
		ResultInfo ri = new ResultInfo();
		if (orders.getId() != null) {
			int i = orderService.UpdateOrders(orders);
			ri.setType(1);
			ri.setMessage("成功修改" + i + "条数据！");
			ri.setData(orders);
		} else {
			Orders order = orderService.InsertOrders(orders);
			if (order.getId() != null) {
				ri.setType(1);
				ri.setMessage("成功添加1条数据！");
				ri.setData(order);
			} else {
				ri.setType(0);
				ri.setMessage("添加数据失败！");

			}

		}
		return ri;

	}

	@RequestMapping("/yycgdmanager")
	public String yycgdmanager(Model model) throws Exception {

		List<Dicinfo> cgdztList = baseService.FindDicByType("007");
		model.addAttribute("cgdztList", cgdztList);
		return "/business/cgd/yycgdmanager";
	}

	@RequestMapping("/yycgdedit.action")
	public String yycgdedit(String yycgdid, Model model) {
		OrderCustom custom = orderService.FindCusByID(yycgdid);
		model.addAttribute("yycgd", custom);
		return "/business/cgd/yycgdedit";
	}

	@RequestMapping("/yycgdmanager_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdmanager_result(OrderCustom orderCustom, int page, int rows, HttpSession session) {
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			orderCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
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

	@RequestMapping("/yycgdmxadd.action")
	public String yycgdmxadd(String yycgdid, Model model) throws Exception {
		model.addAttribute("yycgdid", yycgdid);
		String url = "/business/cgd/yycgdmxadd";
		return MedmlShow(model, url);
	}

	@RequestMapping("/yycgdmxadd_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdmxadd_result(HttpSession session, GysypmlCustom gysypmlCustom, String yycgdid,
			int page, int rows) {
		ActiveUser user = (ActiveUser) session.getAttribute("activeUser");
		int yyid = Integer.parseInt(user.getUnitID());
		int count = 0;
		try {
			count = orderService.FindGhMedCountByGysCustom(gysypmlCustom, yycgdid, yyid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<GysypmlCustom> list = orderService.FindGhMedListByGysCustom(gysypmlCustom, yycgdid, yyid);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}

	@RequestMapping("/yycgdmxaddsubmit.action")
	@ResponseBody
	public ResultInfo yycgdmxaddsubmit(OrderCustom orderCustom, String indexs) {
		ResultInfo ri = new ResultInfo();
		List<Orderinfo> orderInfos = orderCustom.getYycgdmxs();
		System.out.println(indexs);
		String[] ids = indexs.split(",");
		int ins_success = 0;
		int ins_fail = 0;
		for (int i = 0; i < ids.length; i++) {
			try {
				Orderinfo orderinfo = orderInfos.get(Integer.parseInt(ids[i]));
				ins_success += orderService.InsertOrderInfo(orderinfo);
			} catch (Exception e) {
				ins_fail++;
			}
		}
		ri.setMessage("成功添加" + ins_success + "条信息!失败添加" + ins_fail + "条信息！");
		return ri;
	}

	@RequestMapping("/yycgdmxdelete.action")
	@ResponseBody
	public ResultInfo yycgdmxdelete(String indexs) {
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
				del_success += orderService.DelOrderInfoByID(ids[i]);
			} catch (Exception e) {
				del_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}

	@RequestMapping("/yycgdmxsave.action")
	@ResponseBody
	public ResultInfo yycgdmxsave(OrderCustom orderCustom, String indexs) {
		ResultInfo ri = new ResultInfo();
		List<Orderinfo> orderInfos = orderCustom.getYycgdmxs();
		System.out.println("OrderAction.yycgdmxsave  orderInfos:" + orderInfos.toString());
		int ins_success = 0;
		int ins_fail = 0;
		int i, j;
		String[] ids = indexs.split(",");
		for (j = 0; j < ids.length; j++) {
			for (i = 0; i < orderInfos.size(); i++) {
				try {
					Orderinfo orderinfo = orderInfos.get(i);
					if (orderinfo.getId() == Integer.parseInt(ids[j]))
						ins_success += orderService.UpdateOrderInfo(orderinfo);
				} catch (Exception e) {
					ins_fail++;
				}
			}
		}
		ri.setMessage("成功保存" + ins_success + "条信息!失败保存" + ins_fail + "条信息！");
		return ri;
	}

	@RequestMapping("/yycgdsubmit.action")
	@ResponseBody
	public ResultInfo yycgdsubmit(Orders orders) throws Exception {
		ResultInfo ri = new ResultInfo();
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		orders.setOrdersub(df.format(date));
		orders.setOrderstate(30);
		int i = orderService.UpdateOrders(orders);
		if (i == 1) {
			ri.setType(1);
			ri.setMessage("提交成功！");
		} else {
			ri.setType(0);
			ri.setMessage("提交失败！");
		}
		return ri;
	}

	@RequestMapping("/yycgddelete.action")
	@ResponseBody
	public ResultInfo yycgddelete(String cgddeleteid) throws Exception {
		ResultInfo ri = new ResultInfo();
		if (cgddeleteid == null || cgddeleteid.equals("")) {
			ri.setType(0);
			ri.setMessage("删除失败，请重新选择需要删除的信息！");
			return ri;
		}
		int del_success = 0;
		int del_fail = 0;
		try {
			del_success += orderService.DelOrdersByID(cgddeleteid);
		} catch (Exception e) {
			del_fail++;
			e.printStackTrace();
		}
		ri.setType(1);
		ri.setMessage("成功删除" + del_success + "条信息。\n删除失败" + del_fail + "条信息");
		return ri;
	}

	@RequestMapping("/yycgdrkquery.action")
	public String yycgdrkquery(Model model, HttpSession session) throws Exception {
		OrderCustom orderCustom = new OrderCustom();
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if (activeuser.getGroupid().equals("27"))
			orderCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
		List<OrderCustom> list = orderService.FindListByOrderCustom(orderCustom);
		model.addAttribute("cgdNameList", list);
		return "/business/cgd/yycgdrkquery";
	}

	@RequestMapping("/yycgdrkquery_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdrkquery_result(String ordername, int page, int rows) {
		int count = 0;
		try {
			count = orderService.FindOrderCountByOrderId(ordername);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<OrderInfoCustom> list = orderService.FindOrderListByOrderID(ordername, "34");
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}

	@RequestMapping("/yycgdrk_submit.action")
	@ResponseBody
	public ResultInfo yycgdrk_submit(String indexs,HttpSession session) {
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		ResultInfo ri = new ResultInfo();
		if (indexs == null || indexs.equals("")) {
			ri.setType(0);
			ri.setMessage("入库失败，请重新选择需要入库的信息！");
			return ri;
		}
		int rk_success = 0;
		int rk_fail = 0;
		String[] ids = indexs.split(",");
		for (int i = 0; i < ids.length; i++) {
			try {
				rk_success += orderService.RkOrderInfoByID(ids[i],activeuser.getUnitID());
			} catch (Exception e) {
				rk_fail++;
				e.printStackTrace();
			}
		}
		ri.setType(1);
		ri.setMessage("成功入库" + rk_success + "条信息。\n入库失败" + rk_fail + "条信息");
		return ri;
	}

}
