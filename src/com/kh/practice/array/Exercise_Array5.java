package com.kh.practice.array;

import java.util.Random;

public class Exercise_Array5 {
	public static void main(String[] args) {
		// �ִ��ּ����1

		int[] arrayList = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i <arrayList.length; i++) {
			arrayList[i] = rand.nextInt(21)+10; //10���� 30���� ���� �߱�, ������ ���ϴ� ������ �����ϱ�
		}

		int min = arrayList[0];  //�ּҰ��� �迭�� 0��°�� �ʱⰪ���� �־���
		int max = arrayList[0];  //�ִ밪�� �迭�� 0��°�� �ʱⰪ���� �־���

		for (int i = 0; i < arrayList.length; i++) { //�迭�� ũ�⸸ŭ for���� ���ư��� ���� �� �迭�� ���� ���Ͽ� �ִ�,�ּҰ��� �־���
			if (arrayList[i] < min) {
				min = arrayList[i];
			}

			if (arrayList[i] > max) {
				max = arrayList[i];
			}
		}

		for (int a : arrayList) {
			System.out.print(a + " ");
		}
		
		System.out.println();

		System.out.println("�ּҰ� : " + min);
		System.out.println("�ִ밪 : " + max);

	}
}