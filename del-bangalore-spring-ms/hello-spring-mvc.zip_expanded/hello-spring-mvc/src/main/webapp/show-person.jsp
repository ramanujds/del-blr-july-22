<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%-- <h1>Hello <%=request.getAttribute("uname") %>..</h1> --%>
<h1>Person Details : </h1>
<h2>Name : ${person.personName}</h2>
<h2>Email : ${person.email}</h2>
<h2>Age : ${person.age}</h2>

</body>
</html>