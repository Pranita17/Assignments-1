package com.cognizant.truyum.dao;

import java.util.*;

import com.cognizant.truyum.model.MenuItem;

public interface MenuItemDao {
	
	ArrayList<MenuItem> getMenuItemListAdmin();
	ArrayList<MenuItem> getMenuItemListCustomer();
	void modifyMenuItem(MenuItem menuitem);
	MenuItem getMenuItem(long menuitemId);
}
