package com.deloitte.advance.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.deloitte.advance.demo.model.Student;

public class StudentDaoImpl implements StudentDao {

	private String url = "jdbc:mysql://localhost:3306/deloitte";
	private String user = "root";
	private String password = "root";
	private Connection con;

	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student deleteStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getStudentByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> studentList = new ArrayList<>();
		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM student ORDER BY roll_no");
			while (rs.next()) {
				studentList.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

}
