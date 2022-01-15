<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 탈퇴 폼</title>
<link rel = "stylesheet" type = "text/css" href = "${pageContext.request.contextPath}/css/layout.css">
<script type="text/javascript" src = "${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		//이벤트 연결
		$('#delete_form').submit(function(){
			if($('#passwd').val().trim() == ''){
				alert('비밀번호를 입력하세요');
				$('#passwd').val('').focus();
				return false;
		}
		});
	});
</script>
</head>
<body>
<div class="page-main-style">
	<h2>회원 탈퇴 폼</h2>
	<jsp:include page="menu.jsp"/>
	<form id="delete_form" action="delete.do" method="post">
		<ul>
			<li>
				<label for="passwd">비밀번호</label>
				<input type="password" name="passwd" id="passwd" maxlength="12">
			</li>
		</ul>
		<div class="align-center">
			<input type="submit" value="전송">
			<input type="button" value="홈으로" onclick="location.href='main.do'">
		</div>
	</form>
</div>
</body>
</html>