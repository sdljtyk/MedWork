<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title></title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
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
			formID : "ypxxeditform",
			theme : "Default",
			onError : function(msg, obj, errorlist) {
				//alert(msg);
			}
		});
		//通用名
		$("#ypxx_mc").formValidator({
			onShow : "",
			onCorrect : "&nbsp;"
		}).inputValidator({
			min : 1,
			max : 60,
			onError : "请输入商品名称(最长30个字符)"
		});
		//剂型
		$("#ypxx_jx").formValidator({
			onShow : "",
			onCorrect : "&nbsp;"
		}).inputValidator({
			min : 1,
			max : 32,
			onError : "请输入剂型(最长15个字符)"
		});
		//规格
		$("#ypxx_gg").formValidator({
			onShow : "",
			onCorrect : "&nbsp;"
		}).inputValidator({
			min : 1,
			max : 128,
			onError : "请输入规格(最长60个字符)"
		});
	});
	function ypxxsave() {
		if ($.formValidator.pageIsValid()) {
			jquerySubByFId('ypxxeditform', ypxxsave_callback, null, "json");
		}

	}
	function ypxxsave_callback(data) {
		$.messager.alert("系统提示消息", data.message);
		parent.closemodalwindow();
		parent.ypxxquery();

	}
</script>
</HEAD>
<BODY>
	<form id="ypxxeditform" name="ypxxeditform"
		action="${baseurl}/ypml/ypxxsave.action" method="post">
		<input type="hidden" name="id" value="${ypxx.id}" />
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%"
			bgColor=#c4d8ed>
			<TBODY>
				<TR>
					<TD background=images/r_0.gif width="100%">
						<TABLE cellSpacing=0 cellPadding=0 width="100%">
							<TBODY>
								<TR>
									<TD>&nbsp;药品信息</TD>
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
									<TD height=30 width="15%" align=right>流水号：</TD>
									<TD class=category width="35%"><input type="text"
										id="ypxx_mc" name="mednumber" value="${ypxx.mednumber}" />

									</TD>
									<TD height=30 width="15%" align=right>商品名称：</TD>
									<TD class=category width="35%">
										<div>
											<input type="text" id="ypxx_mc" name="medname"
												value="${ypxx.medname}" />
										</div>
										<div id="ypxx_mcTip"></div>
									</TD>
								</TR>

								<TR>
									<TD height=30 align=right>剂型：</TD>
									<TD class=category>
										<div>
											<input type="text" id="ypxx_jx" name="medjx"
												value="${ypxx.medjx}" />
										</div>
										<div id="ypxx_jxTip"></div>
									</TD>
									<TD height=30 align=right>规格：</TD>
									<TD class=category>
										<div>
											<input type="text" id="ypxx_gg" name="medgg"
												value="${ypxx.medgg}" />
										</div>
										<div id="ypxx_ggTip"></div>
									</TD>
								</TR>

								<TR>

									<TD height=30 align=right>生产企业名称：</TD>
									<TD class=category>
										<div>
											<input type="text" id="ypxx_scqymc" name="medmake"
												value="${ypxx.medmake}" />
										</div>
										<div id="ypxx_scqymcTip"></div>
									</TD>
									<TD height=30 align=right>单位：</TD>
									<TD class=category><input type="text" id="ypxx.dw"
										name="meddw" value="${ypxx.meddw}" /></TD>
								</TR>

								<TR>
									<TD height=30 align=right>批准文号：</TD>
									<TD class=category><input type="text" id="ypxx.pzwh"
										name="medpz" value="${ypxx.medpz}" /></TD>
									<TD height=30 align=right>是否进口药：</TD>
									<TD class=category><input type="radio" name="medjk"
										value="1" <c:if test="${ypxx.medjk == '1'}">checked</c:if> />是
										<input type="radio" name="medjk" value="0"
										<c:if test="${ypxx.medjk == '0'}">checked</c:if> />否</TD>
								</TR>


								<TR>
									<TD height=30 align=right>质量层次：</TD>
									<TD class=category><select id="ypxx.zlcc" name="medzl">
											<option value="">请选择</option>
											<c:forEach items="${ypzlccList}" var="value">
												<option value="${value.id}"
													<c:if test="${ypxx.medzl == value.id}">selected</c:if>>${value.info}</option>
											</c:forEach>
									</select></TD>
									<TD height=30 align=right>药品交易状态：</TD>
									<TD class=category><select id="ypxx.jyzt" name="medstate">
											<option value="">请选择</option>
											<c:forEach items="${ypjyztList}" var="value">
												<option value="${value.id}"
													<c:if test="${ypxx.medstate == value.id}">selected</c:if>>${value.info}</option>
											</c:forEach>
									</select></TD>
								</TR>
								<TR>
									<TD height=30 align=right width="50%">药品类别：</TD>
									<TD class=category width="50%"><select id="ypxx.yplb"
										name="medclass">
											<option value="">请选择</option>
											<c:forEach items="${yplbList}" var="value">
												<option value="${value.id}"
													<c:if test="${ypxx.medclass == value.id}">selected</c:if>>${value.info}</option>
											</c:forEach>
									</select></TD>
								</TR>

								<TR>
									<TD height=30 align=right>产品说明：</TD>
									<TD class=category colspan=3><textarea rows="6" cols="100"
											id="ypxx.cpsm" name="medabout">${ypxx.medabout}</textarea></TD>
								</TR>
								<tr>
									<td colspan=4 align=center class=category><a
										id="submitbtn" href="#" onclick="ypxxsave()">提交</a> <a
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

