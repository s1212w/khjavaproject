package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args) {
		// 정수를 하나 입력 받아서 그 수가 1~9 사이의 수 일때만 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if (1<=num && num <=9) {
			int i = 1;
			while (i<=9) {
				System.out.println(num + " * " + i + " = " + num*i);
				i++;
			}
		} else {
			System.out.println("1~9 사이의 양수를 입력하여야 합니다.");
		}
	}

}
