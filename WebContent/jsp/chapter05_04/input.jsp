<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Chapter05_04</h2>
<p><form action="<%= request.getContextPath()%>/chapter05_04" method="post">
メッセージ:<input type="text" name="message"><br/>
<input type="submit" value="送信">
</form>
</body>
</html>