<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 확인</title>
</head>
<body>
<h1>로그인 확인</h1>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	if(id.equals(passwd)){//로그인 성공
		session.setAttribute("userID", id);
%>
		<%=id %>님이 로그인했습니다.<br>
		<input type = "button" value = "로그아웃" onclick = "location.href = 'logout.jsp'">
<%
	}else{ //로그인 실패
%>
		<script type="text/javascript">
			alert('로그인 실패');
			history.go(-1);
		</script>	
		
<%		
	}
%>

</body>
</html>