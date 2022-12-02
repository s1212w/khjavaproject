package com.kh.day07.member;

public class MemberRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MemberFunction mFunc = new MemberFunction();
		
		HOME:
		while(true) {
			int input = mFunc.printMenu();
			switch(input) {
			case 1:
				mFunc.inputMember();
				break;
			case 2:
				mFunc.printMember();
				break;
			case 3:
				mFunc.goodByeMsg();
				break HOME;
			default:
				mFunc.exceptionMsg();
				break;
			}
		}

	}

}
