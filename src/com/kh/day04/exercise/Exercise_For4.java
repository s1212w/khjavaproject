package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		// ������ �ϳ� �Է� �޾Ƽ� �� ���� 1~9 ������ �� �϶��� ������ ���

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
