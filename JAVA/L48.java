package JAVA;

//byte < short < int < long < float < double



public class L48 {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환됨
		
		System.out.println(intValue);
		
		long longValue = 5000000000L;
		float floatValue = longValue; //5.0E9f로 저장됨
		double doubleValue = longValue; //5.0E9로 저장됨
		
		System.out.println(doubleValue);
		
		char charValue = 'A';
		int intValue1 = charValue; //65가 저장됨
		
		System.out.println(charValue);
		
/*
char 타입보다 허용 범위가 작은 byte 타입은 char 타입으로 자동 타입 변환될 수 없습니다. 왜냐하면 char 타입의 허용 범위는
음수를 포함하지 않는데, byte 타입은 음수를 포함하기 때문입니다.
*/
	}
}