package com.kh.day10.wrapperex;

public class Exam_Wrapper {
	public static void main(String[] args) {
		// Wrapper ��ü�κ��� �⺻ Ÿ�� �� �˾Ƴ���
		Integer i = Integer.valueOf(1123);
		// ��ü�� ���� ����ϴٰ�
		int e = i.intValue();
		// �⺻������ ��ȯ ����
		Integer f = null;

		System.out.println(i);
		System.out.println(e);
		
		Character c = Character.valueOf('c');
		char che = c.charValue();
	
		Double d = Double.valueOf(3.14);
		double dy = d.doubleValue();
		
		//���ڿ��� �⺻ ������ Ÿ��(int, boolean, double)
		//���� ��ȯ
		
		int num = Integer.parseInt("123");
		System.out.println("��ȯ�� �� : " + num);
		boolean isYn = Boolean.parseBoolean("true");
		double fNum = Double.parseDouble("3.14");
		System.out.println(isYn);
		System.out.println(fNum);
		
		// �⺻ ������ Ÿ��(int, double, char)��
		// ���ڿ��� ��ȯ
		String data1 = Integer.toString(123);
		String data2 = Integer.toHexString(123); //16���� 7b�� ��ȯ
		String data3 = Double.toString(3.14);
		String data4 = Character.toString('a');
		String data5 = Boolean.toString(true);
		

	}

}
