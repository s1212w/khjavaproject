package com.kh.day11.wrapperex;

public class Exam_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
	//	Integer soo = new Integer(0);
		Integer su = Integer.valueOf(0);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('a'));
		
		char c1='4', c2='F';
		if(Character.isDigit(c1)) {
			System.out.println(c1 + "�� ����");
		}
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2+"�� ������");
		}

	}

}
