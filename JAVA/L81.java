package JAVA;

public class L81 {

	public static void main(String[] args) {
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