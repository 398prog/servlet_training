<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Chapter05_03</h2>
<p>年齢認証をします。人例を入力してください。</p>
<form action="<%= request.getContextPath() %>/chapter05_03" method="post" >
<input type="text" name="age"><br/>
<input type="submit" value="送信">
</form>
</body>
</html>