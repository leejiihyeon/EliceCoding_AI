package JAVA;

import java.util.Scanner;

public class L73 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. 이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리 : ");
		String num = scanner.nextLine();
		
		System.out.printf("3. 전화번호 : ");
		String num2 = scanner.nextLine();
		
		System.out.println();
		
		System.out.println("[입력된 내용]");
		System.out.println("1. 이름 : "+name);
		System.out.println("2. 주민등록 앞 6자리 : "+num);
		System.out.println("3. 전화번호 : "+num2);
		
	}
}