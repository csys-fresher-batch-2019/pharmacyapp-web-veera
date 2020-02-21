package com.pharm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pharmacyapp.admin.AdminDAO;
import pharmacyapp.admin.AdminDAOImplementation;
@WebServlet("/Admin")

public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		AdminDAO com = new AdminDAOImplementation();
      String name=request.getParameter("name");
      System.out.println(name);
      String password=request.getParameter("password");
      System.out.println(password);
      System.out.println(name +" "+password);
      
      try
      {

			boolean res=com.AdminLogin(name, password);
			System.out.println(res);
			if (res) {
				HttpSession ses = request.getSession();
				RequestDispatcher d = request.getRequestDispatcher("Adminaccess.jsp");
				d.forward(request, response);
			} else {
				RequestDispatcher d = request.getRequestDispatcher("Admin.jsp");
				d.forward(request, response);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	  
      }
	}


