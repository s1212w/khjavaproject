package com.kh.practice.condition;

import java.util.Scanner;

public class Practice_If4 {
	public static void main(String [] args) {
//		�����Ǻ�1
//		
//		Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
//		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ� �ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
//
//		ex.
//		����1 : 4
//		����2 : 11
//		�Է� : 13
//		true
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ������ �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ������ �Է��ϼ��� : ");
		int num2 = sc.nextInt();
		
		System.out.print("����° ������ �Է��ϼ��� : ");
		int input = sc.nextInt();
		
		if ((input <= num1) || (input > num2)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}

}
