package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// 로또번호 자동 생성기 프로그램, 중복 없이 추출하기
		// 단, 결과는 오름차순으로 생성
		// 로또 번호는 6개
		// 로또 번호의 범위는 1~45

		Random rand = new Random();

		int[] number = new int[6];

		// 랜덤 번호 추출
		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(45) + 1;
			for (int e = 0; e < i; e++) { // 중복 제거
				if (number[i] == number[e]) {
					i--;
					break;
				}
			}
		}

		// 버블 정렬
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < (number.length - 1) - i; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j + 1];
					number[j + 1] = number[j];
					number[j] = temp;
				}

			}
		}

		// 출력
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}

}
