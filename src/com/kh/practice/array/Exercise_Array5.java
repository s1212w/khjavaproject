package com.kh.practice.array;

import java.util.Random;

public class Exercise_Array5 {
	public static void main(String[] args) {
		// 최대최소출력1

		int[] arrayList = new int[10];
		
		Random rand = new Random();
		
		for (int i = 0; i <arrayList.length; i++) {
			arrayList[i] = rand.nextInt(21)+10; //10부터 30까지 난수 발급, 본인이 원하는 값으로 지정하기
		}

		int min = arrayList[0];  //최소값에 배열의 0번째를 초기값으로 넣어줌
		int max = arrayList[0];  //최대값에 배열의 0번째를 초기값으로 넣어줌

		for (int i = 0; i < arrayList.length; i++) { //배열의 크기만큼 for문이 돌아가는 동안 각 배열의 값을 비교하여 최대,최소값에 넣어줌
			if (arrayList[i] < min) {
				min = arrayList[i];
			}

			if (arrayList[i] > max) {
				max = arrayList[i];
			}
		}

		for (int a : arrayList) {
			System.out.print(a + " ");
		}
		
		System.out.println();

		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

	}
}