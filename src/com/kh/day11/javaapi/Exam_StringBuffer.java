package com.kh.day11.javaapi;

public class Exam_StringBuffer {
	public static void main(String[] args) {
		// StringBuffer : ���ڿ��� �������ִ� Ŭ����
		// ���ڿ� �������ִ� �޼ҵ� : concat
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		sb.append(" ");
		sb.append("JAVA");
		
		System.out.println("����� ���ڿ� : " +sb.toString());
		
		StringBuffer stb = new StringBuffer().append("KH").append(" JAVA Class").append(" F Class");
		System.out.println(stb);
	}

}