package com.kh.day03.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String[] args) {
		// indent ���� : ctrl + shift + f
		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ϳ� �Է� : ");
		int input = sc.nextInt();

		String result = "";

		if (input > 0) {
			result = "���� ����";
		} else if (input < 0) {
			result = "���� ����";
		} else {
			result = "0";
		}

		System.out.println(input + "��/�� " + result + "�Դϴ�.");
	}

}
