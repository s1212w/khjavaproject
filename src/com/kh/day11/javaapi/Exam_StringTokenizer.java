package com.kh.day11.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String [] args) {
		String query = "name=kite&add=seoul&age=20";
		String [] words = query.split("&");
		System.out.println(words[0]);
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
