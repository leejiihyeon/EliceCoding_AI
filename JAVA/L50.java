package JAVA;

/*
[강제타입 변환]
작은 허용 범위 타입 = (작은 허용 범위 타입)큰 허용 범위 타입
*/

public class L50 {

	public static void main(String[] args) {
		
		int intValue = 10;
		byte byteValue = (byte) intValue; //강제 타입 변환
		System.out.println(byteValue);
		
		int intValue1 = 65;
		char charValue = (char) intValue1;
		System.out.println(charValue); //"A"가 출력
		
		double doubleValue = 3.14;
		int intValue3 = (int)doubleValue;
		System.out.println(intValue3); //intValue는 정수 부분인 3만 저장
		
		
	}
}