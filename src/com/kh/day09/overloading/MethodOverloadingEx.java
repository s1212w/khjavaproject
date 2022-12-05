package com.kh.day09.overloading;

class Weapon {

	public Weapon() {
	}

	public Weapon(int value) {
		System.out.println(value);
	}

	public Weapon(int value, String name) {
		System.out.println(value + " :");
	}

	protected int file() {
		return 1;
	}

	// �����ε�
	// �ڱ� �ڽſ��� ����, �Ű����� Ÿ�� or ������ �޶���
	protected int fire(int steampack) {
		return steampack * 100;
	}

	protected int fire(int steampack, int medicine) {
		return steampack + medicine;
	}

	protected int fire(String steampack) {
		System.out.println(steampack);
		return 1;
	}

}

class Cannon extends Weapon {
	protected int file() {
		return 10;
	}
}

public class MethodOverloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Hello");
		System.out.println(1);
		System.out.println('H');
		System.out.println(true);

	}

}
