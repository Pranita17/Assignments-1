package com.cognizant.truyum.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDaoCollectionSqlImpl;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowEditMenuItem")
public class ShowEditMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ShowEditMenuItemServlet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		long menuItemId = Long.parseLong(request.getParameter("menuItemId"));
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		
		request.setAttribute("EditMenuItem", menuItem);
		request.getServletContext().getRequestDispatcher("/edit-menu-item.jsp").forward(request, response);

		
	}

}
