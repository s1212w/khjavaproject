package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For8 {
	public static void main(String[] args) {
		// �ݺ����ǽ�4

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			for (int i = num1; i <= num2; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("0 �̻��� ���ڸ� �Է����ּ���.");
		}

	}

}
