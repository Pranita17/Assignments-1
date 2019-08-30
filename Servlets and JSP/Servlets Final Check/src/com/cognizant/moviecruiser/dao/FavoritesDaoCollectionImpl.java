package com.cognizant.moviecruiser.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

import com.cognizant.moviecruiser.model.Favorites;
import com.cognizant.moviecruiser.model.Movies;



public class FavoritesDaoCollectionImpl implements FavoritesDao {

	private static HashMap<Long, Favorites> userFavorites;
	public FavoritesDaoCollectionImpl()
	{
		if(userFavorites == null)
		{
			userFavorites = new HashMap<Long, Favorites>();
		}
		
	}
	
	@Override
	public void addFavorites(long userId, long moviesId){
		MovieDaoCollectionImpl movieDao = new MovieDaoCollectionImpl();
		ArrayList<Movies> tempMovieList = new ArrayList<Movies>();
		//list.add(menuItemDao.getMenuItem(menuItemId));
		Movies m = movieDao.getMovies(moviesId);
		//System.out.println(userCarts.containsKey(userId));
		if(userFavorites.containsKey(userId))
		{
				 Favorites f = userFavorites.get(userId);
				 //System.out.println(c);
				 tempMovieList = f.getMovieList();
				 tempMovieList.add(m);
				 f.setMovieList(tempMovieList);
		}
		else
		{
			tempMovieList.add(m);
			
			Favorites f = new Favorites(tempMovieList, 0);
			//System.out.println(c);
			userFavorites.put(userId, f);
			//System.out.println(userCarts.containsKey(userId));
		}
	}

	@Override
	public ArrayList<Movies> getAllFavorites(long userId) throws FavoritesException {
		// TODO Auto-generated method stub
		if(userFavorites.get(userId) == null || userFavorites.get(userId).getMovieList().isEmpty())
		{
			throw new FavoritesException("Favorites is empty");
		}
		
		Favorites f = userFavorites.get(userId);
		long noOfFavorites = userFavorites.get(userId).getMovieList().size();
		//System.out.println(noOfFavorites);
		userFavorites.get(userId).setNoOfFavorites(noOfFavorites);
		return f.getMovieList();
		
		
	}

	public HashMap<Long, Favorites> getUserFavorites() {
        return userFavorites;
    }

    public void setUserFavorites(HashMap<Long,Favorites> userFavorites) {
        this.userFavorites = userFavorites;
    }

    @Override
	public void removeFavorites(long userId, long moviesId)  {
		// TODO Auto-generated method stub
		if(userFavorites.get(userId) == null) return;
		ArrayList<Movies> favoriteList;
		Favorites f = userFavorites.get(userId);
        //cartList = cartDao.getAllCartItems(1);
        favoriteList = f.getMovieList();
            
            for(Movies m: favoriteList) {
                if(m.getId()==moviesId)
                {
                    favoriteList.remove(m);
                    Favorites x = new Favorites(favoriteList,favoriteList.size());
                    userFavorites.put(userId, x);
                    break;
                }
            }
	
}
}
