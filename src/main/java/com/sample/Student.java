package com.sample;

public class Student {
	private String studentName;
	private String studentRollNo;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(String studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public Student(String studentName, String studentRollNo) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
