package com.kh.day02.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 1;
//		System.out.println(a++); //��������(���߿���)
//		System.out.println(++a); //��������(��������)
//		System.out.println("Hello");
//		
//		int b = 1;
//		System.out.println(b);

		int a = 10, b = 20, c = 30;
		a++;
		b = (--a) + b;
		c = (a++) + (--b);

		System.out.println("1�� ����");
		System.out.println("a++; = " + a);
		System.out.println("b = (--a) + b; = " + b);
		System.out.println("c = (a++) + (--b); = " + c);
		System.out.println("");

		System.out.println("2�� ����");
		System.out.println("x--;");
		System.out.println("z = x-- + --y");
		System.out.println("x = 99 + x++ + x;");
		System.out.println("y = y-- + y + ++y");

		int x = 100, y = 33, z = 0;
		x--;
		z = x-- + --y;
		x = 99 + x++ + x;
		y = y-- + y + ++y;
		System.out.println("x�� �� : " + x);
		System.out.println("y�� �� : " + y);
		System.out.println("z�� �� : " + z);
		System.out.println();
		
		System.out.println("����������");
		boolean result = true;
		System.out.println("result�� �� : " + result);
		System.out.println("!result�� �� : " + !result);

	/*	System.out.println();
		System.out.println();
		System.out.println(); */
		

	}

}
