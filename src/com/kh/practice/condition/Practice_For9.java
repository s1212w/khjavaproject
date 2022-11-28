package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For9 {
	public static void main(String[] args) {

		// 별찍기3

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력  : ");
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
