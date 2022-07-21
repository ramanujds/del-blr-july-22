<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="add-person" method="post">
<input type="text" name="personName" placeholder="Enter your name">
<input type="email" name="email" placeholder="Enter your email">
<input type="text" name="age" placeholder="Enter your age">
<button type="submit">Enter</button>

</form>

<div style="background-color: aqua;">
<form action="search-person" method="get">
<input type="search" name="personName" placeholder="Enter your name">
<button type="submit">Enter</button>

</form>
</div>

</body>
</html>