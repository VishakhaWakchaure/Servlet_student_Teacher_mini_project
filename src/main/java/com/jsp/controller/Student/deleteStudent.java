package com.jsp.controller.Student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;
@WebServlet("/deleted")
public class deleteStudent extends HttpServlet {
	StudentService studentService=new StudentService();
	
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("studentId");
	int id2=Integer.parseInt(id);
	
	Student s=studentService.getByIdStudent(id2);
	if(s!=null) {
		s.setId(id2);
	}
	boolean delete_student=studentService.deleteStudenById(id2);
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body><h1>"+s.getName()+"delete_student"+"</h1></body></html>");
}
}

