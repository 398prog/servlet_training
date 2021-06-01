<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chapter05_01</title>
</head>
<body>
<h2>Chapter05_01</h2>

<form action="<%= request.getContextPath()%>/chapter05_01" method="get">
<p>お名前：
<input type="text" name="name" />
</p>
<p>
ひとこと：
<input type="text" name="comment" />
</p>
<input type="submit" value="送信" />
</form>

</body>

</html>