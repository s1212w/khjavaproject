package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		//50이 1~100 사이의 숫자인지 확인하세요
		//50이라는 숫자는 변수 num에 초기화해주세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		
		int num ; 
		num = sc.nextInt();
		
		boolean result;
		
		result = (1 <= num) && (num <=100);
		
		System.out.println(result);
		
		
	}

}
