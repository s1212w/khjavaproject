package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int korean = 0, english = 0, math = 0;

		LALALA: while (true) {
			System.out.println("===== ���θ޴� =====");
			System.out.println("1. �����Է�");
			System.out.println("2. �������");
			System.out.println("3. ����");

			System.out.print("���� : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("===== ���� �Է� =====");
				System.out.print("���� : ");
				korean = sc.nextInt();
				System.out.print("���� : ");
				english = sc.nextInt();
				System.out.print("���� : ");
				math = sc.nextInt();
				break;

			case 2:
				System.out.println("���� : " + korean);
				System.out.println("���� : " + english);
				System.out.println("���� : " + math);
				System.out.println();
				System.out.println("����  : " + (korean + english + math));
				System.out.printf("��� : %.2f \n", (double) (korean + english + math) / 3);
				break;

			case 3:
				System.out.println("good Bye~");
				break LALALA;

			default:
				System.out.println("1~3 ������ ���� �Է����ּ���.");
				break;

			}
		}
	}

}
