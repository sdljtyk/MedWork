<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>退货单创建</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	//退货单保存
	function yythdsave() {
		$("#yythdsaveForm").attr("action", "${baseurl}/thd/yythdsave.action");
		jquerySubByFId('yythdsaveForm', yythdsave_callback, null);
	}

	function yythdsave_callback(data) {
		if (data.type == 1) {
			var yythdid = data.data.id
			window.location = '${baseurl}/thd/yythdedit.action?yythdid=' + yythdid;
		}

	}
</script>
</HEAD>
<BODY>

	<form id="yythdsaveForm" name="yythdsaveForm"
		action="${baseurl}/thd/yythdsave.action" method="post">
		<input type="hidden" name="id" value="${yythd.id}" />
		<input type="hidden" name="yyid" value="${yythd.yyid}" />
		<input type="hidden" name="backstate" value="${yythd.backstate}" />
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="70%"
			bgColor=#c4d8ed align=center>
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
									<TD height=30 width="15%" align=right>药品退货年份</TD>
									<TD class=category width="35%">${year}</TD>
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


								<tr>
									<td colspan=4 align=center class=category><a href="#"
										onclick="yythdsave()" class="easyui-linkbutton"
										iconCls='icon-save'>保存</a></td>
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

