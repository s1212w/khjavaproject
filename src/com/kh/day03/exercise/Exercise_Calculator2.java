package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("������ �ϳ� �� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է��ϼ��� : ");
		char op = sc.next().charAt(0);

		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;

		}
		System.out.println(result);
	}
}
