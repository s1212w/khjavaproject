package com.kh.practice.car;

public class CarRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CarFunction cFunc = new CarFunction();
		HOME: 
			while (true) {
			int choice = cFunc.printMenu();
			switch (choice) {
			case 1:
				cFunc.inputCar();
				break;
			case 2:
				cFunc.printCar();
				break;
			case 3:
				cFunc.goodByeMsg();
				break HOME;
			default:
				cFunc.printException();
				break;
			}
		}

	}

}
