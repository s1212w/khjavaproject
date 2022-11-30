package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		HOME :
		while (true) {
			printMenu();
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				inputScore();
				break;
			case 2:
				printScore();
				break;
			case 3:
				goodByeMsg();
				break HOME;
				
			case 4:
				printException();
				break;
			}
		}

	}

	static int korean = 0, english = 0, math = 0; // ��������, Ŭ��������

	public static void printMenu() {
		System.out.println("===== ���θ޴� =====");
		System.out.println("1. �����Է�");
		System.out.println("2. �������");
		System.out.println("3. ����");
		System.out.print("���� : ");
	}

	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ���� �Է� =====");
		System.out.print("���� : ");
		korean = sc.nextInt();
		System.out.print("���� : ");
		english = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
	}

	public static void printScore() {
		int sum = korean + english + math;
		System.out.println("���� : " + korean);
		System.out.println("���� : " + english);
		System.out.println("���� : " + math);
		System.out.println("����  : " + sum);
		System.out.printf("��� : %.2f \n", (double) (sum / 3));
	}
	
	public static void goodByeMsg() {
		System.out.println("Good Bye");
	}
	
	public static void printException() {
		System.out.println("1~3 ������ ���� �Է����ּ���.");
	}

}
