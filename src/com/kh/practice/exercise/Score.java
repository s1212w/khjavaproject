package com.kh.practice.exercise;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���1

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸� : ");
		String name = sc.next();

		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();

		System.out.print("��(���ڸ� ) : ");
		int ban = sc.nextInt();

		System.out.print("��ȣ(���ڸ� ) : ");
		int bunho = sc.nextInt();

		System.out.print("����(M/F) : ");
		String gender = sc.next();
		String student="";
		if (gender == "M") {
			student = "���л�";
		} else if (gender == "F") {
			student = "���л�";
		}

		System.out.print("����(�Ҽ��� ��°�ڸ����� ) : ");
		double score = sc.nextDouble();

		System.out.println(grade + "�г� " + ban + "�� " + bunho + "�� " + name + " " + student + "�� ������ " + score + "�̴�.");
		// 3�г� 4�� 15�� �ֿ��� ���л��� ������ 85.75�̴�.

	}

}
