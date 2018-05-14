<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html> 
<head>
<title>退货单查看</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">


//工具栏
var toolbar ;

var frozenColumns;

var columns = [ [{
	field : 'ordernumber',
	title : '采购单编号',
	width : 70
},{
	field : 'ghsname',
	title : '供货商',
	width : 100
},{
	field : 'mednumber',
	title : '流水号',
	width : 70
},{
	field : 'medname',
	title : '通用名',
	width : 100
},{
	field : 'medjx',
	title : '剂型',
	width : 90
},{
	field : 'medgg',
	title : '规格',
	width : 90
},{
	field : 'meddw',
	title : '单位',
	width : 50
},{
	field : 'meddj',
	title : '交易价',
	width : 70
},{
	field : 'mednum',
	title : '采购量',
	width : 70
},{
	field : 'medsum',
	title : '采购金额',
	width : 70
},{
	field : 'backnum',
	title : '退货量',
	width : 50,
	
},{
	field : 'backsum',
	title : '退货金额',
	width : 70
},{
	field : 'backreason',
	title : '退货原因',
	width : 90,
	
},{
	field : 'backstatemc',
	title : '退货状态',
	width : 90
}]];

function initGrid(){
	$('#yythdmxlist').datagrid({
		title : '采购药品列表',
		striped : true,
		url : '${baseurl}/thd/yythdedit_thdmxresult.action',
		queryParams:{
			yythdid:'${yythd.id}'
		},
		columns : columns,
		pagination : true,
		rownumbers : true,
		toolbar : toolbar,
		loadMsg:"",
		pageList:[15,30,50,100]
		} );

	}
	$(function() {
		initGrid();
	});

	function yythdmxquery() {
		var formdata = $("#yythdmxForm").serializeJson();
		//alert(formdata);
		$('#yythdmxlist').datagrid('unselectAll');
		$('#yythdmxlist').datagrid('load', formdata);
	}
</script>
</HEAD>
<BODY>

<form id="yythdsaveForm" name="yythdsaveForm" action="${baseurl}/thd/yythdsave.action" method="post">
<input type="hidden" name="yythd.id" value="${yythd.id}"/>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="70%" bgColor=#c4d8ed align=center>
		<TBODY>
			<TR>
				<TD background=${baseurl}/images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;药品退货单</TD>
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
									<TD height=30 width="15%" align=right>退货单编号</TD>
									<TD class=category width="35%">
									${yythd.backnumber}</TD>
									<TD height=30 width="15%" align=right>退货单名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="backname" name="backname"
												value="${yythd.backname}" style="width: 260px" />
										</div>
										<div id="yycgd_mcTip"></div>
									</TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>建单时间：</TD>
									<TD class=category width="35%"><input type="text"
										name="backcreat" style="width: 260px"
										value="${yythd.backcreat}" readonly="readonly" /></TD>
									<TD height=30 width="15%" align=right>提交时间：</TD>
									<TD class=category width="35%"><input type="text"
										name="backsub" style="width: 260px" value="${yythd.backsub}"
										readonly="readonly" /></TD>

								</TR>
								<TR>
									<TD height=30 width="15%" align=right>联系人：</TD>
									<TD class=category width="35%"><input type="text"
										name="yylxr" id="yylxr"
										value="${yythd.yylxr}" style="width: 260px" /></TD>
									<TD height=30 width="15%" align=right>联系电话：</TD>
									<TD class=category width="35%"><input type="text"
										name="backphone" id="yycgd.lxdh" value="${yythd.backphone}"
										style="width: 260px" /></TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>退货单状态：</TD>
									<TD class=category width="35%">${yythd.backstatename}</TD>
									<TD height=30 width="15%" align=right>备注：</TD>
									<TD colspan=3><textarea rows="2" cols="30" name="backother">${yythd.backother}</textarea>
									</TD>
								</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>

<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>
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
 <form id="yythdmxForm" name="yythdmxForm" method="post">
	<input type="hidden" name="indexs" id="indexs" />
	<input type="hidden" name="yycgdCustom.yythdid" value="${yythd.id}" />
			<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="yythdmxlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>

</BODY>
</HTML>

