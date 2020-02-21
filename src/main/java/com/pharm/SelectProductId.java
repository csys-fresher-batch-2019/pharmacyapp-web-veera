package com.pharm;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pharmacyapp.productDetails.Product;
import pharmacyapp.productDetails.ProductImplementation;
@WebServlet("/SelectProductId")

public class SelectProductId extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductImplementation p=new ProductImplementation();
		  int  productId=Integer.parseInt(request.getParameter("productId"));
		  try {
			  
			
			ArrayList<Product> val=p.selectProductId(productId);
			request.setAttribute("Pro", val);
			HttpSession ses = request.getSession();
			ses.setAttribute("Prod", productId);
			RequestDispatcher d = request.getRequestDispatcher("DisplayProductId.jsp");
			d.forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}


}
