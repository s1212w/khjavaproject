package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_Array6 {

	public static void main(String[] args) {

		// 배열 활용1
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 길이를 입력하세요 : ");
		int num = sc.nextInt();

		String[] arrayList = new String[num];

		for (int i = 0; i < arrayList.length; i++) {
			System.out.print(i + 1 + "번째 문자열 : ");
			String aaa = sc.next();
			arrayList[i] = aaa;
		}

		System.out.print("더 값을 입력하시겠습니까 ? (Y/N) : ");
		char answer = sc.next().charAt(0);

		if (answer == 'Y') {
			System.out.print("입력하고 싶은 개수 : ");
			int answer_number = sc.nextInt();
			num = arrayList.length + answer_number;
			arrayList = new String[num];
			
		

		} else if (answer == 'N') {
			System.out.println(Arrays.toString(arrayList));
		}

	}

}
