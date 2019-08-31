package com.cognizant.truyum.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cognizant.truyum.dao.CartDaoCollectionSqlImpl;
import com.cognizant.truyum.dao.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;


@WebServlet("/ShowCart")
public class ShowCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
    public ShowCartServlet() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long userId = 1l;
		CartDaoCollectionSqlImpl cartDao = new CartDaoCollectionSqlImpl();
		ArrayList<MenuItem> customerCartList = new ArrayList<MenuItem>();
		try {
			customerCartList = cartDao.getAllCartItems(userId);
			double total = cartDao.getTotal(userId);
			request.setAttribute("customerCartList", customerCartList);
			request.setAttribute("cartTotal", total);
			request.getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
		} catch (CartEmptyException e) {
			request.getServletContext().getRequestDispatcher("/cart-empty.jsp").forward(request, response);
		}
	}

}
