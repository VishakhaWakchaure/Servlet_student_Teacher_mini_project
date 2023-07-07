package com.jsp.controller.Student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.boot.model.source.internal.hbm.AbstractEntitySourceImpl;

import com.jsp.dto.Student;
import com.jsp.service.StudentService;

@WebServlet("/studentInfo")
public class StudentSaveController extends HttpServlet {
	Student student =new Student();   
	StudentService service= new StudentService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email =req.getParameter("email");
		String password =req.getParameter("password");
		
		if(name!=null && email !=null && password !=null) {
			student.setEmail(email);
			student.setName(name);
			student.setPassword(password);
			Student s=service.saveStudent(student);
			if(s!=null) {
				System.out.println("student add successfully");
			}
		}
		System.out.println("All good");
	}
	

}
