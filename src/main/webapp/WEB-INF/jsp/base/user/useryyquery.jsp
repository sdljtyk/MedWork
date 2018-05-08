<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>医院信息查询</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${baseurl}/js/zTree_v3/css/zTreeStyle/zTreeStyle.css"
	type="text/css">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript"
	src="${baseurl}/js/zTree_v3/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript"
	src="${baseurl}/js/zTree_v3/jquery.ztree.excheck-3.5.js"></script>

<script type="text/javascript">
	var useryydel = function(id) {
		_confirm('您确定要执行删除操作吗?', null, function() {
			$("#useryydelid").val(id);
			jquerySubByFId('useryydelForm', useryydel_callback, null, "json");
		});
	};
	function useryydel_callback(data) {
		$.messager.alert("系统提示消息",data.message);
		useryyquery();
	}
	var useryyedit = function(id) {
		//alert(id);
		var sendUrl = "${baseurl}/user/useryyedit.action?editid=" + id;
		createmodalwindow("修改医院信息", 800, 300, sendUrl);
	};
	function useryyview(id) {
		var sendUrl = "${baseurl}/user/useryyview.action?editid=" + id;
		createmodalwindow("查看医院信息", 800, 300, sendUrl);
	}
	var useryyadd = function() {
		//alert(id);
		var sendUrl = "${baseurl}/user/useryyedit.action";
		createmodalwindow("添加医院信息", 800, 300, sendUrl);
	};

	//工具栏
	var toolbar = [ {
		id : 'useryyadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : useryyadd
	} ];

	var frozenColumns;

	var columns = [ [{
		field : 'id',
		title : '',
		checkbox : true
	},  {
		field : 'yyname',
		title : '名称',
		width : 180
	}, {
		field : 'dqmc',
		title : '所属地区',
		width : 130
	}, {
		field : 'jbmc',
		title : '医院级别',
		width : 100
	},  {
		field : 'yylxr',
		title : '医院联系人',
		width : 100
	}, {
		field : 'yycws',
		title : '医院床位数',
		width : 100
	},{
		field : 'opt1',
		title : '修改',
		width : 60,
		formatter : function(value, row, index) {
			return '<a href=javascript:useryyedit(\'' + row.id + '\')>修改</a>';
		}
	}, {
		field : 'opt2',
		title : '删除',
		width : 60,
		formatter : function(value, row, index) {
			return '<a href=javascript:useryydel(\'' + row.id + '\')>删除</a>';
		}
	}, {
		field : 'opt3',
		title : '详细',
		width : 60,
		formatter : function(value, row, index) {
			return '<a href=javascript:useryyview(\'' + row.id + '\')>查看</a>';
		}
	} ] ];

	function initGrid() {
		$('#useryylist').datagrid({
			title : '医院信息列表',
			striped : true,
			url : '${baseurl}/user/useryyquery_result.action',
			idField : 'id',
			columns : columns,
			pagination : true,
			rownumbers : true,
			toolbar : toolbar,
			loadMsg : "",
			pageList : [ 15, 30, 50, 100 ],
			onClickRow : function(index, field, value) {
				$('#useryylist').datagrid('unselectRow', index);
			}
		});

	}
	$(function() {
		initGrid();
		//tree= new createSyncTree("queryAreaTree_content","queryAreaTree","useryyCustom_dqmc","useryyCustom_dq",setting,null,null,"onClick");
	});

	function useryyquery() {

		var formdata = $("#useryyqueryForm").serializeJson();
		$('#useryylist').datagrid('unselectAll');
		$('#useryylist').datagrid('load', formdata);
	}

	/* //******区域树**********

	var setting = {
		view : {
			selectedMulti : false
		},
		async : {
			enable : true,
			url : "${baseurl}/areaload/async.action",
			datatype : "json",
			autoParam : [ "id=areaid", "name=n", "level=lv" ],
			otherParam : {
				"otherParam" : "zTreeAsyncTest"
			}
		},
		callback : {
			onClick : null
		}
	};
	var tree;
	function showAreaTree() {
		tree.showMenu();
	} */
</script>
</HEAD>
<BODY>
	<div id="useryyquery_div">
		<form id="useryyqueryForm" name="useryyqueryForm" method="post" action="${baseurl}/user/useryyquery_result.action">
			<TABLE class="table_search">
				<TBODY>
					<TR>
						<TD class="left">医院名称：</td>
						<td><INPUT type="text" name="yyname" /></TD>
						<TD class="left">医院类型：</td>
						<td>
						<select name="yyjb">
							<option value="0">请选择</option>
							<c:forEach items="${yylbList}" var="value"> 
							  <option value="${value.id}" <c:if test="${useryy.lb ==value.id }">selected</c:if> >${value.info }</option>
							</c:forEach>
						</select>
						</TD>
						<TD class="left">所属地区：</TD>
						<td><select name="yydpid" style="width: 146px;">
							<option value="0">请选择</option>
							<c:forEach items="${xzqy}" var="value"> 
							  <option value="${value.id}" <c:if test="${useryy.yydqid ==value.id }">selected</c:if> >${value.name }</option>
							</c:forEach>
						</select>
						</td>
						<td colspan=4><a id="btn" href="#" onclick="useryyquery()"
							class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
					</TR>
				</TBODY>
			</TABLE>
		</form>
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="useryylist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</div>

	<div id="useryyedit_div"></div>
	<form id="useryydelForm" name="useryydelForm"
		action="${baseurl}/user/useryydel.action" method="post">
		<input type="hidden" id="useryydelid" name="delid" />
	</form>

</BODY>
</HTML>

