<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String dbDriver=config.getInitParameter("driver");
String dburl=config.getInitParameter("username");
%>
<h3>驱动程序:<%=dbDriver %></h3>
<h3>连接地址:<%=dburl%></h3>

</body>
</html>