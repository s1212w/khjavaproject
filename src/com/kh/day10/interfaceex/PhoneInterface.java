package com.kh.day10.interfaceex;

public interface PhoneInterface {
	public String NAME ="";
	// name = "Hello"; //X, 상수값이라서 바뀌지 않음
	public static final int TIME_OUT = 10000;
	public abstract void sendCall();
	public abstract void receiveCall();
	abstract void printLogo();
	void displayNumber(); //-> 세줄 다 가능
	public default void showLogo() {
		//하위 호환성을 위해서 작성함
		//즉, 하위 호환성을 유지하고 인터페이스의 보완을 위해 작성
		System.out.println("** LG **");
	}
}
