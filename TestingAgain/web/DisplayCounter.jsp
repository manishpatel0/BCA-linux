<%@page import="JavaPackage.VisitorCounter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file= "top.jsp"%>
Your visitor number is :
<% out.println(VisitorCounter.readCounterValue());
%>
<%@include file= "bottom.jsp"%>