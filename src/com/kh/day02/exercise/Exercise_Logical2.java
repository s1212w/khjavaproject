package com.kh.day02.exercise;

import java.util.Scanner;

public class Exercise_Logical2 {
	public static void main(String [] args) {
		// ���� A�� �빮������ �ҹ������� Ȯ���ϼ���!
		// ��, A��� ���ڴ� ���� word�� �ʱ�ȭ���ּ���.
		// ���� �빮�� Ȯ�� : true
		// �ƽ�Ű�ڵ� Ȱ�� A=65 ~ Z=90
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		
		
		char word ;
		word = sc.next().charAt(0);
		
		
		boolean result;
		
		result = (65 <= word) && (word <= 90);
		
		System.out.println(result);
	}

}
