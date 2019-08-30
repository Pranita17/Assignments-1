package com.cognizant.moviecruiser.model;

import java.util.ArrayList;


public class Favorites {

	private ArrayList<Movies> movieList = new ArrayList<Movies>();
	private long noOfFavorites;

	public Favorites(ArrayList<Movies> movieList, long noOfFavorites) {
		this.movieList = movieList;
		this.noOfFavorites = noOfFavorites;
	}
	
	
	public ArrayList<Movies> getMovieList() {
		return movieList;
	}
	public void setMovieList(ArrayList<Movies> movieList) {
		this.movieList = movieList;
	}
	public long getNoOfFavorites() {
		return noOfFavorites;
	}
	public void setNoOfFavorites(long noOfFavorites) {
		this.noOfFavorites = noOfFavorites;
	}
	@Override
	public String toString() {
		return "Favorites [movieList=" + movieList + ", noOfFavorites=" + noOfFavorites + "]";
	}
	
	
	
	
}
