package com.cognizant.truyum.dao;

import java.util.*;

import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;

public class CartDaoCollectionImpl implements CartDao {
	
	private static HashMap<Long, Cart> userCarts;
	public CartDaoCollectionImpl()
	{
		if(userCarts == null)
		{
			userCarts = new HashMap<Long, Cart>();
		}
		
	}
	
		
	@Override
	public void addCartItem(long userId, long menuItemId){
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		ArrayList<MenuItem> tempMenuItemList = new ArrayList<MenuItem>();
		//list.add(menuItemDao.getMenuItem(menuItemId));
		MenuItem m = menuItemDao.getMenuItem(menuItemId);
		//System.out.println(userCarts.containsKey(userId));
		if(userCarts.containsKey(userId))
		{
				 Cart c = userCarts.get(userId);
				 //System.out.println(c);
				 tempMenuItemList = c.getMenuItemList();
				 tempMenuItemList.add(m);
				 c.setMenuItemList(tempMenuItemList);
		}
		else
		{
			tempMenuItemList.add(m);
			double total = m.getPrice();
			Cart c = new Cart(tempMenuItemList, total);
			//System.out.println(c);
			userCarts.put(userId, c);
			//System.out.println(userCarts.containsKey(userId));
		}
		
	}

	@Override
	public ArrayList<MenuItem> getAllCartItems(long userId) throws CartEmptyException {
		// TODO Auto-generated method stub
		if(userCarts.get(userId) == null|| userCarts.get(userId).getMenuItemList().isEmpty())
		{
			throw new CartEmptyException();
		}
		
		Cart c = userCarts.get(userId);
		double total = 0;
		for(MenuItem m: c.getMenuItemList()) {
			total += m.getPrice();
		}
		c.setTotal(total);
		
		return c.getMenuItemList();
	}

	public HashMap<Long, Cart> getUserCarts() {
        return userCarts;
    }


    @Override
	public void removeCartItem(long userId, long menuItemId)  {
		// TODO Auto-generated method stub
		if(userCarts.get(userId) == null) return;
		ArrayList<MenuItem> cartList;
		Cart c = userCarts.get(userId);
        //cartList = cartDao.getAllCartItems(1);
        cartList = c.getMenuItemList();
            
            for(MenuItem m: cartList) {
                if(m.getId()==menuItemId)
                {
                    double price = m.getPrice();
                    cartList.remove(m);
                    double total = userCarts.get(userId).getTotal()-price;
                    Cart x = new Cart(cartList, total);
                    userCarts.put(userId, x);
                    break;
                }
            }
       
		
		
		
		
	}
	

}