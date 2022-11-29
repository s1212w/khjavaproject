package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while 문을 이용하여 1~100 사이의 홀수의 합을 출력하시오.

		int i = 1;
		int result = 0;

		while (i < 100) {
			if (i % 2 == 1) {
				result = result + i;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(result);

		// if문 대신 i=i+2 or i+=2로 표현 가능
	}

	
	public void exercise2() {
		// 정수를 하나 입력 받아서 그 수가 1~9 사이의 수 일때만 구구단 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (1 <= num && num <= 9) {
			int i = 1;
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	}

	
	public void exercise3() {
//		while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 -1이 입력되면 입력한 수의 합을 출력하시오.
//		정수 하나 입력 : 3
//		정수 하나 입력 : 4
//		정수 하나 입력 : 7
//		정수 하나 입력 : -1
//		입력하신 수의 합은 : 14

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int hap = 0;

//		while (num != -1) {
//			System.out.print("정수 하나 입력 : ");
//			num = sc.nextInt();
//			if (num != -1) {
//				hap += num;
//			}
//		}
//		System.out.println("입력하신 수의 합은 : " + hap);

		while (true) {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			if (num == -1)
				break;
			hap += num;
		}
		System.out.println("입력하신 수의 합은 : " + hap);
	}
}
