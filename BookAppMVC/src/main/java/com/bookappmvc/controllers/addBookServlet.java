package com.bookappmvc.controllers;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bookappmvc.model.Book;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class addBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String genre = request.getParameter("genre");
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		double price = Double.parseDouble(request.getParameter("price"));
		
		Book book = new Book();
		book.setBookId(bookId);
		book.setTitle(title);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setPrice(price);
		
		HttpSession session = request.getSession();
		List<Book> books = new ArrayList<Book>();
		List<Book >ifbooks = (List<Book>) session.getAttribute("books");
		if(ifbooks!=null)
			books.addAll(ifbooks);
		books.add(book);
		session.setAttribute("books", books);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
