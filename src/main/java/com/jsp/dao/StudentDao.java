package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;



public class StudentDao {
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	///to save
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	//GetAllDetails
	public List<Student> getAllStudent(){
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql="SELECT s FROM Student s";
		Query query=entityManager.createQuery(jpql);
		List<Student> students=query.getResultList();
		return students;
	}
	//getByid
	public Student getByIdStudent(int id) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		Student s= entityManager.find(Student.class, id);
		if(s!=null) {
			return s;
		}else {
			return null;
		}
		
}
	//updateStudent
	public Student updateStudentName(int id,Student student) {
		EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student1=entityManager.find(Student.class,id);
		if(student1!=null) {
			
			entityTransaction.begin();
			entityManager.merge(student);
			entityTransaction.commit();
			return student;
		}else {
			return null;
		}
		}
	//delete Student
	public boolean deleteStudenById(int id) {
		Student student=entityManager.find(Student.class,id);
		entityTransaction.begin();
		entityManager.remove(student);
		entityTransaction.commit();
		return true;
	}

	
}
