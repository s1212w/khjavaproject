package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Ex {
	
	public static void main(String [] args) {
		
		String name;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		name = sc.next();
		
		System.out.println("���̸� �Է��ϼ���");
		age = sc.nextInt();
		
		System.out.println("�����Ը� �Է��ϼ���");
		height = sc.nextDouble();
		
		
		System.out.println(name + " " + age + " " + height);
		
		
		
	}
	
}