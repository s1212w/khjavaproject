package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If5 {
	public static void main(String[] args) {
//		�����Ǻ�2
//		
//		3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
//
//		ex.
//		�Է�1 : 5
//		�Է�2 : -8
//		�Է�3 : 5
//		false

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();

		System.out.print("�ι�° ���� �Է��ϼ��� : ");
		int num2 = sc.nextInt();

		System.out.print("����° ���� �Է��ϼ��� : ");
		int num3 = sc.nextInt();

		if (num1 == num2 && num2 == num3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
