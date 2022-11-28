package com.kh.day04.exercise;

public class Exercise_Array5 {
	public static void main(String[] args) {
		// 최대최소출력1

		int[] arrayList = new int[10];

		int min = arrayList[0];
		int max = arrayList[0];
		// int num = 0;

		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < 10; i++) {
			if (arrayList[i] < min) {
				min = arrayList[i];
			}

			if (arrayList[i] > max) {
				max = arrayList[i];
			}
		}

		for (int a : arrayList) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

	}
}