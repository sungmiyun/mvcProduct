<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 상세 정보</title>
<link rel = "stylesheet" href = "${pageContext.request.contextPath}/css/layout.css">
</head>
<body>
<div class = "page-main-style">
	<h2>상품 상세 정보</h2>
	<p>
		상품번호 : ${product.num}<br>
		상품명 : ${product.name}<br>
		가격 : ${product.price}<br>
		재고 : ${product.stock}<br>
		원산지 : ${product.origin}
	</p>
	<span>상품 정보</span>
	<hr size = "1" noshade = "noshade" width = "100%">
	<p>
		${product.content}
	</p>
	<div class = "align-right">
		작성일 : ${product.reg_date}
		<input type = "button" value = "수정" onclick = "location.href = 'modifyForm.do?num=${product.num}'">
		<input type = "button" value = "삭제" onclick = "location.href = 'deleteForm.do?num=${product.num}'">
		<input type = "button" value = "목록" onclick = "location.href = 'list.do'">	
	</div>
	

</div>

</body>
</html>