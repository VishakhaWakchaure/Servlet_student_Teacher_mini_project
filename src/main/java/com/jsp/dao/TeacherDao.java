package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Teacher;

public class TeacherDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishakha");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();

//to save 
public Teacher saveTeacher(Teacher teacher) {
	entityTransaction.begin();
	entityManager.persist(teacher);
	entityTransaction.commit();
	return teacher;
}
//getAll Details
public List<Teacher> getAllTeacher(){
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vishakha");
	EntityManager entityManager= entityManagerFactory.createEntityManager();
	String jpql="SELECT t FROM Teacher t";
	Query query=entityManager.createQuery(jpql);
	List<Teacher> teacher=query.getResultList();
	return teacher;
}

//getByid
public  Teacher getByIdTeacher(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishakha");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Teacher t= entityManager.find(Teacher.class, id);
	if(t!=null) {
		return t;
	}else {
		return null;
	}
	
}

//updateTeacher
public Teacher updateTeacherName(int id,Teacher teacher) {

	if(teacher!=null) {
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		return teacher;
	}else {
		return null;
	}
}

//update email
public Teacher updateTeacherEmail(int id,Teacher teacher) {
	Teacher teacher1=entityManager.find(Teacher.class,id);
	if(teacher1!=null) {
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
		return teacher;
	}else {
		return null;
}
}
//delete Teacher
public boolean deleteTeacherById(int id ) {
	Teacher teacher=entityManager.find(Teacher.class,id);
	entityTransaction.begin();
	entityManager.remove(teacher);
	entityTransaction.commit();
	return false;

	
}
}
