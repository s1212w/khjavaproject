package com.kh.practice.array;

public class Exercise_Array2 {
	public static void main(String[] args) {
		// 배열출력2

		int[] arrayList = new int[10];

		for (int i = 9; i >= 0; i--) {
			arrayList[i] = i+1;
			System.out.print(arrayList[i]+" ");
		}

	}

}
