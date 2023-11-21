<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file= "top.jsp"%>
Todays Date is :
<% //Scriptlet for initialising and printing date object%>
<% java.util.Date date = new java.util.Date();

    out.println(" ");

    out.println(date);
%>
<%@include file= "bottom.jsp"%>
