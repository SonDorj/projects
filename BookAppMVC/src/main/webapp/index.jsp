<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookappmvc.model.Book" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookApp</title>
</head>
<body>

<div style="align:right">
<a href="admin.jsp">Admin</a>
</div>
<form action="search" method="post">
<input type="text" placeholder="key" name="searchKey"><br>
<input type="submit" name="search">
<br>
<%List<Book> books = (List<Book>)session.getAttribute("books"); %>
<%if(books!=null)
	for(Book book: books){
		out.print(book+"<br>");
}%>
</form>
</body>
</html>