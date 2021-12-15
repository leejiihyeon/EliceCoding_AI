package JAVA;

import java.io.IOException;

public class L87 {

	public static void main(String[] args) throws IOException {
		
		int num = 10;
		
		if(num%2) {
			System.out.println("잘못된 조건식 입니다.");
			
			
		}
		if(num) {
			System.out.println("잘못된 조건식 입니다.");
		}
		
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다", num);
		}
	}
}