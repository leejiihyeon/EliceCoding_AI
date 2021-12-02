package JAVA;

public class L24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[for문으로 구구단 만들기]");
		
		for(int i=1; i<=9 ; i++) {
			for(int j=1 ; j<=9 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	} //메인 종료
} //클래스 종료