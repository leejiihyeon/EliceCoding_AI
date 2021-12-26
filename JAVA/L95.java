package JAVA;

public class L95 {
	
	public static void main(String[] args) {
		
		System.out.println("[1~1000까지의 합 구하기]");
		
		int sum=0;
		for(int i=1; i<=1000 ; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}