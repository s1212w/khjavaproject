package com.kh.practice.operator;

import java.util.Scanner;

public class Practice_Candy {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� ���� �Է��ϼ��� : ");
		int person = sc.nextInt();

		System.out.print("���� ���� �Է��ϼ��� : ");
		int candy = sc.nextInt();

		System.out.println("�ο� �� : " + person);
		System.out.println("���� �� : " + candy);
		System.out.println("1�δ� ���� ���� : " + candy / person);
		System.out.println("���� ���� ���� : " + candy % person);

	}

}
