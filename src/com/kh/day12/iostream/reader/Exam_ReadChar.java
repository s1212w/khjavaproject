package com.kh.day12.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReadChar {
	public static void main(String[] args) {
		Reader reader = null;

		try {
			reader = new FileReader("src/iostream/filereader.txt");
			int readCharNo;
			char[] cbuf = new char[2];
			String data = "";
			while (true) {
				readCharNo = reader.read(cbuf);
				if(readCharNo ==-1) break;
				data += new String(cbuf, 0, readCharNo); // 캐릭터 배열에서 몇번째부터 몇번째 인덱스까지 읽을 것인지.
			}

			System.out.println(data);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
