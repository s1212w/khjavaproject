package com.kh.practice.exercise;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나이판별1

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num <= 13) {
			System.out.println("어린이");
		} else if (num > 19) {
			System.out.println("성인");
		} else {
			System.out.println("청소년");
		}

	}

}
