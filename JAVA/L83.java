package JAVA;
/*
N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오.
출력 형식에 맞춰서 출력하면 된다.
*/
public class L83 {

	public static void main(String[] args) {
		for(int n=1 ; n<=9 ; n++) {
			for(int m=1 ; m<=9 ; m++) {
				System.out.println(n+"*"+m+"="+n*m);
			}
			System.out.println();
		}
	}

}
