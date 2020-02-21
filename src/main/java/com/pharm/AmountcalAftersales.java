package com.pharm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pharmacyapp.salesDetails.Sales;
import pharmacyapp.salesDetails.SalesImplementation;


@WebServlet("/AmountcalAftersales")
public class AmountcalAftersales extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  int  productId=Integer.parseInt(request.getParameter("productId"));
		  int  salesId=Integer.parseInt(request.getParameter("salesId"));
		  SalesImplementation s=new SalesImplementation();
          Sales l=new Sales();
          l.setProductId(productId);
          l.setSalesId(salesId);
         try {
			int  n=s.amountCalAfterSales(productId, salesId);
			if(n==1)
			{
				PrintWriter out = response.getWriter();
		   		 out.println("\n");
		   			out.println("\n<h1>Sales Amount Calculated</h1>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
