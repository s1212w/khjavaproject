package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Sosu {
	public static void main(String[] args) {
		
		//�Ҽ� �Ǻ�

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num > 2) {

			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				} else {
					System.out.println("�Ҽ��Դϴ�.");
					break;
				}

			}
		} else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ");
		}
	}
}
