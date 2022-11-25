package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// indent 정리 : ctrl + shift + f
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나 입력 : ");
		int input = sc.nextInt();

		String result = "";

		if (input > 0) {
			result = "양의 정수";
		} else if (input < 0) {
			result = "음의 정수";
		} else {
			result = "0";
		}

		System.out.println(input + "은/는 " + result + "입니다.");
	}

}
