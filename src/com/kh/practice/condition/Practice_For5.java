package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For5 {
	public static void main(String[] args) {
		// ���������2

		Scanner sc = new Scanner(System.in);

		System.out.print("����ϰ� ���� �ܼ� �Է� : ");
		int num = sc.nextInt();

		if (num <= 9) {
			for (int i = num; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		} else {
			System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}

	}

}
