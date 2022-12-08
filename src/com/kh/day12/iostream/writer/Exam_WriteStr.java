package com.kh.day12.iostream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class Exam_WriteStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("src/iostream/filewriter.txt");
			String data = "오라클이 제일 쉬웠어요";
			writer.write(data);
			writer.flush();
			System.out.println("쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
