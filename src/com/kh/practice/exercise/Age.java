package com.kh.practice.exercise;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����Ǻ�1

		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int num = sc.nextInt();

		if (num <= 13) {
			System.out.println("���");
		} else if (num > 19) {
			System.out.println("����");
		} else {
			System.out.println("û�ҳ�");
		}

	}

}
