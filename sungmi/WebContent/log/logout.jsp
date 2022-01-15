<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃</title>
</head>
<body>
<%
	session.invalidate();
%>
<h1>로그아웃</h1>
로그아웃 했습니다.<br>
<input type = "button" value = "로그인" onclick = "location.href = 'loginForm.jsp'">

</body>
</html>