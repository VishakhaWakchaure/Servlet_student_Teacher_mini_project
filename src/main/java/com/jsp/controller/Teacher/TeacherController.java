package com.jsp.controller.Teacher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/teacher")
public class TeacherController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String register=req.getParameter("register");
		String delete=req.getParameter("delete");
		String update=req.getParameter("update");
		String getbyid=req.getParameter("getbyid");
		String getAll=req.getParameter("getAll");
		
		if(register !=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("teacher_register.jsp");
			requestDispatcher.forward(req, resp);
		}else if(delete !=null) {
       RequestDispatcher requestDispatcher=req.getRequestDispatcher("deleteTeacher.jsp");
       requestDispatcher.forward(req, resp);
			
		} else if(update !=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("updateTeacher.jsp");
			requestDispatcher.forward(req, resp);
		
		}else
			if(getAll !=null) {
				RequestDispatcher requestDispatcher=req.getRequestDispatcher("getAll.jsp");
				requestDispatcher.forward(req, resp);
			}
	

	}

}
