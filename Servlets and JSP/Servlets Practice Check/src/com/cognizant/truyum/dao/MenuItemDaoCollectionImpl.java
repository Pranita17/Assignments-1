package com.cognizant.truyum.dao;
import java.util.*;
import com.cognizant.truyum.model.*;
import com.cognizant.truyum.util.DateUtil;

public class MenuItemDaoCollectionImpl implements MenuItemDao {
	
	private static ArrayList<MenuItem> menuItemList;
	
	public MenuItemDaoCollectionImpl() {
		if(menuItemList==null) {
		    menuItemList = new ArrayList<MenuItem>();
			menuItemList.add(new MenuItem(1, "Sandwich", (float)99.0,  true, DateUtil.convertToDate("15/03/2017"),"Main Course", true ));
			menuItemList.add(new MenuItem(2, "Burger",  (float)129.0,  true, DateUtil.convertToDate("23/12/2017"),"Main Course",  false));
			menuItemList.add(new MenuItem(3, "Pizza", (float)149.0,  true,  DateUtil.convertToDate("21/08/2018"), "Main Course",  false));
			menuItemList.add(new MenuItem(4, "French Fries", (float)57.0,  false,  DateUtil.convertToDate("02/07/2017"), "Starters",  true));
			menuItemList.add(new MenuItem(5, "Chocolate Brownies", (float)32.0, true, DateUtil.convertToDate("02/11/2022"),"Dessert",  true));

			
		}
	}

	@Override
	public ArrayList<MenuItem> getMenuItemListAdmin() {
		// TODO Auto-generated method stub
		return menuItemList;
	}

	@Override
	public ArrayList<MenuItem> getMenuItemListCustomer() {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> customerList = new ArrayList<MenuItem>();
		Date day = new Date();
		for(MenuItem menuitem : menuItemList) {
			Date listDate = menuitem.getDateOfLaunch();
			if( day.compareTo(listDate) >= 0 && menuitem.isActive())
			{
				customerList.add(menuitem);
			}
		}
		return customerList;
	}

	@Override
	public void modifyMenuItem(MenuItem menuItem) {
		
		for(MenuItem menuitem: menuItemList) {
			if(menuitem.equals(menuItem))
			{
				menuitem.setName(menuItem.getName());;
				menuitem.setCategory(menuItem.getCategory());
				menuitem.setActive(menuItem.isActive());
				menuitem.setDateOfLaunch(menuItem.getDateOfLaunch());
				menuitem.setFreeDelivery(menuItem.isFreeDelivery());
				menuitem.setPrice(menuItem.getPrice());
			}
		}
		
	}

	@Override
	public MenuItem getMenuItem(long menuItemId) {
	
		for(MenuItem menuitem: menuItemList)
		{
			if(menuitem.getId()==menuItemId)
			{
				return menuitem;
			}	
		}
		return null;
	}
	
	

}