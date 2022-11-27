package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If2 {
	public static void main(String []args) {
		//짝홀판별1
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
//
//		ex.
//		정수 : 5
//		홀수다
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("짝수다");
		} else if (input != 0) {
			System.out.println("홀수다");
		}
	}

}
