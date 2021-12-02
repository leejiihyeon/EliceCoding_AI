package JAVA;

public class L25 {
	public static void main(String[] args) {
		System.out.println("[for문으로 1부터 10까지의 총합 구하기]");
		
		int sum=0;
		for(int i=1; i<=10 ; i++) {
			sum+=i;
			}
		System.out.println("1~10까지의 총합 : "+sum);
	} //메인 종료
} //클래스 종료