package com.school.dao;

import java.util.List;

import com.school.dto.Student;

public interface StuInterface {
   
	public long createStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(long id);
	public List<Student> getStudent();
	
	
	
	
}
