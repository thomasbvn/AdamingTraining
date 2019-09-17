<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<title>BOOTSTRAP</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
<thead class="thead-light">
    <tr>
      <th scope="col">#</th>
      <th scope="col">FirstName</th>
      <th scope="col">LastName</th>
      <th scope="col">StartDate</th>
    </tr>
  </thead>
  <tbody>
<c:forEach items="${list}" var="emp">
<thead class="thead-dark">
<tr>
<td>${emp.empId}</td>
<td>${emp.firstName}</td>
<td>${emp.lastName}</td>
<td>${emp.startDate}</td>
</tr>
</thead>
</c:forEach>
</table>
</body>
</html>