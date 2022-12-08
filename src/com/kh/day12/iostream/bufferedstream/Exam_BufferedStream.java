package com.kh.day12.iostream.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exam_BufferedStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 버퍼 크기를 5로 하고, 표준 출력 스트림과 연결한
		// 버퍼 출력 스트림을 생성하라
		// C:\Temp\text2.txt 파일을 저장된 영문 텍스트를 읽어
		// 버퍼 출력 스트림을 통해 출력하라
		// 파일 입력용
		FileReader fir = null;
		int readChar;
		try {
			fir = new FileReader("C:\\Temp\\kh.txt");
			BufferedOutputStream bout = new BufferedOutputStream(System.out, 5); // outputstream --> 출력스트림
			while ((readChar = fir.read()) != -1) {
				bout.write(readChar);
			}
			new Scanner(System.in).nextLine();
			bout.flush(); //buffer를 비워줌
			bout.close(); //stream을 닫음
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// 콘솔 출력용

	}

}
