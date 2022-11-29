package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For { // 메소드 설명

	public void exercise1() { // public 접근제어자, void 반환형, exercise1 은 메소드

		// 누적합
		// 1+2+3+4+5+6+7+8+9+10

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1부터 10까지의 합 : " + sum);
	}

	
	public void exercise2() {

		// 1부터 10까지의 덧셈 표시, 합 구하기
		// 1+2...+10 =55

		int result = 0;
		int i = 0;

		for (i = 1; i <= 10; i++) {
			result = i + result;
			System.out.print(i);
			if (i <= 9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(result);

	}

	
	public void exercise3() {
		// 구구단 출력하기
		// 2*1=2

		int num = 2;

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	
	public void exercise4() {
		// 정수를 하나 입력 받아서 그 수가 1~9 사이의 수 일때만 구구단 출력
		// 그 수의 구구단 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("출력할 단을 입력하세요 : ");
		int num = sc.nextInt();

		int i = 0;

		if (i <= num && num <= 9) {
			for (i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else {
			System.out.println("1~9사이의 양수를 입력하여야 합니다.");
		}
	}
}
