<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 수정</title>
<link rel = "stylesheet" href = "${pageContext.request.contextPath}/css/layout.css">
<script type="text/javascript">
	window.onload = function(){
		var myForm = document.getElementById('register_form');
		myForm.onsubmit = function(){
			var name = document.getElementById('name');
			if(name.value.trim() == ''){
				alert('상품명을 입력하세요');
				name.value = '';
				name.focus();
				return false;
			}
			var price = document.getElementById('price');
			if(price.value.trim() == ''){
				alert('가격을 입력하세요');
				price.value = '';
				price.focus();
				return false;
			}
			var stock = document.getElementById('stock');
			if(stock.value.trim() == ''){
				alert('재고를 입력하세요');
				stock.value = '';
				stock.focus();
				return false;
			}
			var origin = document.getElementById('origin');
			if(origin.value.trim() == ''){
				alert('원산지를 입력하세요');
				origin.value = '';
				origin.focus();
				return false;
			}
			var content = document.getElementById('content');
			if(content.value.trim() == ''){
				alert('내용을 입력하세요');
				content.value = '';
				content.focus();
				return false;
			}
		};
	};
</script>
</head>
<body>

<div class = "page-main-style">
	<h2>상품 정보 수정</h2>
	<form id = "register_form" action = "modify.do" method = "post">
		<input type = "hidden" name = "num" value = "${product.num}">
		<ul>
			<li>
				<label for = "name">상품명</label>
				<input type = "text" name = "name" id = "name" value = "${product.name}">
			</li>
			<li>
				<label for = "price">가격</label>
				<input type = "text" name = "price" id = "price" value = "${product.price}">
			</li>
			<li>
				<label for = "stock">재고</label>
				<input type = "text" name = "stock" id = "stock" value = "${product.stock}">
			</li>
			<li>
				<label for = "origin">원산지</label>
				<input type = "text" name = "origin" id = "origin" value = "${product.origin}">
			</li>
			<li>
				<label for = "content">상품정보</label>
				<textarea rows="5" cols="40" name = "content" id = "content">${product.content }</textarea>
			</li>
		</ul>
		<div class = "align-center">
			<input type = "submit" value = "상품 수정">
			<input type = "button" value = "목록" onclick = "location.href = 'list.do'">
		</div>
	</form>

</div>
</body>
</html>