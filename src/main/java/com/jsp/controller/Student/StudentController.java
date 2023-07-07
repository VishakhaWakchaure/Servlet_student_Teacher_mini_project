package com.jsp.controller.Student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student")
public class StudentController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String register=req.getParameter("register");
	String delete=req.getParameter("delete");
	String update=req.getParameter("update");
	String getbyid=req.getParameter("getbyid");
	String getAll=req.getParameter("getAll");
	String get_by_id=req.getParameter("get_by_id");
	
	
	if(register !=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("registration.jsp");
		requestDispatcher.forward(req, resp);
	}
	
	else if(delete !=null) {
       RequestDispatcher requestDispatcher=req.getRequestDispatcher("deleteStudent.jsp");
       requestDispatcher.forward(req, resp);
		
	} 
	else if(update !=null) {
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("updateStudent.jsp");
		requestDispatcher.forward(req, resp);
	}
	else
		if(get_by_id!=null) {
			
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getByIdStudent.jsp");
			requestDispatcher.forward(req, resp);
	}
	 else 
		if(getAll  !=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAllStudent.jsp")	;
			requestDispatcher.forward(req, resp);
		
		}
	}
}

