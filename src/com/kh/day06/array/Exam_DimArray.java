package com.kh.day06.array;

public class Exam_DimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arrs = new int[4][4];
		int k = 1;

		arrs[0][0] = 1;
		System.out.println("���� ũ��(���� ũ��) : " + arrs.length);
		System.out.println("���� ũ��(���� ũ��) : " + arrs[0].length);

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			for (int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();

		}

	}

}
