<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<style type="text/css">
	form{
		width : 500px;
		margin : 0 auto;
	}
	ul{
		list-style : none;
	}
	label{
		width : 130px;
		float : left;
		padding-left : 50px;
	}
	div{
		text-align : center;
	}
</style>
<script type="text/javascript">
	window.onload = function(){
		var login_form = document.getElementById('login_form');
		login_form.onsubmit = function(){
			var id = document.getElementById('id');
			if(id.value.trim() == ''){
				alert('아이디를 입력하세요!');
				id.value = '';
				id.focus();
				return false;
			}
			var passwd = document.getElementById('passwd');
			if(passwd.value.trim() == ''){
				alert('비밀번호를 입력하세요!');
				passwd.value = '';
				passwd.focus();
				return false;
			}
			
		};
	};
</script>
</head>
<body>
<form id = "login_form" action = "loginPro.jsp" method= "post">
	<fieldset>
		<legend>로그인</legend>
		<ul>
			<li>
				<label for = "id">아이디</label>
				<input type = "text" name = "id" id = "id">
			</li>
			<li>
				<label for = "passwd">비밀번호</label>
				<input type = "password" name = "passwd" id = "passwd">
			</li>
		</ul>
		<div><input type = "submit" value = "로그인"></div>
	</fieldset>

</form>
</body>
</html>