package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For9 {
	public static void main(String[] args) {

		// �����3

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է�  : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= 1; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}
	}
}
