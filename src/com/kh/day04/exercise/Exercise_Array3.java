package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Array3 {
	public static void main(String [] args) {
		//�迭���3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int i = sc.nextInt();
		
		int[] arrayList = new int[i];
		
		for (int j = 0; j <i; j++) {
			arrayList[j] = j+1;
			System.out.print
			(arrayList[j]+" ");
		}
		
		
	}
}
