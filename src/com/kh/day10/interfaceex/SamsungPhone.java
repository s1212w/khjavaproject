package com.kh.day10.interfaceex;

public class SamsungPhone implements PhoneInterface{

	@Override
	public void sendCall() {
		System.out.println("�ѷ����");
	}

	@Override
	public void receiveCall() {
		System.out.println("�������� ����");
	}

	@Override
	public void printLogo() {
		System.out.println("==== samsung ====");
	}

	@Override
	public void displayNumber() {
		System.out.println("�� �޴���ȭ ���� : 010-5597-1630");
	}
	
	public void flash() {
		System.out.println("��¦��¦ ���� �������ϴ�.");
	}

}
