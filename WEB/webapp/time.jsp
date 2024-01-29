<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	java.util.Date d = new java.util.Date();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 안녕! 홈페이지 방문을 환영합니다. (동적인 페이지)<br>
 지금 몇시? <%=d.toString() %>
</body>
</html>