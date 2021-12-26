package JAVA;

public class L96 {

	public static void main(String[] args) {
		
		System.out.println("[for문을 이용한 구구단]");
		
		for(int i=1 ; i<=9 ; i++) {
			for(int j=1 ; j<=9 ; j++) {
				
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}