package com.cognizant.truyum.dao;
import java.util.ArrayList;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImplTest {
	
	static CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
	public static void testAddCartItem() {
		cartDao.addCartItem(1, 1);
		ArrayList<MenuItem> cartList;
        System.out.println(String.format("%-15s %-25s %-15s %-15s %-15s %-15s %-15s", "ID","Name","Price","Active","Date of Launch","Category","Free Delivery"));
        System.out.println("===============================================================================================================================");

		    Cart c = cartDao.getUserCarts().get((long)1);
            //cartList = cartDao.getAllCartItems(1);
		    cartList = c.getMenuItemList();
            for(MenuItem m : cartList) {
            	System.out.println(m);		
            }
            System.out.println("Item added to Cart successfully");
            System.out.println("===============================================================================================================================");


	}
	
	public static void testGetAllCartItems() {
		//CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
		ArrayList<MenuItem> cartList;
        System.out.println(String.format("\n\n%-15s %-25s %-15s %-15s %-15s %-15s %-15s", "ID","Name","Price","Active","Date of Launch","Category","Free Delivery"));
        System.out.println("===============================================================================================================================");

        try {
            cartList = cartDao.getAllCartItems(1);
            double total = 0;
            for(MenuItem m : cartList) {System.out.println(m);
            total += m.getPrice();} 
            System.out.println("===============================================================================================================================");
            System.out.println("Total: "+total);
        } catch (CartEmptyException e) { System.out.println(e);
            
        }
	}
	
	public static void testRemoveCartItem() {
		//CartDaoCollectionImpl cartDao = new CartDaoCollectionImpl();
		System.out.println();
		cartDao.removeCartItem(1, 1);
		try {
			System.out.println("Item removed from Cart Successfully");
            System.out.println("===============================================================================================================================");

		cartDao.getAllCartItems(1);
		} catch (CartEmptyException e) {  System.out.println(e);}
		
	}
	public static void main(String args[])  {		
	    testAddCartItem();
	    //testAddCartItem();
		testGetAllCartItems();

		testRemoveCartItem();	
		//testGetAllCartItems();
	}
}