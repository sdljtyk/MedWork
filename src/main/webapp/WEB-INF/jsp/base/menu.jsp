<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title></title>
<link href="${baseurl}/styles/menu.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="menu" id="MenuContainer">

<c:forEach items="${menulist}" var="menuindex">
 <h4>${menuindex.menuname}</h4>
      <div style="DISPLAY: none">
      <c:forEach items="${menuindex.menus}" var="menuindex2">
         <p id="menu_${menuindex2.menuid}"><a href="${baseurl}/${menuindex2.url}" target="contentFrame" onclick=choosemenu('menu_${menuindex2.menuid}')>${menuindex2.menuname}</a></p>
      </c:forEach>
     </div>

</c:forEach>

</div>

<script src="${baseurl}/scripts/front_menu.js"></script>
 <SCRIPT>
   var active;
   function choosemenu(id){
     document.getElementById(id).className="pick";
     if(active){
	    document.getElementById(active).className="";
	 }
	 active=id;
   }
</SCRIPT>
</body>
</html>

