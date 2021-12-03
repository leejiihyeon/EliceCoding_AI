package JAVA;

public class L29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("[10진법의 수를 2진법으로 바꾸기]");
		
		int inputNum=19;
		int bin[]=new int[100];
		
		int i=0;
		int mok=inputNum;
		
		while(mok>0) {
			bin[i]=mok%2;
			mok/=2;
			i++;
		}
		i--;
		for(; i>=0 ; i--) {
			System.out.print(bin[i]);
		}

	}

}
