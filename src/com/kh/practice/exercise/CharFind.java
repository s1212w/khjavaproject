package com.kh.practice.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열찾기

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.next();

		char[] wordBox = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			wordBox[i] = word.charAt(i);
		}
//		System.out.println(Arrays.toString(wordBox));

		System.out.print("문자 : ");
		char alphabet = sc.next().charAt(0);
		
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (wordBox[i] == alphabet) {
				count++;
			}
		}
		System.out.println(word + "에 " + alphabet+ "가 존재하는 위치 : ");
		System.out.println(alphabet + " 갯수 : " + count);
	}

}
