package com.deloitte.advance.demo;

import java.util.List;

import com.deloitte.advance.demo.dao.StudentDao;
import com.deloitte.advance.demo.dao.StudentDaoImpl;
import com.deloitte.advance.demo.model.Student;

/**
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Start");
		StudentDao dao = new StudentDaoImpl();

		System.out.println("View all students :");

		List<Student> studentList = dao.getAllStudents();

		studentList.forEach((s) -> {
			System.out.println(s.toString());
			}
		);

		System.out.println("View student by roll no :");

		System.out.println("Create new student :");

		System.out.println("Update existing student :");

		System.out.println("Delete student :");

		System.out.println("End");
	}

}
