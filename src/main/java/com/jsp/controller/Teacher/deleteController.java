package com.jsp.controller.Teacher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
@WebServlet("/deletedT")
public class deleteController extends HttpServlet{
	TeacherService teacherService=new TeacherService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("TeacherId");
		int id2=Integer.parseInt(id);
		
		Teacher t=teacherService.getByIdTeacher(id2);
		if(t!=null) {
			t.setId(id2);
		}
		boolean delete_Teacher=teacherService.deleteTeacherById(id2);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+t.getName()+"delete_Teacher"+"</h1></body></html>");
	}

}
