package com.kh.practice.car;

import java.util.Scanner;

public class CarFunction {
	
	Car a;
	
	public CarFunction() {
		a = new Car();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== �ڵ��� ���� ���� ====");
		System.out.println("1.�ڵ��� ���� �Է�");
		System.out.println("2.�ڵ��� ���� ���");
		System.out.println("3.���α׷� ����");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		System.out.print("�� �̸� : ");
		String name = sc.next();
		System.out.print("�� ��ȣ : ");
		int number = sc.nextInt();
		System.out.print("�� ���� : ");
		String color = sc.next();
		a.setName(name);
		a.setNumber(number);
		a.setColor(color);
	}

	public void printCar() {
		System.out.println("==== �ڵ��� ���� ��� ====");
		System.out.println("���� �̸� : " + a.getName());
		System.out.println("���� ��ȣ : " + a.getNumber());
		System.out.println("���� ���� : " + a.getColor());
		System.out.println("=====================");
	}
	
	public void goodByeMsg () {
		System.out.println("Good Bye");
	}
	
	public void printException () {
		System.out.println("1~3 ������ ���� �Է����ּ���.");
	}

}
