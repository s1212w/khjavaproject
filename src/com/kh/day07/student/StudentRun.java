package com.kh.day07.student;

public class StudentRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentFunction sFunc = new StudentFunction();
		
		End: 
			while (true) {
			int input = sFunc.printMenu();
			switch (input) {
			case 1:
				sFunc.inputScore();
				break;
			case 2:
				sFunc.PrintScore();
				break;
			case 3:
				break End;
			default:
				break;
			}
		}

	}

}
