package com.kh.day06.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {
	public void practice() {
		while (true) {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.print("���� �ϳ� �Է����ּ��� : ");
				int num1 = sc.nextInt();

				System.out.print("���� �ϳ� �� �Է����ּ��� : ");
				int num2 = sc.nextInt();

				System.out.println("�����帱�Կ�");
				int result = num1 / num2;

				System.out.println("���� " + result + "�Դϴ�");
				break;

			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");

			}
		}
	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				num = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				sc.next(); //�Է��� R�� ����
				i--;		// 1�� �ٽ� ������ -1 ���� i++�� ������ 1�� �Ǳ� ���ؼ�
				continue;	// sum +=num;�� ��ŵ�ϵ��� ��
			}

			sum += num;
		}

			System.out.println("���� " + sum);
	}
	
	
}