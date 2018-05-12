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

import com.tyk.pojo.Dicinfo;
import com.tyk.pojo.Medinfo;
import com.tyk.pojo.Orders;
import com.tyk.service.BaseService;
import com.tyk.service.OrderService;
import com.tyk.util.DataGridResultInfo;
import com.tyk.util.ResultInfo;
import com.tyk.vo.ActiveUser;
import com.tyk.vo.OrderCustom;
import com.tyk.vo.OrderInfoCustom;




@Controller
@RequestMapping("cgd")
public class OrderAction {

	@Autowired
	private OrderService orderService;
	@Autowired
	private BaseService baseService;
	
	//采购单列表页面跳转
	@RequestMapping("/yycgdlist.action")
	public String yycgdlist(Model model) throws Exception{
		List<Dicinfo> cgdztList = baseService.FindDicByType("007");
		model.addAttribute("cgdztList", cgdztList);
		return "/business/cgd/yycgdlist";
	}
	
	//采购单审核页面跳转
	@RequestMapping("/yycgdreview.action")
	public String yycgdreview(Model model)
	{
		return "business/cgd/yycgdreview";
	}
	
	//采购单列表根据条件查询结果
	@RequestMapping("/yycgdlist_result.action")
	@ResponseBody
	public DataGridResultInfo yycgdlist_result(OrderCustom orderCustom,int page,int rows,HttpSession session)
	{
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		if(activeuser.getGroupid().equals("27"))
			orderCustom.setYyid(Integer.parseInt(activeuser.getUnitID()));
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
	
	//采购单提交审核结果
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
	
	
	//采购单详细信息查看跳转页面
	@RequestMapping("/yycgdinfo.action")
	public String yycgdinfo(String yycgdid,Model model)
	{
		OrderCustom custom = orderService.FindCusByID(yycgdid);
		model.addAttribute("yycgd", custom);
		return "business/cgd/yycgdinfo";
	}
	
	
	//采购单明细结果查询
	@RequestMapping("/yycgdlist_cgdmxresult.action")
	@ResponseBody
	public DataGridResultInfo yycgdlist_cgdmxresult(String yycgdid,int page,int rows)
	{
		int count = 0;
		try {
			count = orderService.FindOrderCountByOrderId(yycgdid);
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<OrderInfoCustom> list = orderService.FindOrderListByOrderID(yycgdid);
		ResultInfo ri = new ResultInfo(1, "查询成功");
		DataGridResultInfo queryResultInfo = new DataGridResultInfo(ri);
		queryResultInfo.setRows(list);
		queryResultInfo.setTotal(count);
		return queryResultInfo;
	}
	
	@RequestMapping("/yycgdadd.action")
	public String yycgdadd(HttpSession session,Model model)
	{

		OrderCustom yycgd = new OrderCustom();
		ActiveUser activeuser = (ActiveUser) session.getAttribute("activeUser");
		System.out.println("OrderAction.yycgdadd.active:"+activeuser);
		Date date=new Date();    
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat df2 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat df3 = new SimpleDateFormat("yyyy");
		yycgd.setOrderctime(df.format(date));
		yycgd.setYyid(Integer.parseInt(activeuser.getUnitID()));
		yycgd.setYyname(activeuser.getUnitName());
		yycgd.setOrderstate(27);
		yycgd.setOrderstatemc("未提交");
		yycgd.setOrdername(df2.format(date)+activeuser.getUnitName()+"采购单");
		model.addAttribute("yycgd", yycgd);
		model.addAttribute("year",df3.format(date));
		return "/business/cgd/yycgdadd";
	}
	
	@RequestMapping("/yycgdsave.action")
	@ResponseBody
	public ResultInfo yycgdsave(Orders orders) throws Exception{
		System.out.println("OrderAction.yycgdsave orders:"+orders);
		ResultInfo ri = new ResultInfo();
		if(orders.getId() != null){
			int i = orderService.UpdateOrders(orders);
			ri.setType(1);
			ri.setMessage("成功修改"+i+"条数据！");
		}else{
			Orders order = orderService.InsertOrders(orders);
			if(order.getId()!=null) {
				ri.setType(1);
				ri.setMessage("成功添加1条数据！");
				ri.setData(order);
			}else {
				ri.setType(0);
				ri.setMessage("添加数据失败！");
				
			}
		
		}
		return ri;
		
	}
	
	
}
