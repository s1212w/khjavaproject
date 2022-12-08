package com.kh.day12.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.util.Scanner;

public class Exercise_IOStream {

	public void fileCopy() {
		// �̹��� ���� ����
		// C:\\img\\abc.png -> D:\\abc.png
		// ����Ʈ ��� �Է½�Ʈ��

		InputStream is = null;
		OutputStream os = null;

		try {
			is = new FileInputStream("C:\\img\\abc.png");
			os = new FileOutputStream("D:\\abc.png");
			byte[] readBytes = new byte[100];
			int readByteNo;
			while ((readByteNo = is.read(readBytes)) != -1) { // ���� �б� ����
				os.write(readBytes, 0, readByteNo);
			}
			System.out.println("���� �Ϸ�");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void memoFileMake() {
		/*
		 * ������ ���ϸ� �Է� : khtext.txt
		 * 'khtext.txt' ���Ͽ� ����� ���� �Է�
		 * ����� exit
		 * 1: 1111
		 * 2: text input
		 * 3: good
		 * 4: gogo
		 * 5: exit
		 * ���� ���� �Ϸ� (exit�� �����ϰ� ����)
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���ϸ� �Է� : ");
		String filename = sc.next();
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/iostream/"+filename);
			System.out.println("'" + filename + "'���Ͽ� ����� ���� �Է�");
			System.out.println("����� exit");
			sc.nextLine();
			int i = 1;
			while (true) {
				System.out.print(i + " : ");
				String input = sc.nextLine();
				if("exit".equals(input)) break;
				writer.write(input + "\n");
				i++;
			}
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
