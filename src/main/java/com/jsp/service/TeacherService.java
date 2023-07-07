package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
TeacherDao teacherDao=new TeacherDao();
//save
public Teacher saveTeacher(Teacher teacher) {
	if(teacher!=null) {
		return teacherDao.saveTeacher(teacher);
	}
	return teacher;
}

//GetAllDetails
public List<Teacher> getAllTeacher(){
	return teacherDao.getAllTeacher();
}
//getbyid
public  Teacher getByIdTeacher(int id) {
	if(id>0) {
	return teacherDao.getByIdTeacher(id);
}else {
 return null;
}
}

//update Teacher Name
public Teacher updateTeacherName(int id,String name,String email,String cno) {
	Teacher t2=teacherDao.getByIdTeacher(id);
	t2.setName(name);
	t2.setEmail(email);
	t2.setCno(cno);
	return teacherDao.updateTeacherName(id, t2);
	
}	
	
//delete Teacher Id
public boolean deleteTeacherById(int id) {
	if(id>0) {
		return teacherDao.deleteTeacherById(id);
	}else {
		return false;
	}
}
}

