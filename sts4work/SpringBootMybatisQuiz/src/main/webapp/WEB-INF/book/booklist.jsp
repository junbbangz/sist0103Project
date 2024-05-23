<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<div>
	<button type="button" class="btn btn-outline-info" onclick="location.href='form'">책등록</button>
</div>

<div>
<c:if test="${totalCount==0 }">
	<div class="alert alert-info">
		<b>저장된 정보가 없음</b>
	</div>
</c:if>

<c:if test="${totalCount>0 }">
	<div class="alert alert-danger">
		<b>총 ${totalCount }권의 도서가 판매중</b>
	</div>
</c:if>

<br>

<c:forEach var="a" items="${list }">
	<table class="table table-bordered" style="width: 500px;">
		<tr>
			<td>
				<c:if test="${a.bookimage!=null }">
					<img alt="" src="../bookphoto/${a.bookimage }" style="width: 150px;" align="left">
				</c:if>
				
				<c:if test="${a.bookimage==null }">
					<img alt="" src="../bookphoto/noimage.png" style="width: 150px;" align="left">
				</c:if>
				
				<h5>상품명: ${a.bookname }</h5>
				<h5>저자: ${a.writer }</h5>
				<h5>가격: <fmt:formatNumber value="${a.bookprice }" type="currency"/></h5>
				<h4>입고일 <fmt:formatDate value="${a.ipgoday }" pattern="yyyy-MM-dd HH:mm"/></h4>
				<h4>
					<button type="button" class="btn btn-outline-primary" onclick="location.href='updateform?num=${a.num}'">수정</button>
					<button type="button" class="btn btn-outline-danger" onclick="location.href='delete?num=${a.num}'">삭제</button>
				</h4>
			</td>
		</tr>	
	</table>
</c:forEach>
</div>
</body>
</html>