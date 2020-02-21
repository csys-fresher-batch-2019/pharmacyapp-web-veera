package com.pharm;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pharmacyapp.stock1Details.Stock1;
import pharmacyapp.stock1Details.Stock1Implementation;


@WebServlet("/AddStockDetails")
public class AddStockDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		  int  productId=Integer.parseInt(request.getParameter("productId"));
		  int  openingStock=Integer.parseInt(request.getParameter("openingStock"));
		  int  purchaseQuantity=Integer.parseInt(request.getParameter("purchaseQuantity"));
		  int  salesQuantity=Integer.parseInt(request.getParameter("salesQuantity"));
          Stock1Implementation nu=new Stock1Implementation();
          Stock1 s=new Stock1();
          s.setProductId(productId);
          s.setOpeningStock(openingStock);
          s.setPurchaseQuantity(purchaseQuantity);
          s.setSalesQuantity(salesQuantity);
        try {
			int  n=nu.addStockDetails(s);
			//if(n==1) {
				PrintWriter out = response.getWriter();
		   		 out.println("\n");
		   			out.println("\n<h1>StockDetails Added</h1>");
			//}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	

}
