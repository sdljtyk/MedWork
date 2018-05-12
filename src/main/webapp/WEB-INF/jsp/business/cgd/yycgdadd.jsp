<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>采购单创建</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">

//采购单保存
function yycgdsave(){
	$("#yycgdsaveForm").attr("action","${baseurl}/cgd/yycgdsave.action");
	jquerySubByFId('yycgdsaveForm', yycgdsave_callback, null);
}
function yycgdsave_callback(data) {
	//如果成功刷新页面，重新跳转至修改页面
	if(data.type == 1){
		window.location='${baseurl}/cgd/yycgdedit.action?yycgdid='+data.data.id;
	} 
	
}

</script>
</HEAD>
<BODY>

<form id="yycgdsaveForm" name="yycgdsaveForm" action="${baseurl}/cgd/yycgdsave.action" method="post">
<input type="hidden" name="id" value="${yycgd.id}"/>
<input type="hidden" name="yyid" value="${yycgd.yyid}"/>
<input type="hidden" name="orderstate" value="${yycgd.orderstate}"/>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="70%" bgColor=#c4d8ed align=center>
		<TBODY>
			<TR>
				<TD background=${baseurl}/images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;药品采购单</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							<TR>
								<TD height=30 width="15%" align=right>药品采购年份</TD>
								<TD class=category width="35%">
								${year}
								</TD>
								<TD height=30 width="15%" align=right >采购单名称：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="yycgd_mc" name="ordername" value="${yycgd.ordername}"  style="width:260px" />
								</div>
								<div id="yycgd_mcTip"></div>
								</TD>
							</TR>
							<TR>
									<TD height=30 width="15%" align=right>建单时间：</TD>
									<TD class=category width="35%">
										<input type="text" name="orderctime" style="width: 260px" value="${yycgd.orderctime}"  readonly="readonly"/> </TD>
									<TD height=30 width="15%" align=right>提交时间：</TD>
									<TD class=category width="35%" >
										<input type="text" name="ordersub" style="width: 260px" value="${yycgd.ordersub}"  readonly="readonly"/>
									</TD>

								</TR>
								<TR>
									<TD height=30 width="15%" align=right>联系人：</TD>
									<TD class=category width="35%"><input type="text"
										name="ordercreateperson" id="yycgd.lxr"
										value="${yycgd.ordercreateperson}" style="width: 260px" /></TD>
									<TD height=30 width="15%" align=right>联系电话：</TD>
									<TD class=category width="35%"><input type="text"
										name="orderphone" id="yycgd.lxdh" value="${yycgd.orderphone}"
										style="width: 260px" /></TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>采购单状态：</TD>
									<TD class=category width="35%">${yycgd.orderstatemc}</TD>
									<TD height=30 width="15%" align=right>审核时间：</TD>
									<TD class=category width="35%">${yycgd.orderwatime}</TD>
								</TR>

								<TR>
									<TD height=30 width="15%" align=right>备注：</TD>
									<TD colspan=3 ><textarea rows="2" cols="100" name="orderother">
									${yycgd.orderother}</textarea></TD>

								</TR>
							
							<tr>
							  <td colspan=4 align=center class=category>
								<a  href="#" onclick="yycgdsave()" class="easyui-linkbutton" iconCls='icon-save'>保存</a>
								
							  </td>
							</tr>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>

</BODY>
</HTML>

