package com.kh.day07.oop;

public class Circle { //클래스 선언(class Circle), 클래스 접근 권한 public
	// 필드
	public int radius; //접근 지정자 public
	public String name; //접근 지정자 public
	
	//클래스명과 이름이 같은 메소드
	// -> 생성자
	//2. 객체 생성
	//3. 필드 초기화 (초기화는 생성자에서 함)
	public Circle() {  //접근 지정자 public
		this.radius  = '1';
		this.name = "원";

	}
	
	//반환형이 있는 메소드(반환값이 있음, return)
	public double getArea() { //접근 지정자 public
		return 3.14 * radius * radius;
	}

}
