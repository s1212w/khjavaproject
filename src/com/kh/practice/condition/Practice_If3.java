package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If3 {
	public static void main(String[] args) {
//		�����Ǻ�1
//		Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
//
//		ex.
//		���� : -9
//		����� �ƴϴ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			System.out.println("�����");
		} else {
			System.out.println("����� �̳���");
		}
		
	}

}
