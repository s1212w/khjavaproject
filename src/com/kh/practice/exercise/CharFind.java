package com.kh.practice.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ڿ�ã��

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String word = sc.next();

		char[] wordBox = new char[word.length()];

		for (int i = 0; i < word.length(); i++) {
			wordBox[i] = word.charAt(i);
		}
//		System.out.println(Arrays.toString(wordBox));

		System.out.print("���� : ");
		char alphabet = sc.next().charAt(0);
		
		int count = 0;

		for (int i = 0; i < word.length(); i++) {
			if (wordBox[i] == alphabet) {
				count++;
			}
		}
		System.out.println(word + "�� " + alphabet+ "�� �����ϴ� ��ġ : ");
		System.out.println(alphabet + " ���� : " + count);
	}

}
