package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For6 {
	public static void main(String[] args) {
		//�ݺ����ǽ�3

		Scanner sc = new Scanner(System.in);

		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		for (int j = 1; j <= num; j++) {
			result = j + result;
		}

		for (int i = 1; i < num; i++) {
			System.out.print(i + " + ");
		}
			System.out.print(num + " = " + result);

	}

}
