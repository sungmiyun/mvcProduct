<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>여행지 선택 폼</title>
<script type="text/javascript">
	window.onload = function(){
		var travel_form = document.getElementById('travel_form');
		
		travel_form.onsubmit = function(){
			var name = document.getElementById('name');
			if(name.value.trim() == ''){
				alert('이름을 입력하세요');
				name.value='';
				name.focus();
				return false;
			}
			var leave = document.getElementById('leave');
			if(leave.value.trim() == ''){
				alert('출발일을 입력하세요');
				leave.value='';
				leave.focus();
				return false;
			}
			var arrive = document.getElementById('arrive');
			if(arrive.value.trim() == ''){
				alert('도착일을 입력하세요');
				arrive.value='';
				arrive.focus();
				return false;
			}
		};
	};
</script>
</head>
<body>
<form id="travel_form" action="travelPro.jsp" method="post">
	이름 <input type="text" name="name" id="name"> <br>
	출발일 <input type="date" name="leave" id="leave"> <br>
	도착일 <input type="date" name="arrive" id="arrive"> <br>
	여행지 선택
	<input type="checkbox" name="travel" value="베를린"> 베를린
	<input type="checkbox" name="travel" value="뉴욕">뉴욕
	<input type="checkbox" name="travel" value="런던">런던
	<input type="checkbox" name="travel" value="파리">파리
	<br>
	<input type="submit" value="전송">
</form>

</body>
</html>