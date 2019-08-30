package com.cognizant.moviecruiser.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruiser.model.Movies;


/**
 * Servlet implementation class ShowMoviesAdminServlet
 */
@WebServlet("/ShowMoviesAdmin")
public class ShowMoviesAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieDaoCollectionImpl moviesDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> movie = moviesDao.getMoviesListAdmin();
		request.getSession().setAttribute("moviesList", movie);
		request.getServletContext().getRequestDispatcher("/movie-list-admin.jsp").forward(request, response);
		
	}

}
