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
		paint(new Circle()); //-->오버라이드 안 하고
							//-->업캐스팅된 상태에서 부모클래스 호출 시
							//--> Shape 출력됨

	}

}
