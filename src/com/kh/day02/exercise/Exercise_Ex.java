package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Ex {
	
	public static void main(String [] args) {
		
		String name;
		int age;
		double height;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		name = sc.next();
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		System.out.println("몸무게를 입력하세요");
		height = sc.nextDouble();
		
		
		System.out.println(name + " " + age + " " + height);
		
		
		
	}
	
}