/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-05-14 10:01:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.business.thd;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class yythdmanager_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>医院退货单维护</title>\r\n");
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
      out.write("var yythddelete = function(id){\r\n");
      out.write("\t_confirm('您确定要删除该退货单吗?',null,\r\n");
      out.write("\t  function(){\r\n");
      out.write("\t\tif(id){\r\n");
      out.write("\t\t\t$(\"#thddeleteid\").val(id);\r\n");
      out.write("\t\t\tjquerySubByFId('yythddeleteForm', yythddelete_callback, null);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\talert_warn(\"请选择要删除的退货单\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t  }\r\n");
      out.write("\t)\r\n");
      out.write("\t\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("function yythddelete_callback(data) {\r\n");
      out.write("\t$.messager.alert(\"系统提示消息\",data.message);\r\n");
      out.write("\tyythdquery();\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function yythdinfo(id){\r\n");
      out.write("\tvar sendUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdinfo.action?yythdid=\"+id;\r\n");
      out.write("\tparent.opentabwindow('退货单查看',sendUrl);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function yythdedit(id){\r\n");
      out.write("\tvar sendUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdedit.action?yythdid=\"+id;\r\n");
      out.write("\tparent.opentabwindow('退货单修改',sendUrl);\r\n");
      out.write("}\r\n");
      out.write("function yythdadd(id){\r\n");
      out.write("\tvar sendUrl = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdadd.action\";\r\n");
      out.write("\tparent.opentabwindow('退货单创建',sendUrl);\r\n");
      out.write("}\r\n");
      out.write("//工具栏\r\n");
      out.write("\r\n");
      out.write("var toolbar = [{\r\n");
      out.write("\tid : 'yythdadd',\r\n");
      out.write("\ttext : '创建退货单',\r\n");
      out.write("\ticonCls : 'icon-add',\r\n");
      out.write("\thandler : yythdadd\r\n");
      out.write("\t}];\r\n");
      out.write("\r\n");
      out.write("var frozenColumns;\r\n");
      out.write("\r\n");
      out.write("var columns = [ [\r\n");
      out.write(" {\r\n");
      out.write("\tfield : 'id',\r\n");
      out.write("\ttitle : '',\r\n");
      out.write("\thidden : true,\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backnumber',\r\n");
      out.write("\ttitle : '退货单编号',\r\n");
      out.write("\twidth : 140\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backname',\r\n");
      out.write("\ttitle : '退货单名称',\r\n");
      out.write("\twidth : 180\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'yylxr',\r\n");
      out.write("\ttitle : '联系人',\r\n");
      out.write("\twidth : 70\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backphone',\r\n");
      out.write("\ttitle : '联系方式',\r\n");
      out.write("\twidth : 100\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backcreat',\r\n");
      out.write("\ttitle : '建单时间',\r\n");
      out.write("\twidth : 130\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backalter',\r\n");
      out.write("\ttitle : '修改时间',\r\n");
      out.write("\twidth : 130\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backsub',\r\n");
      out.write("\ttitle : '提交时间',\r\n");
      out.write("\twidth : 130\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'backstatename',\r\n");
      out.write("\ttitle : '退货单状态', \r\n");
      out.write("\twidth : 100\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'opt4',\r\n");
      out.write("\ttitle : '修改',\r\n");
      out.write("\twidth : 70,\r\n");
      out.write("\tformatter:function(value, row, index){\r\n");
      out.write("\t\treturn '<a href=javascript:yythdedit(\\''+row.id+'\\')>修改</a>';\r\n");
      out.write("\t}\r\n");
      out.write("},{\r\n");
      out.write("\tfield : 'opt5',\r\n");
      out.write("\ttitle : '删除',\r\n");
      out.write("\twidth : 70,\r\n");
      out.write("\tformatter:function(value, row, index){\r\n");
      out.write("\t\treturn '<a href=javascript:yythddelete(\\''+row.id+'\\')>删除</a>';\r\n");
      out.write("\t}\r\n");
      out.write("}]];\r\n");
      out.write("\r\n");
      out.write("function initGrid(){\r\n");
      out.write("\t$('#yythdlist').datagrid({\r\n");
      out.write("\t\ttitle : '退货单列表',\r\n");
      out.write("\t\tstriped : true,\r\n");
      out.write("\t\turl : '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythdmanager_result.action',\r\n");
      out.write("\t\tidField : 'id',//退货单id\r\n");
      out.write("\t\tcolumns : columns,\r\n");
      out.write("\t\tautoRowHeight:true,\r\n");
      out.write("\t\tpagination : true,\r\n");
      out.write("\t\trownumbers : true,\r\n");
      out.write("\t\ttoolbar : toolbar,\r\n");
      out.write("\t\tloadMsg:\"\",\r\n");
      out.write("\t\tpageList:[15,30,50,100],\r\n");
      out.write("\t\tonClickRow : function(index, field, value) {\r\n");
      out.write("\t\t\t\t\t$('#yythdlist').datagrid('unselectRow', index);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tinitGrid();\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\tfunction yythdquery() {\r\n");
      out.write("\t\tvar formdata = $(\"#yythdqueryForm\").serializeJson();\r\n");
      out.write("\t\t$('#yythdlist').datagrid('unselectAll');\r\n");
      out.write("\t\t$('#yythdlist').datagrid('load', formdata);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("    <form id=\"yythdqueryForm\" name=\"yythdqueryForm\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"indexs\" id=\"indexs\" />\r\n");
      out.write("\t\t\t<TABLE  class=\"table_search\">\r\n");
      out.write("\t\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t\t<TD class=\"left\">退货单编号：</td>\r\n");
      out.write("\t\t\t\t\t\t<td><INPUT type=\"text\"  name=\"backnumber\" /></TD>\r\n");
      out.write("\t\t\t\t\t<TD class=\"left\">退货单名称：</TD>\r\n");
      out.write("\t\t\t\t\t\t<td ><INPUT type=\"text\" name=\"backname\" /></td>\r\n");
      out.write("\t\t\t\t\t\t <TD class=\"left\">退货单状态：</TD>\r\n");
      out.write("\t\t\t\t\t\t<td >\r\n");
      out.write("\t\t\t\t\t\t\t未提交\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"btn\" href=\"#\" onclick=\"yythdquery()\" class=\"easyui-linkbutton\" iconCls='icon-search'>查询</a>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</TBODY>\r\n");
      out.write("\t\t\t</TABLE>\r\n");
      out.write("\t   \r\n");
      out.write("\t\t<TABLE border=0 cellSpacing=0 cellPadding=0 width=\"99%\" align=center>\r\n");
      out.write("\t\t\t<TBODY>\r\n");
      out.write("\t\t\t\t<TR>\r\n");
      out.write("\t\t\t\t\t<TD>\r\n");
      out.write("\t\t\t\t\t\t<table id=\"yythdlist\"></table>\r\n");
      out.write("\t\t\t\t\t</TD>\r\n");
      out.write("\t\t\t\t</TR>\r\n");
      out.write("\t\t\t</TBODY>\r\n");
      out.write("\t\t</TABLE>\r\n");
      out.write("\t\t </form>\r\n");
      out.write("\r\n");
      out.write("<form id=\"yythddeleteForm\" name=\"yythddeleteForm\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${baseurl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/thd/yythddelete.action\">\r\n");
      out.write("<input type=\"hidden\" id=\"thddeleteid\" name=\"thddeleteid\" />\r\n");
      out.write("</form>\r\n");
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
