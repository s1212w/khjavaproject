package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		
		try {
			is = new FileInputStream("src/iostream/inputStream.txt"); //업캐스팅
			int readByteNo;
			byte[] readBytes = new byte[3];
			readByteNo = is.read(readBytes);
			String data = new String(readBytes, 0, readByteNo);
			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch(IOException e) {
			e.printStackTrace();
		}

	}

}
