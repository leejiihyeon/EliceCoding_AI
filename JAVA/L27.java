package JAVA;
/*
국어,영어,수학 점수를 99, 80, 96점으로 입력하고
평균점수를 구해서 출력하는 프로그램을 작성하시오.
실행결과]
평균점수(실수형)=91.66666666666667
평균점수(정수형)=91
*/
public class L27 {
	
	public static void main(String[] args) {
		
		int kor=99;
		int eng=80;
		int math=96;
		
		int sum=kor+eng+math;
		
		int avg=sum/3;
		
		double avg1=sum/3;
		
		System.out.println("평균점수(정수형) : "+avg);
		System.out.println("평균점수(실수형) : "+avg1);

	}
}