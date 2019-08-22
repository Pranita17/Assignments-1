package com.cognizant.truyum.dao;
import java.util.ArrayList;
import java.util.Date;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImplTest {

	static void testGetMenuItemListAdmin() {
		MovieDaoCollectionImpl menuItemDao = new MovieDaoCollectionImpl();
		ArrayList<MenuItem> list = menuItemDao.getMenuItemListAdmin();
		for(MenuItem menuitem: list)
		{
			System.out.println(menuitem);
		}	
	}
	 static void testGetMenuItemListCustomer()  {
		MovieDaoCollectionImpl menuItemDao = new MovieDaoCollectionImpl();
		ArrayList<MenuItem> list = menuItemDao.getMenuItemListCustomer();
		System.out.println();
		for(MenuItem menuitem: list)
		{
			System.out.println(menuitem);
		}
	}
	 static void testModifyMenuItem() {
		MovieDaoCollectionImpl menuItemDao = new MovieDaoCollectionImpl();
		Date today = new Date();
		MenuItem item = new MenuItem(1, "Name", 99, true, today, "Category", true);
		menuItemDao.modifyMenuItem(item);
		System.out.println();
		System.out.println(menuItemDao.getMenuItem(1));
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();

	}

}