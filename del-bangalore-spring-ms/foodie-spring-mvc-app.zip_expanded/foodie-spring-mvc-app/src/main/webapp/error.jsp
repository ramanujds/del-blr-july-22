<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Error <%=request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE) %></h1>
<h2><%=exception.getMessage() %></h2>
</body>
</html>