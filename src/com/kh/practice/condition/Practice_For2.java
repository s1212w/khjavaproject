package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For2 {
	public static void main(String [] args) {
//		별찍기1
//		다음과 같은 실행 예제를 구현하세요.
//
//		ex.
//		정수 입력 : 4
//		*
//		**
//		***
//		****
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <=num ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
