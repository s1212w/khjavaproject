package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME ="";
	// name = "Hello"; //X, ������̶� �ٲ��� ����
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	abstract void printLogo();
	void displayNumber(); //-> ���� �� ����
	public default void showLogo() {
		//���� ȣȯ���� ���ؼ� �ۼ���
		//��, ���� ȣȯ���� �����ϰ� �������̽��� ������ ���� �ۼ�
		System.out.println("** LG **");
	}
}
