package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_For { // �޼ҵ� ����

	public void exercise1() { // public ����������, void ��ȯ��, exercise1 �� �޼ҵ�

		// ������
		// 1+2+3+4+5+6+7+8+9+10

		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			sum = i + sum;
		}
		System.out.println("1���� 10������ �� : " + sum);
	}

	
	public void exercise2() {

		// 1���� 10������ ���� ǥ��, �� ���ϱ�
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
		// ������ ����ϱ�
		// 2*1=2

		int num = 2;

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}

	
	public void exercise4() {
		// ������ �ϳ� �Է� �޾Ƽ� �� ���� 1~9 ������ �� �϶��� ������ ���
		// �� ���� ������ ���

		Scanner sc = new Scanner(System.in);

		System.out.print("����� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();

		int i = 0;

		if (i <= num && num <= 9) {
			for (i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else {
			System.out.println("1~9������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}
}
