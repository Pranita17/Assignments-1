package com.cognizant.truyum.dao;
import java.util.ArrayList;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	
	static CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
	public static void testAddCartItem() {
		cartDao.addCartItem(1, 1);
		ArrayList<MenuItem> cartList;
        
		    Cart c = cartDao.getUserCarts().get((long)1);
            //cartList = cartDao.getAllCartItems(1);
		    cartList = c.getMenuItemList();
            for(MenuItem m : cartList) {
            	System.out.println(m);		
            }
            System.out.println("======================================================================================================");
	}
	
	public static void testGetAllCartItems() {
		//CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
		ArrayList<MenuItem> cartList;
		
        try {
            cartList = cartDao.getAllCartItems(1);
            for(MenuItem m : cartList) System.out.println(m); 
        } catch (CartEmptyException e) { System.out.println(e);
            
        }
	}
	
	public static void testRemoveCartItem() {
		//CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
		System.out.println();
		cartDao.removeCartItem(1, 1);
		try {
		cartDao.getAllCartItems(1);
		} catch (CartEmptyException e) {  System.out.println(e);}
		
	}
	public static void main(String args[])  {		
	    testAddCartItem();
	    testAddCartItem();
		testRemoveCartItem();	
		testGetAllCartItems();
	}
}