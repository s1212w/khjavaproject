package com.kh.day05.exercise;

import java.util.Scanner;

public class Exercise_While {

	public void exercise1() {
		// while ���� �̿��Ͽ� 1~100 ������ Ȧ���� ���� ����Ͻÿ�.

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

		// if�� ��� i=i+2 or i+=2�� ǥ�� ����
	}

	
	public void exercise2() {
		// ������ �ϳ� �Է� �޾Ƽ� �� ���� 1~9 ������ �� �϶��� ������ ���

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (1 <= num && num <= 9) {
			int i = 1;
			while (i <= 9) {
				System.out.println(num + " * " + i + " = " + num * i);
				i++;
			}
		} else {
			System.out.println("1~9 ������ ����� �Է��Ͽ��� �մϴ�.");
		}
	}

	
	public void exercise3() {
//		while���� �̿��Ͽ� -1�� �Էµ� ������ ������ �Է¹ް� -1�� �ԷµǸ� �Է��� ���� ���� ����Ͻÿ�.
//		���� �ϳ� �Է� : 3
//		���� �ϳ� �Է� : 4
//		���� �ϳ� �Է� : 7
//		���� �ϳ� �Է� : -1
//		�Է��Ͻ� ���� ���� : 14

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int hap = 0;

//		while (num != -1) {
//			System.out.print("���� �ϳ� �Է� : ");
//			num = sc.nextInt();
//			if (num != -1) {
//				hap += num;
//			}
//		}
//		System.out.println("�Է��Ͻ� ���� ���� : " + hap);

		while (true) {
			System.out.print("���� �ϳ� �Է� : ");
			num = sc.nextInt();
			if (num == -1)
				break;
			hap += num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + hap);
	}
}
