package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If1 {
	public static void main(String[] args) {
//		�����Ǻ�1
//		
//		Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
//
//		ex.
//		���� : -9
//		������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("�����");
		} else if (num < 0) {
			System.out.println("������");
		} else {
			System.out.println("0�̴�");
		}
	}

}
