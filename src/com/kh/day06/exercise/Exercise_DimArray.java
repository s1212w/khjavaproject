package com.kh.day06.exercise;

public class Exercise_DimArray {
	public void exercise1() {

		int[][] arrs = new int[5][5];
		int k = 1;

		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs[i].length - 1; j >= 0; j--) {
				arrs[i][j] = k;
				k++;
			}

		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise2() {

		int[][] arrs = new int[5][5];
		int k = 1;

		for (int i = 0; i < arrs.length; i++) {
			for (int j = arrs[i].length - 1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}

		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise3() {

		int[][] arrs = new int[5][5];
		int k = 1;

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise4() {

		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 15
		// 21 22 23 24 25

		int[][] arrs = new int[5][5];
		int k = 1;

		for (int i = 0; i < arrs.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < arrs[i].length; j++) {
					arrs[i][j] = k;
					k++;
				}
			} else {
				for (int j = arrs[i].length - 1; j >= 0; j--) {
					arrs[i][j] = k;
					k++;
				}
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}

	}

	public void exercise5() {
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라

		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;

		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];
			}
		}
		int sero = score.length ;
		int garo = score[0].length ;
		System.out.println(sum/(garo*sero));
	}

}
