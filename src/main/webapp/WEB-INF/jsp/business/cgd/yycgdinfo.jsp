<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>采购单查看</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	//工具栏
	var toolbar = [];

	var frozenColumns;

	var columns = [ [ /* {
		field : 'yyname',
		title : '医院',
		width : 100,
		formatter : function(value, row, index) {
			if (value) {
				return value;
			} else {
				return '总计';
			}

		}
	}, */ {
		field : 'mednumber',
		title : '流水号',
		width : 80
	}, {
		field : 'medname',
		title : '药品名称',
		width : 160
	}, {
		field : 'medjx',
		title : '剂型',
		width : 80
	}, {
		field : 'medgg',
		title : '规格',
		width : 70
	}, {
		field : 'meddw',
		title : '单位',
		width : 70
	},{
		field : 'meddj',
		title : '中标价(元)',
		width : 80
	}, {
		field : 'mednum',
		title : '采购量',
		width : 70
	}, {
		field : 'medsum',
		title : '采购金额(元)',
		width : 80
	}, {
		field : 'medmake',
		title : '生产企业',
		width : 180
	}, {
		field : 'ghstatemc',
		title : '采购状态',
		width : 100
	}, {
		field : 'ghsname',
		title : '供货商',
		width : 150
	} ] ];

	function initGrid() {
		$('#yycgdmxlist')
				.datagrid(
						{
							title : '采购药品列表',
							showFooter : true,
							striped : true,
							url : '${baseurl}/cgd/yycgdlist_cgdmxresult.action?yycgdid=${yycgd.id}',
							idField : 'yycgdmxid',//采购药品明细id
							columns : columns,
							pagination : true,
							rownumbers : true,
							toolbar : toolbar,
							loadMsg : "",
							pageList : [ 15, 30, 50, 100 ]
						});

	}
	$(function() {
		initGrid();
	});

	function yycgdmxquery() {
		var formdata = $("#yycgdmxForm").serializeJson();
		$('#yycgdmxlist').datagrid('unselectAll');
		$('#yycgdmxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>

	<form id="yycgdsaveForm" name="yycgdsaveForm"
		action="${baseurl}/cgd/yycgdsave.action" method="post">
		<input type="hidden" name="yycgd.id" value="${yycgd.id}" />
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="70%"
			bgColor=#c4d8ed align=center>
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
								<tr>
									<td height="30" colspan="1" align="center">采购医院</td>
									<td colspan="3" align="center" class=category>${yycgd.yyname}</td>
								</tr>
								<TR>
									<TD height=30 width="15%" align=right>采购单编号：</TD>
									<TD class=category width="35%">${yycgd.ordernumber}</TD>
									<TD height=30 width="15%" align=right>采购单名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="yycgd_mc" name="ordername"
												value="${yycgd.ordername}" style="width: 260px" />
										</div>
										<div id="yycgd_mcTip"></div>
									</TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>建单时间：</TD>
									<TD class=category width="35%">${yycgd.orderctime}</TD>
									<TD height=30 width="15%" align=right>提交时间：</TD>
									<TD class=category width="35%">${yycgd.ordersub}</TD>

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
									<TD colspan=3 ><textarea rows="2" cols="100"	name="orderother">
									${yycgd.orderother}</textarea></TD>

								</TR>

								<tr>
									<td colspan=4 align=center class=category></td>
								</tr>
							</TBODY>
						</TABLE>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>

	<c:if test="${yycgd!=null && yycgd.id!=null}">

		<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%"
			bgColor=#c4d8ed>
			<TBODY>
				<TR>
					<TD background=${baseurl}/images/r_0.gif width="100%">
						<TABLE cellSpacing=0 cellPadding=0 width="100%">
							<TBODY>
								<TR>
									<TD>&nbsp;采购药品列表</TD>
									<TD align=right>&nbsp;</TD>
								</TR>
							</TBODY>
						</TABLE>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
		<form id="yycgdmxForm" name="yycgdmxForm" method="post">
			<input type="hidden" name="indexs" id="indexs" />
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
				<TBODY>
					<TR>
						<TD>
							<table id="yycgdmxlist"></table>
						</TD>
					</TR>
				</TBODY>
			</TABLE>
		</form>
	</c:if>
</BODY>
</HTML>

