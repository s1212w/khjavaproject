package com.kh.day03.exscanner;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int month;
		double height;
		char gender;
		String add;
		
		
		System.out.print("이름을 입력해주세요 : ");
		name = sc.next(); //공백 or 엔터는 입력 안 받음
		
		System.out.print("태어난 월을 입력해주세요 : ");
		month = sc.nextInt();
		
		System.out.print("키를 입력해주세요 : ");
		height = sc.nextDouble();
		
		System.out.print("성별을 입력해주세요 : ");
		gender = sc.next().charAt(0);
		
		System.out.print("주소를 입력해주세요 : ");
		sc.nextLine(); // 다른 입력메소드와는 다르게 nextLine()을 한 줄 더 추가
						//why? nextLine()을 한줄만 적을 경우 엔터 한번으로 프로그램이 
						// 데이터값을 입력 받았다고 판단하여 종료됨
		add = sc.nextLine();
		
		System.out.println();
		System.out.println("이름은 " + name + "입니다.");
		System.out.println("태어난 월은 " + month + "월 입니다.");
		System.out.println("키는 " + height + "입니다.");
		System.out.println("성별은 " + gender + "입니다.");
		System.out.println("주소는 " + add + "입니다.");		
		
		
	}

}
