package com.kh.day08.student;

import java.util.Scanner;

public class StudentFunction {
	Student[] students; // 배열 선언

	public StudentFunction() {
		students = new Student[3]; // 배열 할당, 화살표 만들어지지 않은 상태
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("====== 학생 성적 =====");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int menu = sc.nextInt();
		return menu;
	}

	public void inputScore() {
		for (int i = 0; i < students.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===== " + (i + 1) + "번째 학생 정보 입력 =====");
			System.out.print("학생 이름 입력 : ");
			String name = sc.next();
			System.out.print("1차 점수 입력 : ");
			int firstScore = sc.nextInt();
			System.out.print("2차 점수 입력 : ");
			int secondScore = sc.nextInt();
			students[i] = new Student();
			students[i].setName(name);
			students[i].setFirstScore(firstScore);
			students[i].setSecondScore(secondScore);
		}
	}

	public void printScore() {
		for (int i = 0; i < students.length; i++) {
			System.out.println("======" + (i + 1) + "번째 학생 정보 출력======");
			System.out.println(students[i].getName() + "학생의 점수는");
			System.out.println(
					"1차 점수 : " + students[i].getFirstScore() + "2차 점수 : " + students[i].getSecondScore() + "입니다 ");

		}
	}

	public void checkPass() {
		/*
		 * 0.재평가 여부는 1차, 2차가 각각 다르다. 1.각각의 점수가 40점 미만의 경우 과락으로 재평가 대상자가 된다. 1차,2차의
		 * 평균이60점 이상이면 40점 미만인 과목만 재평가를 본다. 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 한다. 3. 1차 점수와
		 * 2차 점수의 평균이 60점 미만의 경우 60점 미만의 과목에 대해서 재평가를 본다.
		 */

		for (int i = 0; i < students.length; i++) {

			int num1 = students[i].getFirstScore();
			int num2 = students[i].getSecondScore();
			double avg = (num1 + num2) / (double) 2;
			System.out.println(students[i].getName() + " 학생의 확인 결과");

			if (avg >= 60) {
				if (num1 < 40) {
					System.out.println("1차 시험 재평가 대상입니다.");
				} else if (num2 < 40) {
					System.out.println("2차 재평가 대상입니다.");
				}
				System.out.println("통과하였습니다.");

			} else {
				if (num1 < 40) {
					System.out.println("1차 시험 재평가 대상입니다.");
				} 
				if (num2 < 40) {
					System.out.println("2차 시험 재평가 대상입니다.");
				}
			}
		}
	}

	public void printGoodBye() {
		System.out.println("Good Bye");
	}

	public void printException() {
		System.out.println("1~3 사이의 숫자를 입력해주세요");
	}
}
