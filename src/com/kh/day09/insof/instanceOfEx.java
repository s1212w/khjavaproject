package com.kh.day09.insof;

public class instanceOfEx {

	static void print(Person p) {
		// Person p = new Student();
//		if (p instanceof Person)
//			System.out.println("Person입니다!");
		if (p instanceof Student)
			System.out.println("Student입니다.");
		if (p instanceof Researcher)
			System.out.println("Researcher입니다.");
		if (p instanceof Professor) {
			System.out.println("Professor입니다!");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print(new Person());
		print(new Student());	// --> 다형성, 업캐스팅
		print(new Researcher());	// --> 다형성, 업캐스팅
		print(new Professor()); // --> 다형성, 업캐스팅
	}

}
