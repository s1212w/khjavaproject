package com.kh.day05.array;

import java.util.Arrays;

public class Exam_SortBubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���������̶�?
		// ������ �ΰ��� ���Ҹ� �˻��Ͽ� �����ϴ� ���
		// ������ ���ٴ� ������ �ְ�, �̹� ���ĵ� �����͸� ������ �� ���� ����
		// �⺻������ �ٸ� ���Ŀ� ���� ���ļӵ��� ������, �������� ������ �� ���� ����
		// {2,5,4,1,3}

		int[] arrs = { 2, 5, 4, 1, 3 };
		for (int i = 0; i < arrs.length-1; i++) {
			for (int j = 0; j < (arrs.length - 1) - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j + 1];
					arrs[j + 1] = arrs[j];
					arrs[j] = temp;
				}
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}

	}
}
