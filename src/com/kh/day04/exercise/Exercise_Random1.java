package com.kh.day04.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise_Random1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//동전 앞뒤 맞추기
		
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
				
		
		System.out.println("==== 동전 앞 뒤 맞추기 ====");
		System.out.println("숫자를 입력해주세요(1.앞면 / 2.뒷면) : ") ;
		
		int choice = sc.nextInt();
		
		int computer = rand.nextInt(2)+1;
		
		
		if (choice == computer) {
			System.out.println("맞췄습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		

	}

}
