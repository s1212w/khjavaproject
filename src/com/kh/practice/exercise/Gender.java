package com.kh.practice.exercise;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//남녀 판별1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(-포함) : ");
		String number = sc.next();
		
		char gender = number.charAt(7);
		
		if (gender ==1) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		

	}

}
