package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical1 {
	public static void main(String [] args) {
		//50�� 1~100 ������ �������� Ȯ���ϼ���
		//50�̶�� ���ڴ� ���� num�� �ʱ�ȭ���ּ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		int num ; 
		num = sc.nextInt();
		
		boolean result;
		
		result = (1 <= num) && (num <=100);
		
		System.out.println(result);
		
		
	}

}
