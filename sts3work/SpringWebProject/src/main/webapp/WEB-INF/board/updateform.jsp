<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu&family=Nanum+Pen+Script&family=Noto+Sans+KR:wght@100..900&family=Noto+Serif+KR&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
<div style="margin: 100px 100px; width: 500px;">
   <form action="update" method="post" enctype="multipart/form-data">
   <input type="hidden" name="currentPage" value="${currentPage }">
   <input type="hidden" name="num" value="${dto.num }">
     <table class="table table-bordered">
        <caption align="top"><b>글수정</b></caption>
        <tr>
          <th>작성자</th>
          <td>
          	${dto.writer }
          </td>
        </tr>
        
        <tr>
          <th>제목</th>
          <td>
          <div class="d-inline-flex">
            <input type="text" name="subject" required="required" style="width: 120px;" class="form-control" id="id" value="${dto.subject }">
          </div>
          </td>
        </tr>
        
        <tr>
          <th>사진</th>
          <td>
          <b>사진은 수정이 필요한 경우에만 선택</b>
            <input type="file" name="upload" style="width: 250px;" class="form-control" multiple="multiple">
          </td>
        </tr>
        
        <tr>
          <th>내용</th>
          <td>
          	<textarea style="width: 350px; height: 150px;" name="content" required="required" class="form-control">${dto.content }</textarea>
          </td>
        </tr>
        
        <tr>
          <td colspan="2" align="center">
            <button type="submit" class="btn btn-success" style="width: 120px;">수정</button>
            <button type="button" class="btn btn-success" style="width: 120px;" onclick="history.back()">이전</button>
          </td>
        </tr>
     </table>
   </form>
</div>
</body>
</html>