package com.kh.day09.insof;

public class instanceOfEx {

	static void print(Person p) {
		// Person p = new Student();
//		if (p instanceof Person)
//			System.out.println("Person�Դϴ�!");
		if (p instanceof Student)
			System.out.println("Student�Դϴ�.");
		if (p instanceof Researcher)
			System.out.println("Researcher�Դϴ�.");
		if (p instanceof Professor) {
			System.out.println("Professor�Դϴ�!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print(new Person());
		print(new Student());	// --> ������, ��ĳ����
		print(new Researcher());	// --> ������, ��ĳ����
		print(new Professor()); // --> ������, ��ĳ����
	}

}
