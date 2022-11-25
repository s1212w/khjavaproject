package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// 두 개의 정수를 입력받고 연산자를 입력받아서
		// 계산하는 계산기 프로그램을 작성하시오
		// 정수를 입력해주세요 : 11
		// 정수를 한번 더 입력해주세요 : 22
		// 연산자를 입력해주세요(+,-,*,/,%) : %
		// 결과 : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);

		int num1, num2, result = 0;
		char op;

		System.out.print("정수를 입력해주세요 : ");
		num1 = sc.nextInt();

		System.out.print("정수를 한번 더 입력해주세요 : ");
		num2 = sc.nextInt();

		System.out.print("연산자를 입력해주세요(+,-,*,/,%) : ");
		op = sc.next().charAt(0);

		if (op == '+') {
			result = (num1 + num2);
		} else if (op == '-') {
			result = (num1 - num2);
		} else if (op == '*') {
			result = (num1 * num2);
		} else if (op == '/') {
			result = (num1 / num2);
		} else if (op == '%') {
			result = (num1 % num2);
		}

		System.out.println("결과 : " + num1 + " " + op + " " + num2 + " = " + result);
	}

}
