package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Sosu {
	public static void main(String[] args) {
		
		//소수 판별

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num > 2) {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("소수가 아닙니다.");
					break;
				} else {
					System.out.println("소수입니다.");
					break;
				}

			}
		} else {
			System.out.println("잘못 입력하셨습니다. ");
		}
	}
}
