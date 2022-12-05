package com.kh.day09.upcasting;

public class Student extends Person{
	//-->기본생성자 작성하지 않으면 오류 발생
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
}
