package com.vkopendoh.ejb.web;

import com.vkopendoh.ejb.business.ConverterBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

public class ConverterServlet extends HttpServlet {
    @EJB
    ConverterBean converterBean;


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        BigDecimal dollarsAmount = new BigDecimal(request.getParameter("dollarsAmount"));
        BigDecimal yensAmount = new BigDecimal(request.getParameter("yensAmount"));
        BigDecimal yens = converterBean.dollarToYen(dollarsAmount);
        BigDecimal euros = converterBean.yenToEuro(yensAmount);
        request.setAttribute("yens", yens.toString());
        request.setAttribute("euros", euros.toString());
        request.getRequestDispatcher("/WEB-INF/jsp/convert.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/jsp/convert.jsp").forward(request, response);
    }

}
