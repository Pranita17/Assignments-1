package com.cognizant.truyum.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowMenuItemListAdmin")
public class ShowMenuItemListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ShowMenuItemListAdminServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MenuItemDaoCollectionImpl menuItemDao = new MenuItemDaoCollectionImpl();
		ArrayList<MenuItem> menuItems = menuItemDao.getMenuItemListAdmin();
		request.getSession().setAttribute("menuItemList", menuItems);
		request.getServletContext().getRequestDispatcher("/menu-item-list-admin.jsp").forward(request, response);
		
	}

}
