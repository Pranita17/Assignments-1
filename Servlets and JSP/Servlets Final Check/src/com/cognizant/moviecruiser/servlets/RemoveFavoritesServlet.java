package com.cognizant.moviecruiser.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.FavoritesDaoCollectionImpl;
import com.cognizant.moviecruiser.dao.FavoritesException;
import com.cognizant.moviecruiser.model.Movies;

/**
 * Servlet implementation class RemoveFavoritesServlet
 */
@WebServlet("/RemoveFavorites")
public class RemoveFavoritesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long moviesId = Long.parseLong(request.getParameter("movieId"));
		long userId = 1l;
		FavoritesDaoCollectionImpl favoriteDao = new FavoritesDaoCollectionImpl();
		favoriteDao.removeFavorites(userId, moviesId);
		request.setAttribute("removeFavoriteStatus", true);
		ArrayList<Movies> favoritesList = new ArrayList<Movies>();
		try {
			favoritesList = favoriteDao.getAllFavorites(userId);
			long noOfFavorites = favoriteDao.getUserFavorites().get(userId).getNoOfFavorites();
			request.setAttribute("favoritesList", favoritesList);
			request.setAttribute("noOfFavorites", noOfFavorites);
			request.getServletContext().getRequestDispatcher("/favorites.jsp").forward(request, response);
		} catch (FavoritesException e) {
			request.getServletContext().getRequestDispatcher("/favorites-empty.jsp").forward(request, response);

		}
	}

}
