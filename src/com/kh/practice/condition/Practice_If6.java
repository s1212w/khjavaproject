package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If6 {
	public static void main(String[] args) {
		// 조건판별3

		Scanner sc = new Scanner(System.in);

		System.out.print("A사원의 연봉을 입력하세요 : ");
		int A = sc.nextInt();

		System.out.print("B사원의 연봉을 입력하세요 : ");
		int B = sc.nextInt();

		System.out.print("C사원의 연봉을 입력하세요 : ");
		int C = sc.nextInt();

		double A_pay, B_pay, C_pay;

		A_pay = A + (A * 0.4);
		B_pay = B + (B * 0);
		C_pay = C + (C * 0.15);
		
		System.out.println("A사원의 연봉/연봉+a : " + A + "/"+ A_pay);
		if (A_pay >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("B사원의 연봉/연봉+a : " + B + "/"+ B_pay);
		if (B_pay >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		System.out.println("C사원의 연봉/연봉+a : " + C + "/"+ C_pay);
		if (C_pay >= 3000) {
			System.out.println("3000 이상");
		} else {
			System.out.println("3000 미만");
		}
		
		
		

	}

}
