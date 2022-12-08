package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 바이트 기반 스트림
		InputStream is = null;
		// 문자 기반 스트림

		// FileNotFoundException --> checked Exception
		// ->반드시 try~catch 해줘야 하는 Exception

		try {
			is = new FileInputStream("src/iostream/inputstream.txt");
			int readByte;
			while (true) {
				readByte = is.read();
				if (readByte == -1)
					break;
				System.out.print((char) readByte);

			}
//		for (int i = 0; i<4;i++) {
//			readByte = is.read();
//			System.out.print((char)readByte);
//		}
			// is.read();
			// readByte.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//반드시 실행되어야 하는 코드 작성
			//readByte.close();
		}
		

	}

}
