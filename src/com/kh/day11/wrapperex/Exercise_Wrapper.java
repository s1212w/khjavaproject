package com.kh.day11.wrapperex;

public class Exercise_Wrapper {
	public void parserExample() {
		String strNum = "221123";
		String strNum2 = "230502";
		
		int num = Integer.parseInt(strNum);
		int num2  = Integer.parseInt(strNum2);
		//�� ���� ����Ͽ� ����Ͻÿ�
		
		int result = num - num2;
		System.out.println(result);
		
		
	}
	
	public void dataParsingExample() {
		String strData = "13";
		String strData2 = "23.502";
		String strData3 = "SPRING";
		//1. strData�� byte,short,int,long ���� ��ȯ�Ͻÿ�
		//2. strData2�� float,double�� ��ȯ�Ͻÿ�
		//3. strData3��  char�� ��ȯ�Ͻÿ�
		
		byte bNum = Byte.parseByte(strData);
		short sNum = Short.parseShort(strData);
		int iNum = Integer.parseInt(strData);
		long lNum  = Long.parseLong(strData);
		
		float fNum = Float.parseFloat(strData2);
		double dNum = Double.parseDouble(strData2);
		
		char word = strData3.charAt(2);
	
				
		
		
		
	}

}
