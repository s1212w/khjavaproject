package com.kh.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1;
//		System.out.println(a++); //후위연산(나중연산)
//		System.out.println(++a); //전위연산(먼저연산)
//		System.out.println("Hello");
//		
//		int b = 1;
//		System.out.println(b);

		int a = 10, b = 20, c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("1번 문제");
		System.out.println("a++; = " + a);
		System.out.println("b = (--a) + b; = " + b);
		System.out.println("c = (a++) + (--b); = " + c);
		System.out.println("");

		System.out.println("2번 문제");
		System.out.println("x--;");
		System.out.println("z = x-- + --y");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y");

		int x = 100, y = 33, z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x의 값 : " + x);
		System.out.println("y의 값 : " + y);
		System.out.println("z의 값 : " + z);
		System.out.println();
		
		System.out.println("부정연산자");
		boolean result = true;
		System.out.println("result의 값 : " + result);
		System.out.println("!result의 값 : " + !result);

	/*	System.out.println();
		System.out.println();
		System.out.println(); */
		

	}

}
