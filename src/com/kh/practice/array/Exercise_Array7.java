package com.kh.practice.array;

import java.util.Scanner;

public class Exercise_Array7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ҽ� ã��

		Scanner sc = new Scanner(System.in);

		boolean isPrime = false;

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = true;
				break;
			}
		}

		if (isPrime) {
			System.out.println("�Ҽ��� �ƴմϴ�.");
		} else if (num == 0) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println("�Ҽ��Դϴ�.");
		}

	}

}
