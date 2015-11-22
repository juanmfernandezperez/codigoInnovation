<!-- Los import -->
<%@ page language="java" %>
<%@ page import = "inno.Mitablaform"%> 
<%@ page import = "inno.Prueba"%> 
<%@ page import =  "java.util.Map"%>


<html xmlns="http://www.w3.org/1999/xhtml"">
<body>
<h1>Consulta a base de datos</h1>

<form action="/carga">
<table border="1">
<tr>
<td>id</td>
<td>Name</td>
<td>Company</td>
<td>Phone</td>
<td>IBAN</td>
</tr>
		<c:forEach items="${mapa}" var="tabla"> 
          <tr><td>${tabla.key}<td><td>${tabla.value.name}<td><td>${tabla.value.company}<td><td>${tabla.value.phone}<td><td>${tabla.value.iban}<td><tr> 
      </c:forEach>
</table>
</form>
</body>
</html>