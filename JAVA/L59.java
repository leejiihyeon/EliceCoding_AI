package JAVA;

public class L59 {

	public static void main(String[] args) {

		
		//printf("형식문자열", 값1, 값2, .....);
		//괄호 안의 첫 번째 문자열 형식대로 내용을 출력해라
		
		
		System.out.printf("이름 : %s", "감자바");
		System.out.println();
		System.out.printf("나이 : %d", 25);
		System.out.println();
		
		System.out.printf("이름 : %1s, 나이 : %2$d", "김자바", 25);
		
	}
}