<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆界面</title>
</head>
<jsp:useBean id="user" scope="page" class="entity.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<body>
<h3>姓名:<%=user.getUsername() %></h3>
<h3>密码:<%=user.getPassword()%></h3>
</body>
</html>