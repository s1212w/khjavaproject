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

		String[] arrayList = new String[num]; // 최초 배열 생성

		for (int i = 0; i < arrayList.length; i++) { // 입력받은 값을 배열에 저장해줌
			System.out.print(i + 1 + "번째 문자열 : ");
			String aaa = sc.next();
			arrayList[i] = aaa;
		}

		String[] arrayList2 = new String[arrayList.length]; // 배열 복사
		
		for (int i = 0; i < arrayList.length; i++) {
			arrayList2[i] = arrayList[i];
		}

		System.out.print("더 값을 입력하시겠습니까 ? (Y/N) : ");
		char answer = sc.next().charAt(0);

		if (answer == 'Y') {
			System.out.print("입력하고 싶은 개수 : ");
			int answer_number = sc.nextInt();
			num = arrayList.length + answer_number;
			arrayList = new String[num]; // 새로 입력받은 값을 원래 배열 크기에 더해서 새로운 크기에 배열로 재할당함

			for (int i = arrayList2.length; i < arrayList.length; i++) { // 복사한 배열의 크기부터 재할당한 배열의 크기까지 입력 새로 받음
				System.out.print(i + 1 + "번째 문자열 : ");
				String aaa = sc.next();
				arrayList[arrayList2.length] = aaa;
			}
		}

		else if (answer == 'N') {
			System.out.println(Arrays.toString(arrayList));
		}
	}
}
