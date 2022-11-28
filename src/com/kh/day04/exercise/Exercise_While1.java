package com.kh.day04.exercise;

public class Exercise_While1 {
	public static void main(String[] args) {
		// while 문을 이용하여 1~100 사이의 홀수의 합을 출력하시오.

		int i = 1;
		int result = 0;

		while (i < 100) {
			if (i % 2 == 1) {
				result = result + i;
				i++;
			} else {
				i++;
			}
		}
		System.out.println(result);
	}
}
