package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Exercise_Lotto ex = new Exercise_Lotto();
//		ex.lottoProgram();
//		
//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walking();
//		person.name = "가나다";

		Scanner sc = new Scanner(System.in);
		//레퍼런스 변수 선언
		// 참조 변수 선언
		// 주소가 저장되는 변수
		Rectangle rect = new Rectangle(); //객체 생성, 반드시 new 키워드 이용
											// new라는 객체의 생성자 호출
		System.out.print("너비를 입력해주세요 : ");
		//객체(rect)의 멤버 접근 (멤버의 종류로는 멤버 변수와 멤버 메소드)
		//인스턴스 (Rectangle 클래스의 객체)
		rect.width = sc.nextInt(); //객체의 멤버 접근은 .으로 한다
		System.out.print("높이를 입력해주세요 : ");
		rect.height = sc.nextInt(); //멤버 변수 접근
		int result = rect.getArea(); //멤버 메소드 접근
		System.out.print("사각형의 면적은 : " + result);

	}

}
