package com.kh.day09.upcasting;

public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p;
		Student s = new Student("�Ͽ���");
		p = s;
		//Person p = new Student("�Ͽ���"); //��ĳ����
				
		System.out.println(p.name);
	
//		System.out.println(p.grade);
//		System.out.println(p.department);
		
		//�ٿ�ĳ����
		System.out.println(((Student)p).grade);
		System.out.println(((Student)p).department);
		
				
	}

}
