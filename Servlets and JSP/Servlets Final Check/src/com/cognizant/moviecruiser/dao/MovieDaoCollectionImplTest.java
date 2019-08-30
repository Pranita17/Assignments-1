package com.cognizant.moviecruiser.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

import com.cognizant.moviecruiser.model.Movies;
import com.cognizant.moviecruiser.util.DateUtil;


public class MovieDaoCollectionImplTest {

	static void testGetMoviesListAdmin() {
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> list = movieDao.getMoviesListAdmin();
		for(Movies m: list)
		{
			System.out.println(m);
		}	
	}
	 static void testGetMoviesListCustomer()  {
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> list = movieDao.getMoviesListCustomer();
		System.out.println();
		for(Movies m: list)
		{
			System.out.println(m);
		}
	}
	 static void testModifyMovies() {
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		Date today = new Date();
		Movies item = new Movies(1, "Far from home", new BigInteger("2787965087"),  true, DateUtil.convertToDate("15/03/2019"),"Superhero", true);
		movieDao.modifyMovies(item);
		System.out.println();
		System.out.println(movieDao.getMovies(1));
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMoviesListAdmin();
		testGetMoviesListCustomer(); 
		testModifyMovies();
	}


}
