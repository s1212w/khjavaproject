package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_For3 {
	public static void main(String[] args) {
//		�ݺ����ǽ�1
//		
//		����ڷκ��� �� ���� ���� �Է� �޾� 1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���. ��, �Է��� ���� 1���� ũ�ų� ���ƾ� �մϴ�.
//		���� 1 �̸��� ���ڰ� �Էµƴٸ� ��1 �̻��� ���ڸ� �Է����ּ��䡰�� ����ϼ���.
//
//		ex.
//		1�̻��� ���ڸ� �Է��ϼ��� : 4 
//		1 2 3 4
//
//		1�̻��� ���ڸ� �Է��ϼ��� : 0
//		1 �̻��� ���ڸ� �Է����ּ���.

		Scanner sc = new Scanner(System.in);

		System.out.print("1 �̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();

		if (num >= 1) {

			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}
	}

}
