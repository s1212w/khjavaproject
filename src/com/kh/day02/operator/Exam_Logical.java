package com.kh.day02.operator;

public class Exam_Logical {
	public static void main(String [] args) {
		System.out.println("논리연산자 예제");
		
		int num1 = 50;
		int num2 = 30;
		boolean result1, result2, result3, result4; //변수의 선언
		
		//num1과 num2가 다르면서 num2가 num1보다 클 때
		
		result1 = (num1 != num2) && (num1 < num2);
		System.out.println(result1);
		
		result2 = (num1 < num2) || (num1 == num2);
		System.out.println(result2);
		
		result3 = (num1 > num2) && (num1 != num2);
		System.out.println(result3);
		
		result4 = (num1 > num2) || (num1 == num2);
		System.out.println(result4);
		
		System.out.println();
		System.out.println("논리연산자 예제2");
		
		int aNum = 70;
		int bNum = 55;
		
		result1 = (aNum == bNum) || (aNum++ < 100); //true
		result2 = (aNum < bNum) && (bNum++ < 55); //false
		result3 = (aNum != bNum) && (bNum-- < aNum++); //true
		result4 = (aNum++ != bNum) || (bNum++ >=85); // true
		
		System.out.println();
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		System.out.println("aNum의 값 : " + aNum);
		System.out.println("bNum의 값 : " + bNum);
		
		
		
		
	}

}
