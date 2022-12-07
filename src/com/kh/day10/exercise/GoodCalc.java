package com.kh.day10.exercise;

public class GoodCalc extends Calculator {
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		int []a = {1,2,3};
		System.out.println(calc.add(1, 2));
		System.out.println(calc.substract(1,2));
		System.out.println(calc.average(a));
	
}

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		int sum = 0;
		for(int i =1; i<a.length;i++) {
			sum = sum + a[i];
		}
		double avg = sum/(double)a.length;
		return avg;
	}
}
