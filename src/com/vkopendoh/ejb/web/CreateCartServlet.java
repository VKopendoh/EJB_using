package com.vkopendoh.ejb.web;

import com.vkopendoh.ejb.business.Cart;
import com.vkopendoh.ejb.exceptions.BookException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class CreateCartServlet extends HttpServlet {
    @EJB
    Cart shoppingCart;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        try {
            shoppingCart.initialize(name,id);
        } catch (BookException e) {
            e.printStackTrace();
        }
        shoppingCart.addBook("test book1");
        shoppingCart.addBook("book2");
        request.setAttribute("personName", shoppingCart.getCustomerName());
        request.setAttribute("customerId", shoppingCart.getCustomerId());
        request.setAttribute("booksInCart", shoppingCart.getContents());
        request.getSession().setAttribute("shoppingCart", shoppingCart);
        request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/createCart.jsp").forward(request, response);
    }
}
