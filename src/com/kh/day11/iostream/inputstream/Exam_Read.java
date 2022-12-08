package com.kh.day11.iostream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����Ʈ ��� ��Ʈ��
		InputStream is = null;
		// ���� ��� ��Ʈ��

		// FileNotFoundException --> checked Exception
		// ->�ݵ�� try~catch ����� �ϴ� Exception

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
			//�ݵ�� ����Ǿ�� �ϴ� �ڵ� �ۼ�
			//readByte.close();
		}
		

	}

}
