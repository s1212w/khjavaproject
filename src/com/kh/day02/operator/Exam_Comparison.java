package com.kh.day02.operator;

public class Exam_Comparison {
	public static void main(String [] args) {
		System.out.println("�񱳿����� ����");
		// �� ���� ���ϴ� ������, ���迬����
		// �񱳿����ڴ� ������ �����ϸ� true, �ƴϸ� false�� ��ȯ��
		
		int num1 = 50;
		int num2 = 30;
		boolean result = num1 < num2;
		System.out.println("num1 < num2 �� ��� : " + result);
		result = num1 > num2;
		System.out.println("num1 > num2 �� ��� : " + result);
		result = num1 == num2;
		System.out.println("num1 == num2 �� ��� : " + result);
		result = num1 != num2;
		System.out.println("num1 != num2 �� ��� : " + result);
		
		int num = 2;
		System.out.println(num/2); 
		System.out.println(num%2); //��ⷯ��
	}

}
