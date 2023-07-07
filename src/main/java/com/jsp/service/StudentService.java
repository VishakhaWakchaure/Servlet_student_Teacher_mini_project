package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService  {
	StudentDao studentDao =new  StudentDao();
	
	public Student saveStudent(Student student) {
		if(student!=null) {
			return studentDao.saveStudent(student);
		}
		return student;
		
	}
	//getAll
	public List<Student> getAllStudent(){
		return studentDao.getAllStudent();
	}
	
	//getByid
	public Student getByIdStudent(int id) {
		if(id>0) {
			return studentDao.getByIdStudent(id);
		}else {
			return null;
		}
}
	//updateStudent
	public Student updateStudentName(int id,String Name,String email) {
		Student student= studentDao.getByIdStudent(id);
		student.setName(Name);
		student.setEmail(email);
		return studentDao.updateStudentName(id, student);
		
		
	}
	
	//delete student
	public boolean deleteStudenById(int id) {
		if(id>0) {
			return studentDao.deleteStudenById(id);
		}else {
			return false;
		}
	}

	}


