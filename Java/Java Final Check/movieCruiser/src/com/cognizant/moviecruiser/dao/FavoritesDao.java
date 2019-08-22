package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;

import com.cognizant.moviecruiser.model.Movies;


public interface FavoritesDao {

	void addFavorites(long userId, long moviesId);
	ArrayList<Movies> getAllFavorites(long userId) throws FavoritesException;
	void removeFavorites(long userId, long moviesId);
}
