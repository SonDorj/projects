<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.bookappmvc.model.Book" import="java.util.List" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! public void jspInit() {
	List<Book> books = new ArrayList<Book>();
	books.add(new Book(101,"Harry Potter","J K Rowling","fiction",499d));
	books.add(new Book(102,"Anne Frank","Anne Frank","history",699d));
	books.add(new Book(103,"The Road not taken","Robert Frost","poetry",799d));
	books.add(new Book(104,"The Hobbit","J R R Tolkien","fiction",899d));
	books.add(new Book(105,"Ozimandias","Percy Shylles","poetry",99d));
	books.add(new Book(102,"The tale of two city","Charles Dicken","history",599d));
	HttpSession session = request.getSession();
	session.setAttribute("books", books);
}
%>
<%response.sendRedirect("index.jsp");%>
</body>
</html>