package com.pharm;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pharmacyapp.login.UserDAOImplementation;
@WebServlet("/Pharmacy")


public class Pharmacy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserDAOImplementation obj = new UserDAOImplementation();
		
		String name= request.getParameter("name");
		String password = request.getParameter("password");

		System.out.println(name + "-" + password);
		try {
			obj.user(name, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
