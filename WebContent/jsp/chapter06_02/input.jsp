<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chapter06_02</title>
</head>
<body>
<h2>Chapter06_02</h2>
<p>犬のデータを入力してください</p>
<form action="<%= request.getContextPath() %>/chapter06_02" method="post">
名前：<input type="text" name="name" /><br/>
年齢：<input type="text" name="age" /><br/>
体重：<input type="text" name="weight" /><br/>
<input type="submit" value="送信">
</form>
</body>
</html>