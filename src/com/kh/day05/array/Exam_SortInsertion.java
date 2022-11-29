package com.kh.day05.array;

public class Exam_SortInsertion {
	public static void main(String[] args) {
		// 정렬 알고리즘
		// 1. 삽입정렬
		// 2. 선택정렬
		// 3. 버블정렬
		// 삽입 정렬이란?
		// 정렬 알고리즘 중에 하나이면서 가장 간단하고 기본이 되는
		// 알고리즘
		// 배열의 n번 인덱스 값을 0번에서 n-1번 인덱스까지 비교함
		// {2,5,4,1,3}

		int[] arrs = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arrs[j - 1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j - 1];
					arrs[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
