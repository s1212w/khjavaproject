package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int month;
		double height;
		char gender;
		String add;
		
		
		System.out.print("�̸��� �Է����ּ��� : ");
		name = sc.next(); //���� or ���ʹ� �Է� �� ����
		
		System.out.print("�¾ ���� �Է����ּ��� : ");
		month = sc.nextInt();
		
		System.out.print("Ű�� �Է����ּ��� : ");
		height = sc.nextDouble();
		
		System.out.print("������ �Է����ּ��� : ");
		gender = sc.next().charAt(0);
		
		System.out.print("�ּҸ� �Է����ּ��� : ");
		sc.nextLine(); // �ٸ� �Է¸޼ҵ�ʹ� �ٸ��� nextLine()�� �� �� �� �߰�
						//why? nextLine()�� ���ٸ� ���� ��� ���� �ѹ����� ���α׷��� 
						// �����Ͱ��� �Է� �޾Ҵٰ� �Ǵ��Ͽ� �����
		add = sc.nextLine();
		
		System.out.println();
		System.out.println("�̸��� " + name + "�Դϴ�.");
		System.out.println("�¾ ���� " + month + "�� �Դϴ�.");
		System.out.println("Ű�� " + height + "�Դϴ�.");
		System.out.println("������ " + gender + "�Դϴ�.");
		System.out.println("�ּҴ� " + add + "�Դϴ�.");		
		
		
	}

}
