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
@WebServlet("/getByIdStudent")
public class GetByIdController extends HttpServlet{
	StudentService studentService=new StudentService();
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("studentId");
	int id2=Integer.parseInt(id);
	String name=req.getParameter("studentName");
	String email=req.getParameter("studentEmail");
	
	Student s=studentService.getByIdStudent(id2);
	if(s!=null) {
		s.setId(id2);
	}
	Student s1=studentService.getByIdStudent(id2);
	PrintWriter printWriter=resp.getWriter();
	printWriter.write("<html><body><h1>" +s1.getId()+ " studentInfo "+"</h1></body></html>");
	printWriter.write("<html><body><h1>" +s1.getName()+ " "+"</h1></body></html>");
	printWriter.write("<html><body><h1>" +s1.getEmail()+ " "+"</h1></body></html>");
}
}
