package com.kh.practice.exercise;

import java.util.Scanner;

public class Gender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �Ǻ�1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		String number = sc.next();
		
		char gender = number.charAt(7);
		
		if (gender ==1) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		

	}

}
