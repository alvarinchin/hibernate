<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<body>
<tr><td>ISBN</td><td>Título</td><td>Categoría</td></tr>
<tr>
<c:forEach var="libro" items="${libros}">
     <td>${libro.isbn}</td><td>${libro.titulo}</td><td>${libro.categoria}</td>
</c:forEach>
</tr>

</body>
