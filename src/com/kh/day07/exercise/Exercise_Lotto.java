package com.kh.day07.exercise;

import java.util.Random;

public class Exercise_Lotto {
	public void lottoProgram() {
		// �ζǹ�ȣ �ڵ� ������ ���α׷�, �ߺ� ���� �����ϱ�
		// ��, ����� ������������ ����
		// �ζ� ��ȣ�� 6��
		// �ζ� ��ȣ�� ������ 1~45

		Random rand = new Random();

		int[] number = new int[6];

		// ���� ��ȣ ����
		for (int i = 0; i < number.length; i++) {
			number[i] = rand.nextInt(45) + 1;
			for (int e = 0; e < i; e++) { // �ߺ� ����
				if (number[i] == number[e]) {
					i--;
					break;
				}
			}
		}

		// ���� ����
		for (int i = 0; i < number.length - 1; i++) {
			for (int j = 0; j < (number.length - 1) - i; j++) {
				if (number[j] > number[j + 1]) {
					int temp = number[j + 1];
					number[j + 1] = number[j];
					number[j] = temp;
				}

			}
		}

		// ���
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}

	}

}
