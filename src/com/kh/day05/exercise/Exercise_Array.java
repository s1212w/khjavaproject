package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_Array {
	public void exercise1() {
		// ���̰� 100�� �迭 ����,
		// 1���� 100������ ���� ������� �ְ� ����ϱ�

		int[] arrayList = new int[100];

		for (int i = 0; i < arrayList.length; i++) {
			arrayList[i] = i + 1;
			System.out.print(arrayList[i] + " ");
		}

	}

	public void exercise2() {
		// ���̰� 5�� String �迭�� �����ϰ�
		// ����, ������, Ű��, ���, �ٳ����� �ʱ�ȭ �� ��,
		// for���� Ȱ���ؼ� �ٳ����� ������ �ٳ����� ����غ�����.
		String[] fruits = { "����", "������", "Ű��", "���", "�ٳ���" };
//		arrayList2[0] = "����";
//		arrayList2[1] = "������";
//		arrayList2[2] = "Ű��";
//		arrayList2[3] = "���";
//		arrayList2[4] = "�ٳ���";

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == "�ٳ���") {
				System.out.print(fruits[i] + " ");
			}
		}

	}

	public void exercise3() {
		// ���� ���� 5���� �Է¹޾� �迭�� ����
		// �Է¹��� ������ ��� ���ϱ�

		int[] array = new int[5];
		int sum = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("����  ���� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			sum = sum + array[i];
		}

		System.out.println("�����" + (double) (sum / array.length) + "�Դϴ�.");

	}

	public void exercise4() {
		// ���� ���� 5���� �Է¹޾� �迭�� ����
		// ���� ū �� ���

		int[] array = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.println("����  ���� 5���� �Է��ϼ��� : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("���� ū �� : " + max);
	}

	public void exercise5() {
		// ����ڿ��� �ֹι�ȣ�� �Է� ���� ��
		// ���� �ڸ� ���ĺ��� *�� ��µǵ��� ���α׷��� �ۼ��Ͻÿ�
		// 210618-1124600 --> 210618-1******

		Scanner sc = new Scanner(System.in);

		char[] origin = new char[14];

		System.out.print("�ֹι�ȣ �Է� ('-'����) : ");
		String numberNum = sc.next();

		for (int i = 0; i < origin.length; i++) {
			origin[i] = numberNum.charAt(i);
		}

		// char[] copy = origin; // copy �迭�� origin �迭�� ���� (���� ����)

		char[] copy = new char[14];

		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			System.out.print(copy[i]);
		}

		System.out.println();

		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i]);
		}
	}
}
