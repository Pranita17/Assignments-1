package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionSqlImplTest {
	
	public static void testAddCartItem() {
		CartDaoCollectionSqlImpl cartDao = new CartDaoCollectionSqlImpl();
		cartDao.addCartItem(1, 1);
		System.out.println("test add cart item");
		
	}
	
	public static void testGetAllCartItems() {
		
		CartDaoCollectionSqlImpl cartDao = new CartDaoCollectionSqlImpl();
		try {
			ArrayList<MenuItem> cart = cartDao.getAllCartItems(1);
			for(MenuItem m: cart) System.out.println(m);
		} catch (CartEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void testRemoveCartItem() {
		
		CartDaoCollectionSqlImpl cartDao = new CartDaoCollectionSqlImpl();
		cartDao.removeCartItem(1, 1);
		System.out.println("test remove cart item");
		
	}
	
	public static void main(String[] args) {
		
		testAddCartItem();
		testGetAllCartItems();
		testRemoveCartItem();
		testGetAllCartItems();
		
	}

}
