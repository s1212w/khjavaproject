package com.kh.day02.exscanner;

import java.util.Scanner;

public class TestScanner2 {
	public static void main(String [] args) {
		//�Է¹��� �� �ִ� �����ʹ� ����, �Ǽ�, ���ڿ�, ����!! =--> �����Է� ���迡 ���� �� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int iNum = sc.nextInt();
		
		System.out.print("�Ǽ��� �Է��ϼ��� : ");
		double dNum = sc.nextDouble();
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String words = sc.next(); //nextString�� ��������
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		char word = sc.next().charAt(0); // string���� �޾Ƽ� ���ڿ� �߿� ���� ù��°
										// �ܾ��� 0��° �ܾ ��ȯ���ִ� charAt(0)�� ����
		
		System.out.println("�Է��� ������ : " + iNum);
		System.out.println("�Է��� �Ǽ��� : " + dNum);
		System.out.println("�Է��� ���ڿ��� : " + words);
		System.out.println("�Է��� ���ڴ� : " + word);
		
		
		
		
		
	}

}
