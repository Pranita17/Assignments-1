package com.cognizant.truyum.servlets;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.MenuItemDaoCollectionSqlImpl;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.util.DateUtil;


@WebServlet("/EditMenuItem")
public class EditMenuItemServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public EditMenuItemServlet() {
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		MenuItemDaoCollectionSqlImpl menuItemDao = new MenuItemDaoCollectionSqlImpl();
		long id = Long.parseLong(request.getParameter("menuId"));
		String name = request.getParameter("title");
		float price = Float.parseFloat(request.getParameter("price"));
		boolean active = false;
		if(request.getParameter("inStock").equals("true")) active = true;
		Date dateOfLaunch = DateUtil.convertToDate(request.getParameter("dateOfLaunch"));
		//System.out.println(request.getParameter("dateOfLaunch"));
		String category = request.getParameter("category");
		boolean freeDelivery = Boolean.parseBoolean(request.getParameter("freeDelivery"));
		MenuItem menuItemToModify = new MenuItem(id, name, price, active, dateOfLaunch, category, freeDelivery);
		menuItemDao.modifyMenuItem(menuItemToModify);
		System.out.println(menuItemDao.getMenuItemListAdmin());
		request.getServletContext().getRequestDispatcher("/edit-menu-item-status.jsp").forward(request, response);
		
	}

}
