<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
  <head>
    <title></title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${baseurl}/js/zTree_v3/css/zTreeStyle/zTreeStyle.css" type="text/css">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript" src="${baseurl}/js/zTree_v3/jquery.ztree.core-3.5.js"></script>
<script type="text/javascript" src="${baseurl}/js/zTree_v3/jquery.ztree.excheck-3.5.js"></script>

		<script type="text/javascript">
		
	$(function (){
		var data = ${xzqy}
		$('#qwert').combobox({
		    required:true,
		    multiple:true,
		    valueField: 'id',
		    textField: 'name',
		    data:data
		});
		
		var dqs = ${dqs}
		$('#qwert').combobox('setValues',dqs);
		
		//***********按钮**************
		$('#submitbtn').linkbutton({   
    		iconCls: 'icon-ok'  
		});  
		$('#closebtn').linkbutton({   
    		iconCls: 'icon-cancel'  
		});
		//**********表单校验*************
		$.formValidator.initConfig({
			formID : "usergyseditform",
			theme : "Default",
			onError : function(msg, obj, errorlist) {
				//alert(msg);
			}
		});
		//医院名称
		$("#usergys_mc").formValidator({
			onShow : "",
			onCorrect:"&nbsp;"
		}).inputValidator({
			min : 1,
			max : 100,
			onError : "请输入医院名称(最长50个字符)"
		});
		//医院地区
		$("#adsf").formValidator({
			onShow : "",
			onCorrect:"&nbsp;"
		}).inputValidator({
			min : 1,
			max : 100,
			onError : "请选择医院所在地区"
		});
		
	});
	function usergyssave(){
		if($.formValidator.pageIsValid()){
			var dqids = $('#qwert').combobox('getValues');
			$('#dqids').val(dqids);
			jquerySubByFId('usergyseditform',usergyssave_callback,null,"json");
		}

	}
	function usergyssave_callback(data){
		$.messager.alert("系统提示消息",data.message);
		
		if(data.type == 1){
			parent.closemodalwindow();
			parent.usergysquery();
		}
		
	}
	
	</script>
 </HEAD>
<BODY>
<form id="usergyseditform" name="usergyseditform" action="${baseurl}/user/usergyssave.action" method="post">
<input type="hidden" name="id" value="${usergys.id}"/>
<input type="hidden" name="dqids" id="dqids" value=""/>
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>
		<TBODY>
			<TR>
				<TD background=${baseurl}/images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;供应商信息</TD>
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
								<TD height=30 width="15%" align=right >企业名称：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="usergys_mc" name="ghsname" value="${usergys.ghsname}"   />
								</div>
								<div id="usergys_mcTip"></div>
								</TD>
								<TD height=30 width="15%" align=right> 供货地区：</TD>
								<TD class=category width="35%">
								<input id="qwert" />
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >经营范围：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghsjyfw" value="${usergys.ghsjyfw}"/>
								</TD>
								<TD height=30 width="15%" align=right>企业类别(私营/国营)：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghslb" value="${usergys.ghslb}"/>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >注册资金(万元)：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghszczj" value="${usergys.ghszczj}"/>
								</TD>
								<TD height=30 width="15%" align=right>总资产(万元)：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghszzc" value="${usergys.ghszzc}"/>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >联系人：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghslxr" value="${usergys.ghslxr}"/>
								</TD>
								<TD height=30 width="15%" align=right>联系电话：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghsphone" value="${usergys.ghsphone}"/>
								</TD>
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >企业法人</TD>
								<TD class=category width="35%">
								<input type="text" name="ghsfr" value="${usergys.ghsfr}"/>
								</TD>
								<TD height=30 width="15%" align=right>经营许可证</TD>
								<TD class=category width="35%">
								<input type="text" name="ghsxkz" value="${usergys.ghsxkz}"/>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >联系地址：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghsaddr" value="${usergys.ghsaddr}"/>
								</TD>
								<TD height=30 width="15%" align=right>注册地址：</TD>
								<TD class=category width="35%">
								<input type="text" name="ghshome" value="${usergys.ghshome}"/>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >企业简介：</TD>
								<TD class=category colspan=3>
								<textarea rows="10" cols="80" name="ghsjj">${usergys.ghsjj}</textarea>
								</TD>
								
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >备注：</TD>
								<TD class=category colspan=3>
								<textarea rows="10" cols="80" name="ghsother">${usergys.ghsother}</textarea>
								</TD>
								
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn" href="#" onclick="usergyssave()">提交</a>
								<a id="closebtn" href="#" onclick="parent.closemodalwindow()">关闭</a>
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

