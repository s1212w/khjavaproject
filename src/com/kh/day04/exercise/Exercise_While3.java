package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_While3 {
	public static void main(String[] args) {
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
		
		
		
		while(true) {
			System.out.print("���� �ϳ� �Է� : ");
			num = sc.nextInt();
			if (num == -1) break;
			hap +=num;
		}
		System.out.println("�Է��Ͻ� ���� ���� : " + hap);
	}

}
