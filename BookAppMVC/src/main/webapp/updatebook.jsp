<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="align:center">
<h1>Update Book</h1>
<form action="updateBook" method="post">
Title: <input type="text" name="title"><br>
bookId: <input type="text" name="bookId"><br>
Author: <input type="text" name="author"><br>
Genre: <input type="text" name="genre"><br>
Price: <input type="text" name="price"><br>
<input type="submit" name="update">
</form>
</div>
</body>
</html>