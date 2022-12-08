package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p;
		Student s = new Student("일용자");
		p = s;
		//Person p = new Student("일용자"); //업캐스팅
				
		System.out.println(p.name);
	
//		System.out.println(p.grade);
//		System.out.println(p.department);
		
		//다운캐스팅
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
				
	}

}
