package com.kh.day08.oop;

public class Suit {
	private int size;
	private String brand;
	private int price;

	public Suit(int size) {
		this(size, "Hazzys");
		System.out.println("Suit(int) ȣ��");
	}

	public Suit(int size, String brand) {
		this(size, brand, 10000);
		System.out.println("Suit(int, String) ȣ��");
	}

	public Suit(int size, String brand, int price) {
		this.size = size;
		this.brand = brand;
		this.price = price;
		System.out.println("Suit(int,Sting,int) ȣ��");
	}
}
