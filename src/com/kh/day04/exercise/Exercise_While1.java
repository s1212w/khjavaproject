package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// while ���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�.

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
	}
}
