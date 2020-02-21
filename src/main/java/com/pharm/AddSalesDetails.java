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


@WebServlet("/AddSalesDetails")
public class AddSalesDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		 int  salesId=Integer.parseInt(request.getParameter("salesId"));
		 int productId=Integer.parseInt(request.getParameter("productId"));
		 int salesQuantity=Integer.parseInt(request.getParameter("salesQuantity"));
		 int Amount=Integer.parseInt(request.getParameter("Amount"));
          SalesImplementation s=new SalesImplementation();
          Sales l=new Sales();
          l.setSalesId(salesId);
          l.setProductId(productId);
          l.setSalesQuantity(salesQuantity);
          l.setAmount(Amount);
          try {
			int n=s.addSalesDetails(l);
			if(n==1)
			{
				PrintWriter out = response.getWriter();
		   		 out.println("\n");
		   			out.println("\n<h1>SalesDetails Added</h1>");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
