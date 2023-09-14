package com.bookappmvc.controllers;

import java.io.IOException;
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
@WebServlet("/updateBook")
public class updateBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateBookServlet() {
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
		
		HttpSession session = request.getSession();
		List<Book> books = new ArrayList<Book>();
		List<Book >ifbooks = (List<Book>) session.getAttribute("books");
		if(ifbooks!=null) {
			for(Book book: ifbooks) {
				if(book.getBookId()==bookId) {
					book.setAuthor(author);
					book.setTitle(title);
					book.setGenre(genre);
					book.setPrice(price);
				}
			}
		}
		session.setAttribute("books", ifbooks);
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
