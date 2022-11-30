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

	static int korean = 0, english = 0, math = 0; // 전역변수, 클래스변수

	public static void printMenu() {
		System.out.println("===== 메인메뉴 =====");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}

	public static void inputScore() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 성적 입력 =====");
		System.out.print("국어 : ");
		korean = sc.nextInt();
		System.out.print("영어 : ");
		english = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
	}

	public static void printScore() {
		int sum = korean + english + math;
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("총점  : " + sum);
		System.out.printf("평균 : %.2f \n", (double) (sum / 3));
	}
	
	public static void goodByeMsg() {
		System.out.println("Good Bye");
	}
	
	public static void printException() {
		System.out.println("1~3 사이의 수를 입력해주세요.");
	}

}
