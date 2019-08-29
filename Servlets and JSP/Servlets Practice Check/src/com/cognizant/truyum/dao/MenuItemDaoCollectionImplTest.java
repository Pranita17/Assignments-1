package com.cognizant.truyum.dao;
import java.util.ArrayList;
import java.util.Date;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionImplTest {

	static MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();

	static void testGetMenuItemListAdmin() {
		ArrayList<MenuItem> list = menuItemDao.getMenuItemListAdmin();
		System.out.println("Menu List for Admin");
        System.out.println(String.format("%-15s %-25s %-15s %-15s %-15s %-15s %-15s", "ID","Name","Price","Active","Date of Launch","Category","Free Delivery"));
        System.out.println("================================================================================================================");
		for(MenuItem menuitem: list)
		{
			System.out.println(menuitem);
		}	
        System.out.println("================================================================================================================");

	}
	 static void testGetMenuItemListCustomer()  {
		ArrayList<MenuItem> list = menuItemDao.getMenuItemListCustomer();
		System.out.println("\nMenu List for Customer");
        System.out.println(String.format("%-15s %-25s %-15s %-15s %-15s %-15s %-15s", "ID","Name","Price","Active","Date of Launch","Category","Free Delivery"));

        System.out.println("================================================================================================================");
		
		for(MenuItem menuitem: list)
		{
			System.out.println(menuitem);
		}
        System.out.println("================================================================================================================");

	}
	 static void testModifyMenuItem() {
		Date today = new Date();
		MenuItem item = new MenuItem(1, "modifyCheck", 99, true, today, "Check", true);
		menuItemDao.modifyMenuItem(item);
		System.out.println("\nItem modified successfully");
        System.out.println(String.format("%-15s %-25s %-15s %-15s %-15s %-15s %-15s", "ID","Name","Price","Active","Date of Launch","Category","Free Delivery"));

        System.out.println("================================================================================================================");
        System.out.println(menuItemDao.getMenuItem(1));
        System.out.println("================================================================================================================");

		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testModifyMenuItem();
		testGetMenuItemListCustomer();


	}

}