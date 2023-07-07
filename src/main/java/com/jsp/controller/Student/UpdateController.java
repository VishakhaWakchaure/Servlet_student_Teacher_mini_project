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
@WebServlet("/updated")
public class UpdateController extends HttpServlet {
	StudentService studentService=new StudentService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("StudentId");
		int id2=Integer.parseInt(id);
		String name=req.getParameter("StudentName");
		String email=req.getParameter("StudentEmail");
		Student s1=studentService.getByIdStudent(id2);
		if(s1!=null) {
		s1.setName(name);	
		s1.setEmail(email);
		}
		Student  student_update=studentService.updateStudentName(id2, name,email);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+s1.getName()+"student_update"+"</h1></body></html>");
	}

}
