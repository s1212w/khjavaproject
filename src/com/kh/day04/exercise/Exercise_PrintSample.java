package com.kh.day04.exercise;

public class Exercise_PrintSample {
	public static void main(String[] args) {
		// System.out.println ���� ����+���ڿ� -> ���ڿ�
		System.out.println(1 + "1");

		// ����+���� -> ����
		System.out.println('1' + '1'); // '11'

		// ���� + ����+ ���ڿ�+ ���� -> ���������δ� ���ڿ�
		System.out.println(10 + 20 + "Hello" + 10);

		// printf�� ���Ͽ� �˾ƺ���
		// println, print -> �ٹٲ��� ����
		System.out.print("���� �Է� : "); // �ٷ� ���� �Է¹���.
		System.out.println("���� �Է� : "); // �� �ٲٰ� �Է� ����
		System.out.printf("���� ���  : %d \n", 1);
		System.out.printf("���ڿ� ��� : %s", "hello World");
	}

}
