package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoSqlImplTest {
	
	
	
	public static void testGetMenuItemListAdmin() {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		ArrayList<MenuItem> menuItemList = menuItemDao.getMenuItemListAdmin();
		for(MenuItem m: menuItemList)
		{
			System.out.println(m);
		}
	}
	
	public static void testGetMenuItemListCustomer() {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		ArrayList<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
		for(MenuItem m: menuItemList)
		{
			System.out.println(m);
		}
	}

	public static void testGetMenuItem() {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(2);
		System.out.println(menuItem);
	}
	
	public static void testModifyMenuItem() {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		MenuItem modifiedMenuItem = new MenuItem(1, "test", (float)99.0, true, DateUtil.convertToDate("04/09/2016"), "test2", true);
		menuItemDao.modifyMenuItem(modifiedMenuItem);
		System.out.println(menuItemDao.getMenuItem(1));
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testGetMenuItemListAdmin();
		testGetMenuItemListCustomer();
		testGetMenuItem();
		//testModifyMenuItem();

	}

}
