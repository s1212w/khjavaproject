package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For8 {
	public static void main(String[] args) {
		// 반복문실습4

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();

		System.out.print("두번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("0 이상의 숫자를 입력해주세요.");
		}

	}

}
