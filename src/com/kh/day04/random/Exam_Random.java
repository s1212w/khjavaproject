package com.kh.day04.random;

import java.util.Random;

public class Exam_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			// nextInt(n) -> 0���� n-1 ������ ������ �� ����
			// nextInt(n+1) -> 0���� n������ ������ �� ����
	
			System.out.println(rand.nextInt(10)); //0���� 9������ �� �߿� ���� ����
			
			//ex. 20���� 35������ �� �߿��� ������ �� ����
			// 0���� 15���� --> nextInt(??), ??=n-1=15 , n=16
			// nextInt(16)+20
			
			//ex. 10���� 23������ �� �߿��� ������ �� --> (0���� 13) + 10
			// nextInt(??)+??
			// nextInt(14)+10
		}

	}

}
