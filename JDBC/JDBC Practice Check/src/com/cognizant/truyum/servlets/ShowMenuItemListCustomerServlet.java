package com.cognizant.truyum.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDaoCollectionSqlImpl;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowMenuItemListCustomer")
public class ShowMenuItemListCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public ShowMenuItemListCustomerServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		ArrayList<MenuItem> menuItems = menuItemDao.getMenuItemListCustomer();
		request.getSession().setAttribute("menuItemList", menuItems);
		request.getServletContext().getRequestDispatcher("/menu-item-list-customer.jsp").forward(request, response);
	}

}
