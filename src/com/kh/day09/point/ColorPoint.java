package com.kh.day09.point;

public class ColorPoint extends Point {
	private String color; // 점의 색

	public ColorPoint() {
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y); // x,y 셋팅
		// Point의 생성자 Point(x,y) 호출
		this.color = color;
	}

//	public void setColor(String color) {
//		this.color = color;
//	}

	public void showColorPoint() {
		System.out.println(color); // 색,좌표 출력
		showPoint(); // Point 클래스의 showPoint() 호출
	}
}
