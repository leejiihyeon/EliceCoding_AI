package JAVA;
/*
국어,영어,수학 점수를 99, 80, 96점으로 입력하고
평균점수를 구해서 출력하는 프로그램을 작성하시오.
실행결과]
평균점수(실수형)=91.66666666666667
평균점수(정수형)=91
*/
public class L21 {

	public static void main(String[] args) {
		
		//국어, 영어, 수학 점수 입력
		int kor=99;
		int eng=80;
		int math=96;
		
		//평균 점수 구하기(실수형)
		double double_sum=0;
		double_sum=(kor+eng+math)/3;
		
		System.out.println("평균 점수(실수형) : "+double_sum);
		
		
		
		//평균 점수 구하기(정수형)
		int int_sum=0;
		int_sum=(kor+eng+math)/3;
		
		System.out.println("평균점수(정수형) : "+int_sum);
		
		
	}

}
