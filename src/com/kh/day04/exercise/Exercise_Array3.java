package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Array3 {
	public static void main(String [] args) {
		//배열출력3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int i = sc.nextInt();
		
		int[] arrayList = new int[i];
		
		for (int j = 0; j <i; j++) {
			arrayList[j] = j+1;
			System.out.print
			(arrayList[j]+" ");
		}
		
		
	}
}
