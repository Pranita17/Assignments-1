package com.cognizant.moviecruiser.dao;

import java.util.ArrayList;

import com.cognizant.moviecruiser.model.Favorites;
import com.cognizant.moviecruiser.model.Movies;

public class FavoritesDaoCollectionImplTest{

	static FavoritesDaoCollectionImpl favoritesDao = new FavoritesDaoCollectionImpl();

	public static void testAddFavorites() {
		favoritesDao.addFavorites(1, 1);
		ArrayList<Movies> favoritesList;
        
		    Favorites f = favoritesDao.getUserFavorites().get((long)1);
            //cartList = cartDao.getAllCartItems(1);
		    favoritesList = f.getMovieList();
		    System.out.println("Movie added to favorites successfully");
            for(Movies m : favoritesList){
            	System.out.println(m);
            }
            System.out.println("=====================================================================================");
            
	}

	public static void testGetAllFavorites() {
		//FavoritesDaoCollectionImpl FavoritesDao = new FavoritesDaoCollectionImpl();
		ArrayList<Movies> favoritesList;
        try {
            favoritesList = favoritesDao.getAllFavorites(1);
            System.out.println("\n\nMovies\n\n");
            System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Movie ID","Title","Active","Date of Launch","Genre","Has Teaser"));
            System.out.println("============================================================================================");
            System.out.println();
            for(Movies m : favoritesList){ 
            	System.out.println(m);
            }
            System.out.println("\n============================================================================================");

            System.out.println("\nNo. of favorites : "+favoritesList.size());
            
        } catch (FavoritesException e) { 
        	System.out.println(e);
        }
	}
	public static void testRemoveFavorites() {
		//FavoritesDaoCollectionImpl favoritesDao = new FavoritesDaoCollectionImpl();
		System.out.println();
		favoritesDao.removeFavorites(1, 1);
		try {
		System.out.println("Movie removed from favourites successfully");
		favoritesDao.getAllFavorites(1);
		} catch (FavoritesException e) {  System.out.println(e);}
		
	}
	
	
/*	public static void testAddFavorite(long moviesId) {
		//FavoritesDaoCollectionImpl favoritesDao = new FavoritesDaoCollectionImpl();
		favoritesDao.addFavorites(1,moviesId);
		ArrayList<Movies> favoritesList;
        
		    Favorites f = favoritesDao.getUserFavorites().get((long)1);
            //cartList = cartDao.getAllCartItems(1);
		    favoritesList = f.getMovieList();
            //for(Movies m : favoritesList) System.out.println(m);
	}*/

	
	public static void main(String args[]) {
		testAddFavorites();
		testAddFavorites();
		testAddFavorites();
		testGetAllFavorites();
		testRemoveFavorites(); 
		testGetAllFavorites();

		
	}

}
