package com.kh.day04.exercise;

public class Exercise_For2 {
	public static void main(String[] args) {
		// 1���� 10������ ���� ǥ��, �� ���ϱ�
		// 1+2...+10 =55

		int result = 0;
		int i = 0;

		for (i = 1; i <= 10; i++) {
			result = i + result;
			System.out.print(i);
			if(i<=9) {
				System.out.print("+");
			} else {
				System.out.print("=");
			}
		}
		System.out.print(result);

	}

}
