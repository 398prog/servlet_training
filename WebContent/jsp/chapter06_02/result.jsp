<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.Dog"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Chapter06_02</title>
</head>
<body>
<article  class="main">
<h2>Chapter06_02</h2>
<p>
<% Dog dog = (Dog)request.getAttribute("dog"); %>
名前は<%=  dog.getDogName() %><br/>
年齢は<%= dog.getAge() %>歳で、<br/>
体重は<%= dog.getWeight() %>キロです。
</p>
</article>
</body>
</html>