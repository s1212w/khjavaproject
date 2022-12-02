package com.kh.day07.member;

import java.util.Scanner;

public class MemberFunction {
	
	Member abc;
	
	public MemberFunction () {
		abc = new Member();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원 관리 =====");
		System.out.println("1. 회원 입력");    
		System.out.println("2. 회원 출력");
		System.out.println("3. 종료");
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		return input;
	}

	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();
		System.out.print("회원 주소 : ");
		String address = sc.next();
		abc.setName(name);
		abc.setAge(age);
		abc.setAddress(address);
	}

	public void printMember() {
		System.out.println("==== 회원 정보 출력 ====");
		System.out.println("회원 이름 : " + abc.getName());
		System.out.println("회원 나이 : " + abc.getAge());
		System.out.println("회원 주소 : " + abc.getAddress());
		System.out.println( "===================");
	}

	public void goodByeMsg() {
		System.out.println("Good Bye");
	}

	public void exceptionMsg() {
		System.out.println("1~3 사이의 숫자를 입력하세요");
	}
}
