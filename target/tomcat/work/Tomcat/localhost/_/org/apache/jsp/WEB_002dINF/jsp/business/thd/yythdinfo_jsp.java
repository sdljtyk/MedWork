/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-14 12:45:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.business.thd;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yythdinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/jsp/base/common_js.jsp", Long.valueOf(1525939692740L));
    _jspx_dependants.put("/WEB-INF/jsp/base/tag.jsp", Long.valueOf(1524884585001L));
    _jspx_dependants.put("/WEB-INF/jsp/base/common_css.jsp", Long.valueOf(1524820555531L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;

      out.write('\r');
      out.write('\n');
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<html> \r\n");
      out.write("<head>\r\n");
      out.write("<title>退货单查看</title>\r\n");
      out.write("<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/styles/style.css\"/> \r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\"\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/default/easyui.css\">\r\n");
      out.write("<LINK rel=\"stylesheet\" type=\"text/css\"\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/themes/icon.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://localhost:8080/js/formvalidator/style/validator.css\"/> ");
      out.write('\r');
      out.write('\n');
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("<SCRIPT type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/jquery.easyui.min.1.2.2.js\"></SCRIPT>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/locale/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/easyui/plugins/jquery.edatagrid.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.form.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/custom.jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/custom.box.main.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery.ajax.custom.extend.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<SCRIPT type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/menuload.js\"></SCRIPT>\r\n");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryvalidator/formValidator-4.1.3.js\" type=\"text/javascript\" charset=\"UTF-8\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jqueryvalidator/formValidatorRegex.js\" type=\"text/javascript\" charset=\"UTF-8\"></script>  ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("//工具栏\r\n");
      out.write("var toolbar ;\r\n");
      out.write("\r\n");
      out.write("var frozenColumns;\r\n");
      out.write("\r\n");
      out.write("var columns = [ [{\r\n");
      out.write("\tfield : 'ordernumber',\r\n");
      out.write("\ttitle : '采购单编号',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'ghsname',\r\n");
      out.write("\ttitle : '供货商',\r\n");
      out.write("\twidth : 100\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'mednumber',\r\n");
      out.write("\ttitle : '流水号',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'medname',\r\n");
      out.write("\ttitle : '通用名',\r\n");
      out.write("\twidth : 100\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'medjx',\r\n");
      out.write("\ttitle : '剂型',\r\n");
      out.write("\twidth : 90\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'medgg',\r\n");
      out.write("\ttitle : '规格',\r\n");
      out.write("\twidth : 90\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'meddw',\r\n");
      out.write("\ttitle : '单位',\r\n");
      out.write("\twidth : 50\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'meddj',\r\n");
      out.write("\ttitle : '交易价',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'mednum',\r\n");
      out.write("\ttitle : '采购量',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'medsum',\r\n");
      out.write("\ttitle : '采购金额',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backnum',\r\n");
      out.write("\ttitle : '退货量',\r\n");
      out.write("\twidth : 50,\r\n");
      out.write("\t\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backsum',\r\n");
      out.write("\ttitle : '退货金额',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backreason',\r\n");
      out.write("\ttitle : '退货原因',\r\n");
      out.write("\twidth : 90,\r\n");
      out.write("\t\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backstatemc',\r\n");
      out.write("\ttitle : '退货状态',\r\n");
      out.write("\twidth : 90\r\n");
      out.write("}]];\r\n");
      out.write("\r\n");
      out.write("function initGrid(){\r\n");
      out.write("\t$('#yythdmxlist').datagrid({\r\n");
      out.write("\t\ttitle : '采购药品列表',\r\n");
      out.write("\t\tstriped : true,\r\n");
      out.write("\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdedit_thdmxresult.action',\r\n");
      out.write("\t\tqueryParams:{\r\n");
      out.write("\t\t\tyythdid:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("'\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tcolumns : columns,\r\n");
      out.write("\t\tpagination : true,\r\n");
      out.write("\t\trownumbers : true,\r\n");
      out.write("\t\ttoolbar : toolbar,\r\n");
      out.write("\t\tloadMsg:\"\",\r\n");
      out.write("\t\tpageList:[15,30,50,100]\r\n");
      out.write("\t\t} );\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tinitGrid();\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction yythdmxquery() {\r\n");
      out.write("\t\tvar formdata = $(\"#yythdmxForm\").serializeJson();\r\n");
      out.write("\t\t//alert(formdata);\r\n");
      out.write("\t\t$('#yythdmxlist').datagrid('unselectAll');\r\n");
      out.write("\t\t$('#yythdmxlist').datagrid('load', formdata);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("\r\n");
      out.write("<form id=\"yythdsaveForm\" name=\"yythdsaveForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdsave.action\" method=\"post\">\r\n");
      out.write("<input type=\"hidden\" name=\"yythd.id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"/>\r\n");
      out.write("<TABLE border=0 cellSpacing=0 cellPadding=0 width=\"70%\" bgColor=#c4d8ed align=center>\r\n");
      out.write("\t\t<TBODY>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD background=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/r_0.gif width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD>&nbsp;药品退货单</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=right>&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t<TABLE class=\"toptable grid\" border=1 cellSpacing=1 cellPadding=4\r\n");
      out.write("\t\t\t\t\t\talign=center>\r\n");
      out.write("\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>退货单编号</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backnumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>退货单名称：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"backname\" name=\"backname\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"width: 260px\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div id=\"yycgd_mcTip\"></div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>建单时间：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"backcreat\" style=\"width: 260px\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backcreat}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" readonly=\"readonly\" /></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>提交时间：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"backsub\" style=\"width: 260px\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backsub}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\treadonly=\"readonly\" /></TD>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>联系人：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"yylxr\" id=\"yylxr\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.yylxr}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" style=\"width: 260px\" /></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>联系电话：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\"><input type=\"text\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tname=\"backphone\" id=\"yycgd.lxdh\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backphone}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tstyle=\"width: 260px\" /></TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>退货单状态：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD class=category width=\"35%\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backstatename}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD height=30 width=\"15%\" align=right>备注：</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<TD colspan=3><textarea rows=\"2\" cols=\"30\" name=\"backother\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.backother}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</textarea>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<TABLE border=0 cellSpacing=0 cellPadding=0 width=\"100%\" bgColor=#c4d8ed>\r\n");
      out.write("\t\t<TBODY>\r\n");
      out.write("\t\t\t<TR>\r\n");
      out.write("\t\t\t\t<TD background=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/images/r_0.gif width=\"100%\">\r\n");
      out.write("\t\t\t\t\t<TABLE cellSpacing=0 cellPadding=0 width=\"100%\">\r\n");
      out.write("\t\t\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD>&nbsp;采购药品列表</TD>\r\n");
      out.write("\t\t\t\t\t\t\t\t<TD align=right>&nbsp;</TD>\r\n");
      out.write("\t\t\t\t\t\t\t</TR>\r\n");
      out.write("\t\t\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t\t\t</TABLE>\r\n");
      out.write("\t\t\t\t</TD>\r\n");
      out.write("\t\t\t</TR>\r\n");
      out.write("\t\t</TBODY>\r\n");
      out.write("\t</TABLE>\r\n");
      out.write(" <form id=\"yythdmxForm\" name=\"yythdmxForm\" method=\"post\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"indexs\" id=\"indexs\" />\r\n");
      out.write("\t<input type=\"hidden\" name=\"yycgdCustom.yythdid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${yythd.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\r\n");
      out.write("\t\t\t<TABLE border=0 cellSpacing=0 cellPadding=0 width=\"99%\" align=center>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t<table id=\"yythdmxlist\"></table>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /WEB-INF/jsp/base/tag.jsp(7,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/base/tag.jsp(7,0) 'http://localhost:8080'",_el_expressionfactory.createValueExpression("http://localhost:8080",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/base/tag.jsp(7,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("baseurl");
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }
}
