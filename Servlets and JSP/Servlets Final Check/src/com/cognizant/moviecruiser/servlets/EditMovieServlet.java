package com.cognizant.moviecruiser.servlets;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.moviecruiser.dao.MovieDaoCollectionImpl;
import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.util.DateUtil;


@WebServlet("/EditMovie")
public class EditMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		long id = Long.parseLong(request.getParameter("movieId"));
		String title = request.getParameter("title");
		BigInteger boxOffice = new BigInteger(request.getParameter("boxOffice"));
		boolean active = false;
		if(request.getParameter("active").equals("true")) active = true;
		Date dateOfLaunch = DateUtil.convertToDate(request.getParameter("dateOfLaunch"));
		//System.out.println(request.getParameter("dateOfLaunch"));
		String genre = request.getParameter("genre");
		boolean teaser= Boolean.parseBoolean(request.getParameter("hasTeaser"));
		Movies movieToModify = new Movies(id, title, boxOffice, active, dateOfLaunch, genre, teaser);
		movieDao.modifyMovies(movieToModify);
		System.out.println(movieDao.getMoviesListAdmin());
		request.getServletContext().getRequestDispatcher("/edit-movie-status.jsp").forward(request, response);
	}

}
