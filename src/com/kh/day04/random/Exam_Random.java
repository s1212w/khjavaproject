package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			// nextInt(n) -> 0부터 n-1 까지의 랜덤한 수 리턴
			// nextInt(n+1) -> 0부터 n까지의 랜덤한 수 리턴
	
			System.out.println(rand.nextInt(10)); //0부터 9까지의 수 중에 난수 생성
			
			//ex. 20부터 35사이의 수 중에서 랜덤한 수 리턴
			// 0부터 15사이 --> nextInt(??), ??=n-1=15 , n=16
			// nextInt(16)+20
			
			//ex. 10부터 23사이의 수 중에서 랜덤한 수 --> (0부터 13) + 10
			// nextInt(??)+??
			// nextInt(14)+10
		}

	}

}
