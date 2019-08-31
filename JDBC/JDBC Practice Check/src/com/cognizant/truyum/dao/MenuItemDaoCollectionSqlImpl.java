package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDaoCollectionSqlImpl implements MenuItemDao {

	boolean getBooleanFromString(String str) {
		if(str.equalsIgnoreCase("Yes"))
			return true;
		return false;
	}
	
	String getStringFromBoolean(boolean bool) {
		if(bool)
			return "Yes";
		return "No";
	}
	
	Date convertDateToSQLDate (java.util.Date date) {
		
		Date sqlDate = new Date(date.getTime());
		return sqlDate;
		
	}
	
	@Override
	public ArrayList<MenuItem> getMenuItemListAdmin() {
		
		Connection con = ConnectionHandler.getConnection();
		System.out.println(con);
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		try {
			PreparedStatement query = con.prepareStatement("SELECT * FROM menu_item");
			ResultSet rs = query.executeQuery();
			while (rs.next())
			{
				MenuItem tempItem = new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), getBooleanFromString(rs.getString(4)) , rs.getDate(5), rs.getString(6),getBooleanFromString(rs.getString(7)));
				menuItemList.add(tempItem);
			}
			return menuItemList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		
		
		return null;
	}

	@Override
	public ArrayList<MenuItem> getMenuItemListCustomer() {
		Connection con = ConnectionHandler.getConnection();
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		try {
			PreparedStatement query = con.prepareStatement("SELECT * FROM menu_item WHERE me_date_of_launch <= CURRENT_DATE() AND me_active = 'Yes'");
			ResultSet rs = query.executeQuery();
			while (rs.next())
			{
				MenuItem tempItem = new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), getBooleanFromString(rs.getString(4)) , rs.getDate(5), rs.getString(6),getBooleanFromString(rs.getString(7)));
				menuItemList.add(tempItem);
			}
			return menuItemList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		return null;
	}

	@Override
	public void modifyMenuItem(MenuItem menuitem) {
		
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("UPDATE menu_item SET\nme_name = ?,\nme_price = ?,\nme_active = ?,\nme_date_of_launch = ?,\nme_category = ?,\nme_free_delivery = ?\nWHERE me_id = ?");
			query.setString(1, menuitem.getName());
			query.setFloat(2, menuitem.getPrice());
			query.setString(3, getStringFromBoolean(menuitem.isActive()));
			query.setDate(4, convertDateToSQLDate(menuitem.getDateOfLaunch()));
			//query.setDate(4, menuitem.getDateOfLaunch());

			query.setString(5, menuitem.getCategory());
			query.setString(6, getStringFromBoolean(menuitem.isFreeDelivery()));
			query.setLong(7, menuitem.getId());
			System.out.println(query.executeUpdate() + " rows effected");
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
		    try { con.close(); } catch (Exception e) {}
		}
		
	}

	@Override
	public MenuItem getMenuItem(long menuitemId) {
		
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("SELECT * FROM menu_item WHERE me_id=?");
			query.setInt(1, (int) menuitemId);
			ResultSet rs = query.executeQuery();
			while(rs.next()) {
			MenuItem menuItem = new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), getBooleanFromString(rs.getString(4)) , rs.getDate(5), rs.getString(6),getBooleanFromString(rs.getString(7)));
			return menuItem;}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		
		return null;
	}

}
