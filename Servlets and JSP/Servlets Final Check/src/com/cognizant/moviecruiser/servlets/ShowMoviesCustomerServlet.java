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


@WebServlet("/ShowMoviesCustomer")
public class ShowMoviesCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> movies = movieDao.getMoviesListCustomer();
		request.getSession().setAttribute("moviesList", movies);
		request.getServletContext().getRequestDispatcher("/movie-list-customer.jsp").forward(request, response);
	}

}
