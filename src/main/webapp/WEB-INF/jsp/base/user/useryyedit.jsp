<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title></title>
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
	$(function() {
		//***********按钮**************
		$('#submitbtn').linkbutton({
			iconCls : 'icon-ok'
		});
		$('#closebtn').linkbutton({
			iconCls : 'icon-cancel'
		});
		//**********表单校验*************
		$.formValidator.initConfig({
			formID : "useryyeditform",
			theme : "Default",
			onError : function(msg, obj, errorlist) {
				//alert(msg);
			}
		});
		//医院名称
		$("#useryy_mc").formValidator({
			onShow : "",
			onCorrect : "&nbsp;"
		}).inputValidator({
			min : 1,
			max : 100,
			onError : "请输入医院名称(最长50个字符)"
		});
		//医院地区
		$("#useryy_dq").formValidator({
			onShow : "",
			onCorrect : "&nbsp;"
		}).inputValidator({
			min : 1,
			max : 100,
			onError : "请选择医院所在地区"
		});

	});
	function useryysave() {
		if ($.formValidator.pageIsValid()) {//表单校验
			jquerySubByFId('useryyeditform', useryysave_callback, null, "json");
		}

	}
	function useryysave_callback(data) {
		$.messager.alert("系统提示消息", data.message);
		parent.closemodalwindow();
		parent.useryyquery();
	}

	/* //******区域树**********

	var setting = {
		view : {
			selectedMulti : false
		},
		data : {
			simpleData : {
				enable : true,
				idKey : "id",
				pIdKey : "parentid",
				rootPId : 0
			}
		},
		callback : {
			onClick : null
		}
	};

	var zNodes;
	var tree;
	function showAreaTree() {
		tree.showMenu();//显示树
	}

	$(document).ready(
			function() {
				//通过ajax获取树的结点
				var sendUrl = "${baseurl}/areaload/sync.action?areaid=1.";
				var ajaxOption = new AjaxOption();
				ajaxOption._initPostRequest(false, sendUrl, "pame", "json");
				_ajaxPostRequest(ajaxOption, '', areaload_callback);
				tree = new createSyncTree("areaTreeContent", "areaTree",
						"useryy_dqmc", "useryy_dq", setting, zNodes, 2,
						"onClick");
			});

	function areaload_callback(redata) {
		try {
			zNodes = redata;
		} catch (e) {
			//alert(e);
		}
		return;
	} */
</script>
</HEAD>
<BODY>
	<form id="useryyeditform" name="useryyeditform"
		action="${baseurl}/user/useryysave.action" method="post">
		<input type="hidden" name="id" value="${useryy.id}" />
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%"
			bgColor=#c4d8ed>
			<TBODY>
				<TR>
					<TD background=images/r_0.gif width="100%">
						<TABLE cellSpacing=0 cellPadding=0 width="100%">
							<TBODY>
								<TR>
									<TD>&nbsp;医院信息</TD>
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
									<TD height=30 width="15%" align=right>医院名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="useryy_mc" name="yyname"
												value="${useryy.yyname}" />
										</div>
										<div id="useryy_mcTip"></div>
									</TD>
									<TD height=30 width="15%" align=right>所属地区：</TD>
									<TD class=category width="35%"><select name="yydqid">
											<option value="0">请选择</option>
											<c:forEach items="${xzqy}" var="value">
												<option value="${value.id}"
													<c:if test="${useryy.yydqid ==value.id }">selected</c:if>>${value.name }</option>
											</c:forEach>
									</select></TD>
								</TR>


								<TR>
									<TD height=30 width="15%" align=right>医院级别：</TD>
									<TD class=category width="35%"><select name="yyjb">
											<option value="">请选择</option>
											<c:forEach items="${yylbList}" var="value">
												<option value="${value.id}"
													<c:if test="${useryy.yyjb ==value.id }">selected</c:if>>${value.info }</option>
											</c:forEach>
									</select></TD>
									</TD>
									<TD height=30 width="15%" align=right>通讯地址：</TD>
									<TD class=category width="35%"><input type="text"
										name="yyaddr" value="${useryy.yyaddr}" /></TD>

								</TR>
								<TR>
									<TD height=30 width="15%" align=right>院办电话：</TD>
									<TD class=category width="35%"><input type="text"
										name="yyphone" value="${useryy.yyphone}" /></TD>
									<TD height=30 width="15%" align=right>院办传真：</TD>
									<TD class=category width="35%"><input type="text"
										name="yycz" value="${useryy.yycz}" /></TD>
								</TR>
								<TR>
									<TD height=30 width="15%" align=right>医院联系人：</TD>
									<TD class=category width="35%"><input type="text"
										name="yylxr" value="${useryy.yylxr}" /></TD>
									<TD height=30 width="15%" align=right>医院床位数：</TD>
									<TD class=category width="35%"><input type="text"
										name="yycws" value="${useryy.yycws}" /></TD>
								</TR>
								<tr>
									<td colspan=4 align=center class=category><a
										id="submitbtn" href="#" onclick="useryysave()">提交</a> <a
										id="closebtn" href="#" onclick="parent.closemodalwindow()">关闭</a>
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

