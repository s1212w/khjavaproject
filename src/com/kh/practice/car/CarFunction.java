package com.kh.practice.car;

import java.util.Scanner;

public class CarFunction {
	
	Car a;
	
	public CarFunction() {
		a = new Car();
	}
	
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 자동차 정보 관리 ====");
		System.out.println("1.자동차 정보 입력");
		System.out.println("2.자동차 정보 출력");
		System.out.println("3.프로그램 종료");
		System.out.print("선택 : ");
		int choice = sc.nextInt();
		return choice;
	}

	public void inputCar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("차의 정보를 입력하세요");
		System.out.print("차 이름 : ");
		String name = sc.next();
		System.out.print("차 번호 : ");
		int number = sc.nextInt();
		System.out.print("차 색상 : ");
		String color = sc.next();
		a.setName(name);
		a.setNumber(number);
		a.setColor(color);
	}

	public void printCar() {
		System.out.println("==== 자동차 정보 출력 ====");
		System.out.println("차의 이름 : " + a.getName());
		System.out.println("차의 번호 : " + a.getNumber());
		System.out.println("차의 색상 : " + a.getColor());
		System.out.println("=====================");
	}
	
	public void goodByeMsg () {
		System.out.println("Good Bye");
	}
	
	public void printException () {
		System.out.println("1~3 사이의 수를 입력해주세요.");
	}

}
