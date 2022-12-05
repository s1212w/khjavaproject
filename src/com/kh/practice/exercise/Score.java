package com.kh.practice.exercise;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 성적 출력1

		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만 ) : ");
		int ban = sc.nextInt();

		System.out.print("번호(숫자만 ) : ");
		int bunho = sc.nextInt();

		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		String student="";
		if (gender == "M") {
			student = "남학생";
		} else if (gender == "F") {
			student = "여학생";
		}

		System.out.print("성적(소숫점 둘째자리까지 ) : ");
		double score = sc.nextDouble();

		System.out.println(grade + "학년 " + ban + "반 " + bunho + "번 " + name + " " + student + "의 성적은 " + score + "이다.");
		// 3학년 4반 15번 최용자 여학생의 성적은 85.75이다.

	}

}
