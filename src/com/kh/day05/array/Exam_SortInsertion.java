package com.kh.day05.array;

public class Exam_SortInsertion {
	public static void main(String[] args) {
		// ���� �˰���
		// 1. ��������
		// 2. ��������
		// 3. ��������
		// ���� �����̶�?
		// ���� �˰��� �߿� �ϳ��̸鼭 ���� �����ϰ� �⺻�� �Ǵ�
		// �˰���
		// �迭�� n�� �ε��� ���� 0������ n-1�� �ε������� ����
		// {2,5,4,1,3}

		int[] arrs = { 2, 5, 4, 1, 3 };
		for (int i = 1; i < arrs.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arrs[j - 1] > arrs[j]) {
					int temp = arrs[j];
					arrs[j] = arrs[j - 1];
					arrs[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + " ");
		}
	}

}
