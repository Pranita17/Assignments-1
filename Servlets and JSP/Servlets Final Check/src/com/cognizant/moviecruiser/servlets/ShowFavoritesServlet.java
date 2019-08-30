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

@WebServlet("/ShowFavorites")
public class ShowFavoritesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long userId = 1l;
		FavoritesDaoCollectionImpl favoriteDao = new FavoritesDaoCollectionImpl();
		ArrayList<Movies> customerFavoriteList = new ArrayList<Movies>();
		try {
			customerFavoriteList = favoriteDao.getAllFavorites(userId);
			Long total = favoriteDao.getUserFavorites().get(userId).getNoOfFavorites();
			request.setAttribute("favoritesList", customerFavoriteList);
			request.setAttribute("noOfFavorites", total);
			request.getServletContext().getRequestDispatcher("/favorites.jsp").forward(request, response);
		} catch (FavoritesException e) {
			request.getServletContext().getRequestDispatcher("/favorites-empty.jsp").forward(request, response);
		}
	}

}
