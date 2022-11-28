package com.kh.day04.exercise;

public class Exercise_Array1 {
	public static void main(String [] args) {
		
		//배열 출력1
		
		int [] arrayList = new int[10];
		
		for (int i=0;i<10; i++) {
			arrayList[i] = i+1;
			System.out.print(arrayList[i]+ " ");
		}
	}

}
