package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public void exercise1() {
		//ȫ�浿/��ȭ/ȫ��/����/������ ���ڿ� �����͸�
		// '/' �������� �߶� ȫ�ø� ����Ͻÿ�
		
		String data = "ȫ�浿/��ȭ/ȫ��/����/����";
		//1. ��ü ���
		//2. ȫ�ø� ���
		StringTokenizer st = new StringTokenizer(data,"/");
		while(st.hasMoreTokens()) {
			if(st.nextToken().equals("ȫ��"))
			System.out.println("ȫ��");
		}
		
	}

}
