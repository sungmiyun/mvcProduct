<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행지 선택 확인</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	String today = sf.format(date);
%>
오늘 날짜 : <%= today  %> <br>
이름 : <%= request.getParameter("name") %> <br>
출발일 : <%= request.getParameter("leave") %> <br>
도착일 : <%= request.getParameter("arrive") %><br>
여행지 : 
<%
	String[] travels = request.getParameterValues("travel");
	if(travels != null){
		for(int i = 0; i<travels.length; i++){
%>
			<%= travels[i] %>		
<%			
		}
	}else{
%>
		없음!
<%
	}
%>




</body>
</html>