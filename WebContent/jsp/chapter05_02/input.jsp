<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>chapter05_02</title>
</head>
<body>
<article class="main">
<h2>Chapter05_02</h2>
<p>好きな音楽ジャンルを選んでください</p>
<form action="<%= request.getContextPath()%>/chapter05_02" method="post">
<input type="radio" name="music" value="1">ロック<br/>
<input type="radio" name="music" value="2">ポップス<br/>
<input type="radio" name="music" value="3">ジャズ<br/>
<input type="radio" name="music" value="4">クラシック<br/>
<input type="radio" name="music" value="5">演歌<br/>
<input type="submit" value="送信">
</form>
</article>
</body>
</html>