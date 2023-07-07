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
@WebServlet("/updatedT")
public class UpdateTeacherController extends HttpServlet {
	TeacherService teacherService=new TeacherService();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("TeacherId");
		int id2=Integer.parseInt(id);
		String name=req.getParameter("TeacherName");
		String email =req.getParameter("TeacherEmail");
		String cno=req.getParameter("TeacherCno");
		
		Teacher t1=teacherService.getByIdTeacher(id2);
		if(t1 !=null) {
			t1.setName(name);
			t1.setEmail(email);
			t1.setCno(cno);
		}
		Teacher update_Teacher=teacherService.updateTeacherName(id2, name, email, cno);
		PrintWriter printWriter=resp.getWriter();
		printWriter.write("<html><body><h1>"+t1.getName()+"update_Teacher"+"</h1></body></html>");
	}

}
