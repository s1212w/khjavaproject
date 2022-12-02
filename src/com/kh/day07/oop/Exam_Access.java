package com.kh.day07.oop;

class Sample {
	public int a;
	private int b;
	int c;
}

public class Exam_Access {
	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a = 10; // 접근 가능한
	//	aClass.b = 10; // 접근 불가능, private 이기 때문에
		aClass.c = 10; // 접근 가능, default 이기 때문에

	}

}
