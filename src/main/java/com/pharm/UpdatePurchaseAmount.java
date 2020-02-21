package com.pharm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pharmacyapp.purchaseDetails.Purchase;
import pharmacyapp.purchaseDetails.PurchaseImplementation;


@WebServlet("/UpdatePurchaseAmount")
public class UpdatePurchaseAmount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  int purchaseId=Integer.parseInt(request.getParameter("purchaseId"));
		  int  productId=Integer.parseInt(request.getParameter("productId"));
		PurchaseImplementation pm=new PurchaseImplementation();
		Purchase c=new Purchase();
		c.setPurchaseId(purchaseId);
		c.setProductId(productId);
//		try {
//			docs.adddoctor(doc);
//			request.setAttribute("infoMessage", "Amount Updated ");
//		} catch (Dbexception e) {
//			request.setAttribute("errorMessage", "Amount Updated ");
//		}
//		
		try {
			int n=pm.amountCalculation(productId, purchaseId);;
		if(n==1)
			{
		
				PrintWriter out = response.getWriter();
		   		 out.println("\n");
		request.setAttribute("infoMessage", "Amount Updated ");

//		   			out.println("\n<h1>Amount Updated </h1>");
		}
		
	} catch (Exception e) {
		request.setAttribute("errorMessage", "Amount Updated ");
			e.printStackTrace();
		}
	
	RequestDispatcher d = request.getRequestDispatcher("UpdatePurchaseAmount.jsp");
	d.forward(request, response);
	}
}
