package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If6 {
	public static void main(String[] args) {
		// �����Ǻ�3

		Scanner sc = new Scanner(System.in);

		System.out.print("A����� ������ �Է��ϼ��� : ");
		int A = sc.nextInt();

		System.out.print("B����� ������ �Է��ϼ��� : ");
		int B = sc.nextInt();

		System.out.print("C����� ������ �Է��ϼ��� : ");
		int C = sc.nextInt();

		double A_pay, B_pay, C_pay;

		A_pay = A + (A * 0.4);
		B_pay = B + (B * 0);
		C_pay = C + (C * 0.15);
		
		System.out.println("A����� ����/����+a : " + A + "/"+ A_pay);
		if (A_pay >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("B����� ����/����+a : " + B + "/"+ B_pay);
		if (B_pay >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		
		System.out.println("C����� ����/����+a : " + C + "/"+ C_pay);
		if (C_pay >= 3000) {
			System.out.println("3000 �̻�");
		} else {
			System.out.println("3000 �̸�");
		}
		
		
		

	}

}
