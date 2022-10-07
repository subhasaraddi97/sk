<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
     <%@ include file="menu.jsp" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
</head>
<body>
<h2>All leads</h2>
<table>
<tr>
  <th>FirstName</th>
  <th>lastname</th>
  <th>email</th>
  <th>mobile</th>
</tr>
<c:forEach var="lead" items="${leads}"> 

<tr>
    <td>${lead.firstname}</td>
    <td>${lead.lastname}</td>
    <td>${lead.email}</td>
    <td>${lead.mobile}</td>
  </tr> 
  </c:forEach>
</table>

</body>
</html>