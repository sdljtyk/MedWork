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
		
	$(function (){
		//***********按钮**************

		$('#closebtn').linkbutton({   
			iconCls: 'icon-cancel'  
		});
	});
	
	</script>
</HEAD>
<BODY>
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
								<TD height=30 width="15%" align="center">流水号：</TD>
								<TD class=category width="35%">${ypxx.mednumber}</TD>
								<TD height=30 width="15%" align="center">商品名称：</TD>
								<TD class=category width="35%">
									<div>${ypxx.medname}</div>
									<div id="ypxx_mcTip"></div>
								</TD>
							</TR>

							<TR>
								<TD height=30 align="center">剂型：</TD>
								<TD class=category>
									<div>${ypxx.medjx}</div>
									<div id="ypxx_jxTip"></div>
								</TD>
								<TD height=30 align="center">规格：</TD>
								<TD class=category>
									<div>${ypxx.medgg}</div>
									<div id="ypxx_ggTip"></div>
								</TD>
							</TR>

							<TR>
								<TD height=30 align="center">单位：</TD>
								<TD class=category>${ypxx.meddw}</TD>
								<TD height=30 align="center">生产企业名称：</TD>
								<TD class=category>
									<div>${ypxx.medmake}</div>
									<div id="ypxx_scqymcTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 align="center">批准文号：</TD>
								<TD class=category>${ypxx.medpz}</TD>
								<TD height=30 align="center">是否进口药：</TD>
								<TD class=category><c:if test="${ypxx.medjk == '1'}">是</c:if>
									<c:if test="${ypxx.medjk == '0'}">否</c:if></TD>
							</TR>
							<TR>
								<TD height=30 align="center">质量层次：</TD>
								<TD class=category>${ypxx.zlccmc}</TD>
								<TD height=30 align="center">药品交易状态：</TD>
								<TD class=category>${ypxx.jyztmc}</TD>
							</TR>
							<TR>
								<TD height=30 align="center"  width="50%">商品类别：</TD>
								<TD class=category colspan=3  width="50%">${ypxx.lbmc}</TD>
							</TR>
							<TR>
								<TD height=30 align="center">产品说明：</TD>
								<TD class=category colspan=3><textarea rows="6" cols="100"
										id="medabout" name="medabout">${ypxx.medabout}</textarea></TD>
							</TR>
							<tr>
								<td colspan=4 align=center class=category><a id="closebtn"
									href="#" onclick="parent.closemodalwindow()">关闭</a></td>
							</tr>

						</TBODY>
					</TABLE>
				</TD>
			</TR>
		</TBODY>
	</TABLE>

</BODY>
</HTML>

