package com.kh.practice.car;

public class Car {
	private String name;
	private int number;
	private String color;

	public Car() { // »ý¼ºÀÚ
	}

	public Car(String name, int number, String color) {
		this.name = name;
		this.number = number;
		this.color = color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	public String getName () {
		return name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getColor() {
		return color;
	}

}
