package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �յ� ���߱�
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
				
		
		System.out.println("==== ���� �� �� ���߱� ====");
		System.out.println("���ڸ� �Է����ּ���(1.�ո� / 2.�޸�) : ") ;
		
		int choice = sc.nextInt();
		
		int computer = rand.nextInt(2)+1;
		
		
		if (choice == computer) {
			System.out.println("������ϴ�.");
		} else {
			System.out.println("Ʋ�Ƚ��ϴ�.");
		}
		

	}

}
