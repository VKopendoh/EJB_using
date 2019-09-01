package com.vkopendoh.ejb.web;

import com.vkopendoh.ejb.business.Cart;
import com.vkopendoh.ejb.exceptions.BookException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CartServlet extends HttpServlet {
    Cart shoppingCart;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        shoppingCart = (Cart) request.getSession().getAttribute("shoppingCart");
        request.setCharacterEncoding("UTF-8");
        String title = request.getParameter("title");
        shoppingCart.addBook(title);
        response.sendRedirect("cart");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        shoppingCart = (Cart) request.getSession().getAttribute("shoppingCart");

        if (shoppingCart.getContents() == null) {
            try {
                shoppingCart.initialize("person");
            } catch (BookException e) {
                e.printStackTrace();
            }
        }

        String title = request.getParameter("title");
        String action = request.getParameter("action");
        if (action == null) {
            request.setAttribute("personName", shoppingCart.getCustomerName());
            request.setAttribute("customerId", shoppingCart.getCustomerId());
            request.setAttribute("booksInCart", shoppingCart.getContents());
            request.getRequestDispatcher("/WEB-INF/jsp/cart.jsp").forward(request, response);
            return;
        }
        if ("delete".equals(action)) {
            try {
                shoppingCart.removeBook(title);
            } catch (BookException e) {
                e.printStackTrace();
            }
            response.sendRedirect("cart");
            return;
        } else {
            throw new IllegalArgumentException("Action " + action + " is illegal");
        }
    }
}
