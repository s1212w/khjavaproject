package com.kh.day07.run;

import java.util.Scanner;

import com.kh.day07.oop.Rectangle;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Exercise_Lotto ex = new Exercise_Lotto();
//		ex.lottoProgram();
//		
//		Person person = new Person();
//		person.eat();
//		person.sleep();
//		person.speak();
//		person.walking();
//		person.name = "������";

		Scanner sc = new Scanner(System.in);
		//���۷��� ���� ����
		// ���� ���� ����
		// �ּҰ� ����Ǵ� ����
		Rectangle rect = new Rectangle(); //��ü ����, �ݵ�� new Ű���� �̿�
											// new��� ��ü�� ������ ȣ��
		System.out.print("�ʺ� �Է����ּ��� : ");
		//��ü(rect)�� ��� ���� (����� �����δ� ��� ������ ��� �޼ҵ�)
		//�ν��Ͻ� (Rectangle Ŭ������ ��ü)
		rect.width = sc.nextInt(); //��ü�� ��� ������ .���� �Ѵ�
		System.out.print("���̸� �Է����ּ��� : ");
		rect.height = sc.nextInt(); //��� ���� ����
		int result = rect.getArea(); //��� �޼ҵ� ����
		System.out.print("�簢���� ������ : " + result);

	}

}
