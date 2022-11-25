package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("비교연산자 예제");
		// 두 값을 비교하는 연산자, 관계연산자
		// 비교연산자는 조건을 만족하면 true, 아니면 false를 반환함
		
		int num1 = 50;
		int num2 = 30;
		boolean result = num1 < num2;
		System.out.println("num1 < num2 의 결과 : " + result);
		result = num1 > num2;
		System.out.println("num1 > num2 의 결과 : " + result);
		result = num1 == num2;
		System.out.println("num1 == num2 의 결과 : " + result);
		result = num1 != num2;
		System.out.println("num1 != num2 의 결과 : " + result);
		
		int num = 2;
		System.out.println(num/2); 
		System.out.println(num%2); //모듈러스
	}

}
