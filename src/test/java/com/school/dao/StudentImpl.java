package com.school.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.school.dto.Student;

public class StudentImpl implements StuInterface {
	
	@Autowired
      SessionFactory sessionFactory;

	@Override
	public long createStudent(Student student) {
		Session session=SessionFactory.
		return 0;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
