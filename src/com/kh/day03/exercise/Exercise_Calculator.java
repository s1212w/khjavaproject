package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_Calculator {
	public static void main(String[] args) {
		// �� ���� ������ �Է¹ް� �����ڸ� �Է¹޾Ƽ�
		// ����ϴ� ���� ���α׷��� �ۼ��Ͻÿ�
		// ������ �Է����ּ��� : 11
		// ������ �ѹ� �� �Է����ּ��� : 22
		// �����ڸ� �Է����ּ���(+,-,*,/,%) : %
		// ��� : 11 % 22 = 11

		Scanner sc = new Scanner(System.in);

		int num1, num2, result = 0;
		char op;

		System.out.print("������ �Է����ּ��� : ");
		num1 = sc.nextInt();

		System.out.print("������ �ѹ� �� �Է����ּ��� : ");
		num2 = sc.nextInt();

		System.out.print("�����ڸ� �Է����ּ���(+,-,*,/,%) : ");
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

		System.out.println("��� : " + num1 + " " + op + " " + num2 + " = " + result);
	}

}
