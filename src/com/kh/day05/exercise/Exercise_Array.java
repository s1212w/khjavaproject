package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// 길이가 100인 배열 선언,
		// 1부터 100까지의 값을 순서대로 넣고 출력하기

		int[] arrayList = new int[100];

		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = i + 1;
			System.out.print(arrayList[i] + " ");
		}

	}

	public void exercise2() {
		// 길이가 5인 String 배열을 선언하고
		// 딸기, 복숭아, 키위, 사과, 바나나로 초기화 한 후,
		// for문을 활용해서 바나나가 있으면 바나나를 출력해보세요.
		String[] fruits = { "딸기", "복숭아", "키위", "사과", "바나나" };
//		arrayList2[0] = "딸기";
//		arrayList2[1] = "복숭아";
//		arrayList2[2] = "키위";
//		arrayList2[3] = "사과";
//		arrayList2[4] = "바나나";

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == "바나나") {
				System.out.print(fruits[i] + " ");
			}
		}

	}

	public void exercise3() {
		// 양의 정수 5개를 입력받아 배열에 저장
		// 입력받은 값들의 평균 구하기

		int[] array = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("양의  정수 5개를 입력하세요 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}

		System.out.println("평균은" + (double) (sum / array.length) + "입니다.");

	}

	public void exercise4() {
		// 양의 정수 5개를 입력받아 배열에 저장
		// 제일 큰 수 출력

		int[] array = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("양의  정수 5개를 입력하세요 : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("가장 큰 수 : " + max);
	}

	public void exercise5() {
		// 사용자에게 주민번호를 입력 받은 후
		// 성별 자리 이후부터 *로 출력되도록 프로그램을 작성하시오
		// 210618-1124600 --> 210618-1******

		Scanner sc = new Scanner(System.in);

		char[] origin = new char[14];

		System.out.print("주민번호 입력 ('-'포함) : ");
		String numberNum = sc.next();

		for (int i = 0; i < origin.length; i++) {
			origin[i] = numberNum.charAt(i);
		}

		// char[] copy = origin; // copy 배열에 origin 배열을 복사 (얕은 복사)

		char[] copy = new char[14];

		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}

		System.out.println();

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}
	}
}
