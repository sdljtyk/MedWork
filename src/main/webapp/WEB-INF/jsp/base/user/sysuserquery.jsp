<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>系统用户信息查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>


<script type="text/javascript">
	var sysuserdel = function(id) {
		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#sysuserdelid").val(id);
			jquerySubByFId('sysuserdelForm', sysuserdel_callback, null, "json");
		});
	};
	function sysuserdel_callback(data) {
		$.messager.alert("系统提示消息",data.message);
		sysuserquery();
	}
	var sysuseredit = function(id) {
		var sendUrl = "${baseurl}/user/sysuseredit.action?editid=" + id;
		createmodalwindow("修改用户信息", 800, 400, sendUrl);

	};

	function sysuserview(id) {
		var sendUrl = "${baseurl}/user/sysuserview.action?editid=" + id;
		createmodalwindow("查看用户信息", 800, 500, sendUrl);
	}
	var sysuseradd = function() {
		var sendUrl = "${baseurl}/user/sysuseredit.action";
		createmodalwindow("添加用户信息", 800, 500, sendUrl);
	};

	//工具栏
	var toolbar = [ {
		id : 'sysuseradd',
		text : '添加',
		iconCls : 'icon-add',
		handler : sysuseradd
	} ];

	var frozenColumns;

	var columns = [ [ {
		field : 'usernumber',
		title : '账号',
		width : 180
	}, {
		field : 'username',
		title : '名称',
		width : 130
	}, {
		field : 'groupName',
		title : '用户类型',
		width : 100
	}, {
		field : 'unitName',
		title : '所属单位',
		width : 180
	}, {
		field : 'userstate',
		title : '状态',
		width : 100,
		formatter : function(value, row, index) {
			if(value=='1'){
				return "正常";
			}else{
				return "暂停";
			}
		}
	}, {
		field : 'usercreate',
		title : '创建时间',
		width : 150
	}, {
		field : 'useralter',
		title : '修改	时间',
		width : 150
	}, {
		field : 'opt1',
		title : '修改',
		width : 60,
		formatter : function(value, row, index) {
			return '<a href=javascript:sysuseredit(\'' + row.id + '\')>修改</a>';
		}
	}, {
		field : 'opt2',
		title : '删除',
		width : 60,
		formatter : function(value, row, index) {
			return '<a href=javascript:sysuserdel(\'' + row.id + '\')>删除</a>';
		}
	} ] ];

	function initGrid() {
		$('#sysuserlist').datagrid({
			title : '系统用户列表',
			striped : true,
			url : '${baseurl}/user/sysuserquery_result.action',
			idField : 'id',
			columns : columns,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#sysuserlist').datagrid('unselectRow', index);
			}
		});

	}
	$(function() {
		initGrid();
		
	});

	function sysuserquery() {

		var formdata = $("#sysuserqueryForm").serializeJson();
		$('#sysuserlist').datagrid('unselectAll');
		$('#sysuserlist').datagrid('load', formdata);
	}

	
</script>
</HEAD>
<BODY>
	<div id="sysuserquery_div">
		<form id="sysuserqueryForm" name="sysuserqueryForm" method="post" action="${baseurl}/user/sysuserquery_result.action">
			<TABLE class="table_search">
				<TBODY>
					<TR>
						<TD class="left">用户账号：</td>
						<td><INPUT type="text" name="usernumber" /></TD>
						<TD class="left">用户名称：</TD>
						<td><INPUT type="text" name="username" /></TD>
						
						<TD class="left">用户类型：</TD>
						<td>
							<select name="groupid">
								<option value="0">请选择</option>
								<c:forEach items="${usergroupList}" var="group">
								  <option value="${group.id}">${group.info}</option>
								</c:forEach>
								
							</select>
						</TD>
						<td ><a id="btn" href="#" onclick="sysuserquery()"
							class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
					</TR>


				</TBODY>
			</TABLE>
		</form>
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="sysuserlist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</div>

	<div id="sysuseredit_div"></div>
	<form id="sysuserdelForm" name="sysuserdelForm"
		action="${baseurl}/user/sysuserdel.action" method="post">
		<input type="hidden" id="sysuserdelid" name="delid" />
	</form>

</BODY>
</HTML>

