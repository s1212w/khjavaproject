package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If2 {
	public static void main(String []args) {
		//¦Ȧ�Ǻ�1
//		Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
//
//		ex.
//		���� : 5
//		Ȧ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("¦����");
		} else if (input != 0) {
			System.out.println("Ȧ����");
		}
	}

}
