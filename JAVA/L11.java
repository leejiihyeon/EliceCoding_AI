package JAVA;

public class L11 {

	public static void main(String[] args) {
		
		int hour=3;
		int minute=5;
		
		System.out.println(hour+"시간 "+minute+"분"); //변수 hour와 minute 값을 출력 : 3시간 5분
		
		int totalMinute = (hour*60)+minute;
		System.out.println("총 "+ totalMinute +"분");
	}
}