package com.kh.day09.overriding;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		// Shape p = new Line();
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		//line.draw();
		paint(line);
		paint(new Rect());
		paint(new Circle()); //-->�������̵� �� �ϰ�
							//-->��ĳ���õ� ���¿��� �θ�Ŭ���� ȣ�� ��
							//--> Shape ��µ�

	}

}
