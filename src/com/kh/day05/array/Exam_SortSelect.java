package com.kh.day05.array;

public class Exam_SortSelect {
	public static void main(String[] ars) {
		// �˰��� ����
		// 1.��������
		// 2.��������
		// 3.��������
		// ���������̶�?
		// �迭�� ���� �˻��Ͽ� �ּҰ��� ���� ���ʺ��� ä�������� ����� ����
		// Ư¡ : ������ ���� ���� �� ���� ������ �����ִ� ����������
		// ������ ���� ���� �� �ް��� �������ϸ� ����.
		// �迭�� n�� �ε��� ���� n+1�� ~������ �ε������� ����.

		int[] arrs = { 2, 5, 4, 1, 3 };
		int min; // �ε����� ����
		for (int i = 0; i < arrs.length; i++) {
			min = i; // ���� ���� �� �ε��� ��
			for (int j = i + 1; j < arrs.length; j++) {
				if (arrs[min] > arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[min];
			arrs[min] = arrs[i];
			arrs[i] = temp;
		}

	}

}
