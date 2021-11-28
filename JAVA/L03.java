package JAVA;

public class L03 {

	public static void main(String[] args) {

		int i=5;
		while(i>=0) {
			int j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}