<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>

<body>
	<table border="1 px solid black">
		<tr>
			<td>ISBN</td>
			<td>Título</td>
			<td>Categoría</td>
		</tr>

		<c:forEach var="libro" items="${libros}">
			<tr>
				<td>${libro.isbn}</td>
				<td>${libro.titulo}</td>
				<td>${libro.categoria}</td>
				<td><a href="http://localhost:8080/PruebasHibernate/BorrarLibro/${libro.id}">Borrar</a></td>
				<td><a href="http://localhost:8080/PruebasHibernate/EditarLibro/${libro.id}">Editar</a></td>
			</tr>
		</c:forEach>
		
	</table>
					<td><a href="http://localhost:8080/PruebasHibernate/Ejercicio12">Crear</a></td>
	
</body>
