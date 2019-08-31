package com.cognizant.truyum.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionSqlImpl implements CartDao {
	
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
	
	
	
	@Override
	public void addCartItem(long userId, long menuItemId) {
		
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("INSERT into cart(ct_us_id, ct_pr_id) VALUES (?,?)");
			query.setLong(1, userId);
			query.setLong(2, menuItemId);
			query.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		
	}

	@Override
	public ArrayList<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		
		Cart userCart = new Cart(new ArrayList<MenuItem>(), 0);
		ArrayList<MenuItem> menuItemList = new ArrayList<MenuItem>();
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("SELECT me_id, me_name, me_price, me_active, me_date_of_launch, me_category, me_free_delivery from menu_item, cart WHERE me_id=cart.ct_pr_id AND cart.ct_us_id = ?");
			query.setLong(1, userId);
			ResultSet rs = query.executeQuery();
			if(!rs.isBeforeFirst()) throw new CartEmptyException();
			while(rs.next())
			{
				MenuItem tempItem = new MenuItem(rs.getLong(1), rs.getString(2), rs.getFloat(3), getBooleanFromString(rs.getString(4)) , rs.getDate(5), rs.getString(6),getBooleanFromString(rs.getString(7)));
				menuItemList.add(tempItem);
			}
			rs.close();
			query = con.prepareStatement("SELECT SUM(me_price) from menu_item, cart WHERE me_id=cart.ct_pr_id AND cart.ct_us_id = ?");
			query.setLong(1, userId);
			ResultSet rs2 = query.executeQuery();
			double total = 0;
			while(rs2.next()) {total = rs2.getFloat(1);}
			userCart.setMenuItemList(menuItemList);
			userCart.setTotal(total);
			
			return userCart.getMenuItemList();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		
		
		return null;
	}

	@Override
	public void removeCartItem(long userId, long menuItemId) {
		
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("DELETE from cart WHERE ct_us_id = ? AND ct_pr_id = ? LIMIT 1");
			query.setLong(1, userId);
			query.setLong(2, menuItemId);
			query.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
	}
		
	public double getTotal(long userId) {
		
		Connection con = ConnectionHandler.getConnection();
		try {
			PreparedStatement query = con.prepareStatement("SELECT SUM(me_price) from menu_item, cart WHERE me_id=cart.ct_pr_id AND cart.ct_us_id = ?");
			query.setLong(1, userId);
			ResultSet rs2 = query.executeQuery();
			double total = 0;
			while(rs2.next()) {total = rs2.getFloat(1);}
			return total;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
		    try { con.close(); } catch (Exception e) {}
		}
		return 0;
		
	}
		
	}


