package JAVA;

import java.util.Arrays;
import java.util.Random;

public class L89 {

	public static void main(String[] args) {
		
		//1부터 45중에 랜덤 변수 생성하기
		Random random = new Random();
		
		
		//0부터 44까지 랜덤 변수 생성
		int number = random.nextInt(45);
		System.out.println("Random number : "+ number);
		
		//로또 번호 생성 : 1부터 45까지 필요
		int number2 = random.nextInt(45)+1;
		System.out.println("Random number2: "+ number2);
		
		//ArrayLitst(배열) : 하나의 변수에 관련된 데이터 타입을 통으로 관리할 수 있다.
		int[] lottoNumber = new int[6];
		for(int i=0 ; i<6; i++) {
			lottoNumber[i] = random.nextInt(45)+1;
			
			//중복된 값이 있는지 확인하기
			for(int j=0 ; j<i ; j++) {
				if(lottoNumber[i]==lottoNumber[j]) {
					//중복된 값을 확인했다면,
					//앞으로 돌아가서 다시 확인하기
					i = i-1;
					break;
				}
			}
		}
		Arrays.sort(lottoNumber);
		
		System.out.println("생성한 랜덤 번호");
		for(int i : lottoNumber) {
			System.out.println(i+ "\t");
		}
		
	}
}