package com.jsp.controller.Teacher;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
@WebServlet("/teacherInfo")
public class TeacherSaveController extends HttpServlet{
	Teacher teacher=new Teacher();
	TeacherService service=new TeacherService(); 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email =req.getParameter("email");
		String contactno =req.getParameter("contactno");
		
		if(name!=null && email !=null && contactno !=null) {
			teacher.setEmail(email);
			teacher.setName(name);
			teacher.setCno(contactno);
			Teacher t=service.saveTeacher(teacher);
			if(t!=null) {
				System.out.println("Teacher add successfully");
		}
			if(t!=null) {
				System.out.println(t.getEmail());
				System.out.println(t.getName());
				System.out.println(t.getCno());
				System.out.println("teacher id show successfully");
				}else {
					System.out.println("incorrect id");
				}
	}
		System.out.println("All good");
	}}

	


