<%@page import="com.del.app.hellospring.model.Person"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>

<% List<Person> list = (List<Person>)request.getAttribute("list");%>

<table class="table  table-hover table-striped" border="1">
<thead>
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Age</th>
</tr>
</thead>
<tbody>
<%-- <%
for(Person p:list){
	out.println("<tr>");
		out.println("<td>"+p.getPersonName()+"</td>");
		out.println("<td>"+p.getEmail()+"</td>");
		out.println("<td>"+p.getAge()+"</td>");
	
	out.println("</tr>");
}
%> --%>

<c:forEach items="${list}" var="p"> 
<tr>
<td>${p.personName}</td>
<td>${p.email}</td>
<td>${p.age}</td>
</tr>
</c:forEach>
</tbody>
</table>

</body>
</html>