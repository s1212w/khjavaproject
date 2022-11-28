package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_For4 {
	public static void main(String[] args) {
		// 정수를 하나 입력 받아서 그 수가 1~9 사이의 수 일때만 구구단 출력

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
