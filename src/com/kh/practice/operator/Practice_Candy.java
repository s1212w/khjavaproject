package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Candy {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수를 입력하세요 : ");
		int person = sc.nextInt();

		System.out.print("사탕 수를 입력하세요 : ");
		int candy = sc.nextInt();

		System.out.println("인원 수 : " + person);
		System.out.println("사탕 수 : " + candy);
		System.out.println("1인당 사탕 개수 : " + candy / person);
		System.out.println("남는 사탕 개수 : " + candy % person);

	}

}
