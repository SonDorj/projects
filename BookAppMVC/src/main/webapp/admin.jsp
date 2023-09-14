<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookappmvc.model.Book" import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="align:center">
<h1>Admin Dashboard</h1>
<form>
<a href="addbook.jsp">add</a>
<a href="updatebook.jsp">update</a>
<a href="deletebook.jsp">delete</a>
</form>
<%List<Book> books = (List<Book>)session.getAttribute("books"); %>
<%if(books!=null)
	for(Book book: books){
		out.print(book+"<br>");
}%>
</div>
</body>
</html>