package ex3_format;

public class Ex1_printf {
	
	public static void main(String[] args) {
		
		int age = 31;
		System.out.printf("제 나이는 %d살 입니다\n", age);
		
		int year = 2021;
		int month = 10;
		int day = 4;
		//2021년 10월 14일
		//2021.10.14
		System.out.printf("%d년 %d월 %d일\n", year,month,day);
		System.out.printf("%d.%2d.%02d\n", year,month,day);
		
		float temp = 15.2f;
		//오늘의 기온은 15.2도 입니다
		System.out.printf("오늘의 기온은 %.1f도 입니다\n", temp);
		
		char bt = 'o';
		System.out.printf("저는 %c형 입니다\n", bt);
		
		System.out.printf("저의 이름은 %s이고 사는 곳은 %s동 입니다\n", "홍길동","마포");
		
		System.out.printf("%s, %s, %s", 10, 11.3f, 'A');
		
		//formatter의 규칙
		//1) %d : 정수
		//2) %f : 실수
		//3) %c : 문자
		//4) %s : 문자열을 포함한 모든 기본 자료형
		//5) %o : 8진수
		//6) %x : 16진수
		
	}//main

}
