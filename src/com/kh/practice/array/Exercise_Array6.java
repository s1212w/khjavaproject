package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_Array6 {

	public static void main(String[] args) {

		// �迭 Ȱ��1
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("�迭�� ���̸� �Է��ϼ��� : ");
		int num = sc.nextInt();

		String[] arrayList = new String[num]; // ���� �迭 ����

		for (int i = 0; i < arrayList.length; i++) { // �Է¹��� ���� �迭�� ��������
			System.out.print(i + 1 + "��° ���ڿ� : ");
			String aaa = sc.next();
			arrayList[i] = aaa;
		}

		String[] arrayList2 = new String[arrayList.length]; // �迭 ����
		
		for (int i = 0; i < arrayList.length; i++) {
			arrayList2[i] = arrayList[i];
		}

		System.out.print("�� ���� �Է��Ͻðڽ��ϱ� ? (Y/N) : ");
		char answer = sc.next().charAt(0);

		if (answer == 'Y') {
			System.out.print("�Է��ϰ� ���� ���� : ");
			int answer_number = sc.nextInt();
			num = arrayList.length + answer_number;
			arrayList = new String[num]; // ���� �Է¹��� ���� ���� �迭 ũ�⿡ ���ؼ� ���ο� ũ�⿡ �迭�� ���Ҵ���

			for (int i = arrayList2.length; i < arrayList.length; i++) { // ������ �迭�� ũ����� ���Ҵ��� �迭�� ũ����� �Է� ���� ����
				System.out.print(i + 1 + "��° ���ڿ� : ");
				String aaa = sc.next();
				arrayList[arrayList2.length] = aaa;
			}
		}

		else if (answer == 'N') {
			System.out.println(Arrays.toString(arrayList));
		}
	}
}
