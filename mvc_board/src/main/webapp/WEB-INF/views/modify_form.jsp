<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>글 내용 보기</h2>
<hr>
<table border="1" cellspacing ="0" cellpadding="0" width ="500">
<form action="">
<input type="hidden" name="bid" value="${ content.bid}"> 
	<tr>
		<td>번 호</td>
		<td>$ {content.bid}</td>
	</tr>
		<tr>
		<td>글 쓴 이</td>
		<td><input type="text" name="bname" value="${ content.bname }  " size="60"></td>
	</tr>
		<tr>
		<td>제 목</td>
				<td><input type="text" name="btitle" value="${ content.btitle } "size="60"></td>
		
	</tr>
		<tr>
		<td>내 용</td>
		<td><textarea rows="10" cols="45" name="bcontent" >"$ { content.title } " </textarea></td>
	</tr>
		<tr>
		<td>등 록 일 </td>
		<td>$ {content.bdate}</td>
	</tr>
		<tr>
		<td>조 회 수 </td>
		<td>$ {content.bhit}</td>
	</tr>
	</form>
	<tr>
	
	  <td colspan="2">
	  	 <input type="submit" value="저장" >
	  	 <input type="button" value="취소" onclick="javascript:history.back()">
	  	 <input type="button" value="글목록" onclick="script:window.location.href='list'">
	  	 

	  	 
	  	
	  	</td>
	  <td></td>
	
	
	</tr>




</table>


</body>
</html>