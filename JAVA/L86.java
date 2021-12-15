package JAVA;

public class L86 {

	public static void main(String[] args) {

		System.out.println("while문을 이용한 구구단 만들기");
		
		int i=1;
		while(i<=9) {
			i++;
			int j=0;
			while(j<9) {
				j++;
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println();
		}
	}
}