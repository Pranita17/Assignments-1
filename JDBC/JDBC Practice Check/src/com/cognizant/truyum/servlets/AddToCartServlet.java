package com.cognizant.truyum.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.CartDaoCollectionSqlImpl;
import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionSqlImpl;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/AddToCart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

 
    public AddToCartServlet() {
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		long userId = 1l;
		long menuItemId = Long.parseLong(request.getParameter("menuItemId"));
		CartDaoCollectionSqlImpl cartDao = new CartDaoCollectionSqlImpl();
		cartDao.addCartItem(userId, menuItemId);
		MenuItemDao menuItemDao = new MenuItemDaoCollectionSqlImpl();
		ArrayList<MenuItem> menuItemList = menuItemDao.getMenuItemListCustomer();
		request.setAttribute("menuItemList", menuItemList);
		request.setAttribute("addCartStatus", true);
		request.getServletContext().getRequestDispatcher("/menu-item-list-customer.jsp").forward(request, response);
		
		
	}

}
