package com.cognizant.moviecruiser.servlets;

import java.awt.MenuItem;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.FavoritesDaoCollectionImpl;
import com.cognizant.moviecruiser.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruiser.model.Movies;

@WebServlet("/AddToFavorites")
public class AddToFavoritesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long userId = 1l;
		long movieId = Long.parseLong(request.getParameter("movieId"));
		FavoritesDaoCollectionImpl favoritesDao = new FavoritesDaoCollectionImpl();
		favoritesDao.addFavorites(userId, movieId);
		MovieDaoCollectionImpl moviesDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> favoritesList = moviesDao.getMoviesListCustomer();
		request.setAttribute("favoritesList", favoritesList);
		request.setAttribute("addFavoriteStatus", true);
		request.getServletContext().getRequestDispatcher("/movie-list-customer.jsp").forward(request, response);
	}

}
