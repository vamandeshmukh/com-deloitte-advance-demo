package com.deloitte.advance.demo.dao;

import java.util.List;

import com.deloitte.advance.demo.model.Student;

public interface StudentDao {

	// CRUD ops

	public abstract Student addStudent(Student student);

	public abstract Student updateStudent(Student student);

	public abstract Student deleteStudentByRollNo(int rollNo);

	public abstract Student getStudentByRollNo(int rollNo);

	public abstract List<Student> getAllStudents();

}
