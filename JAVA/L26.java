package JAVA;
/*
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
실행결과]
국어:89, 영어:99, 수학:78
총점:266
*/
public class L26 {

	public static void main(String[] args) {
		
		//국어, 영어, 수학 점수 변수 선언
		int kor, eng, math;
		
		//국어, 영어, 수학 점수 대입
		kor=89;
		eng=99;
		math=78;
		
		//국어, 영어, 수학 총점 변수 선언 및 대입
		int sum=(kor+eng+math);
		
		//총점 출력
		System.out.println("국어, 영어, 수학 총점 : "+sum);
	} //메인 종료
} //클래스 종료