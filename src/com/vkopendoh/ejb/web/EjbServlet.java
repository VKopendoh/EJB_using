package com.vkopendoh.ejb.web;

import com.vkopendoh.ejb.business.CardMoneyTransaction;
import com.vkopendoh.ejb.business.MoneyTransactionInterface;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class EjbServlet extends HttpServlet {
    @EJB
    MoneyTransactionInterface transaction;

    @EJB
    CardMoneyTransaction transaction2;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write(transaction.transactMoney());
        response.getWriter().write(transaction2.transactMoney());

    }
}
