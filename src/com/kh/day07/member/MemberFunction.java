package com.kh.day07.member;

import java.util.Scanner;

public class MemberFunction {
	
	Member abc;
	
	public MemberFunction () {
		abc = new Member();
	}

	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== ȸ�� ���� =====");
		System.out.println("1. ȸ�� �Է�");    
		System.out.println("2. ȸ�� ���");
		System.out.println("3. ����");
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		return input;
	}

	public void inputMember() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ�� �̸� : ");
		String name = sc.next();
		System.out.print("ȸ�� ���� : ");
		int age = sc.nextInt();
		System.out.print("ȸ�� �ּ� : ");
		String address = sc.next();
		abc.setName(name);
		abc.setAge(age);
		abc.setAddress(address);
	}

	public void printMember() {
		System.out.println("==== ȸ�� ���� ��� ====");
		System.out.println("ȸ�� �̸� : " + abc.getName());
		System.out.println("ȸ�� ���� : " + abc.getAge());
		System.out.println("ȸ�� �ּ� : " + abc.getAddress());
		System.out.println( "===================");
	}

	public void goodByeMsg() {
		System.out.println("Good Bye");
	}

	public void exceptionMsg() {
		System.out.println("1~3 ������ ���ڸ� �Է��ϼ���");
	}
}
