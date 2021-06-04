<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chapter06_01</title>
</head>
<body>
<h2>Chapter06_01</h2>
<p><b>次のうち、1964年のオリンピックで一番金メダルを獲得したのはどの国でしょう？</b></p>
<form action="<%= request.getContextPath() %>/chapter06_01" method="post">
<input type="radio" name="country" value="1" />日本<br/>
<input type="radio" name="country" value="2" />ロシア<br/>
<input type="radio" name="country" value="3" />アメリカ<br/>
<input type="radio" name="country" value="4" />中国<br/>
<input type="submit" value="送信">
</form>
</body>
</html>