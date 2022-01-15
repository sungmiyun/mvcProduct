<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/layout.css" type="text/css">
</head>
<body>
<div class="page-main-style">
	<h2>게시판 목록</h2>
	
	<div class="align-right">
		<input type="button" value="글쓰기" onclick="location.href='insert.do'">
	</div>
	
	<c:if test="${count == 0}">
		<div class="align-center">
			 출력할 내용이 없습니다.
		</div>
	</c:if>
	
	<c:if test="${count > 0}">
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="board" items="${list}">
			<tr>
				<td>${board.num}</td>
				<td><a href="detail.do?num=${board.num}">${board.title}</a></td>
				<td>${board.writer}</td>
				<td>${board.reg_date}</td>
			</tr>
			</c:forEach>
		</table>
		<div class="align-center">${pagingHtml}</div>
	</c:if>
	
</div>
</body>
</html>