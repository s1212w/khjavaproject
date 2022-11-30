package com.kh.day06.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int korean = 0, english = 0, math = 0;

		LALALA: while (true) {
			System.out.println("===== 메인메뉴 =====");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");

			System.out.print("선택 : ");
			num = sc.nextInt();

			switch (num) {
			case 1:
				System.out.println("===== 성적 입력 =====");
				System.out.print("국어 : ");
				korean = sc.nextInt();
				System.out.print("영어 : ");
				english = sc.nextInt();
				System.out.print("수학 : ");
				math = sc.nextInt();
				break;

			case 2:
				System.out.println("국어 : " + korean);
				System.out.println("영어 : " + english);
				System.out.println("수학 : " + math);
				System.out.println();
				System.out.println("총점  : " + (korean + english + math));
				System.out.printf("평균 : %.2f \n", (double) (korean + english + math) / 3);
				break;

			case 3:
				System.out.println("good Bye~");
				break LALALA;

			default:
				System.out.println("1~3 사이의 수를 입력해주세요.");
				break;

			}
		}
	}

}
