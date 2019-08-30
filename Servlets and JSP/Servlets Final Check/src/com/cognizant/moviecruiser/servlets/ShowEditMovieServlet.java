package com.cognizant.moviecruiser.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruiser.model.Movies;


@WebServlet("/ShowEditMovie")
public class ShowEditMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		long movieId = Long.parseLong(request.getParameter("movieId"));
		Movies movie = movieDao.getMovies(movieId);
		System.out.println(movie);
		request.setAttribute("editMovies", movie);
		request.getServletContext().getRequestDispatcher("/edit-movie.jsp").forward(request, response);
	}

}
