<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

<body>
<form method="post">
<label for="isbn">ISBN</label>
<input id="isbn" type="text" name="isbn"><br>

<label for="tit">Título</label>
<input id="tit" type="text" name="titulo"><br>

<label for="cat">Categoría</label>
<input id="cat" type="text" name="categoria"><br>

<input type="submit" value="Enviar">
</form>
</body>
