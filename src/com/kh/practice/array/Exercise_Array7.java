package com.kh.practice.array;

import java.util.Scanner;

public class Exercise_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 소수 찾기

		Scanner sc = new Scanner(System.in);

		boolean isPrime = false;

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (isPrime) {
			System.out.println("소수가 아닙니다.");
		} else if (num == 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println("소수입니다.");
		}

	}

}
