package JAVA;
/*
이름 : 김자바
나이 : 25
전화 : 010-123-4567
*/
public class L71 {

	public static void main(String[] args) {
		
		String name = "김자바";
		int age = 25;
		String tel1="010", tel2="123", tel3="4567";
		
		System.out.println("이름 : "+name);
		System.out.print("나이 : "+age+"\n");
		System.out.printf("전화 : %1$s-%2$s-%3$s", tel1, tel2, tel3);
	}
}