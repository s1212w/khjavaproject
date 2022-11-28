package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_Calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		for (;;) {
			System.out.print("정수를 하나 입력하세요 : ");
			int num1 = sc.nextInt();

			System.out.print("정수를 하나 더 입력하세요 : ");
			int num2 = sc.nextInt();

			System.out.print("연산자를 입력하세요 : ");
			char op = sc.next().charAt(0);

			int result = 0;

			switch (op) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			}
			System.out.println(result);
			count++; //출력에 성공을 했을 때 카운트 up
			if(count == 3) break;
			
		}

	}
}
