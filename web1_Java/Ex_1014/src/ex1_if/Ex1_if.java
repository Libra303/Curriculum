package ex1_if;

public class Ex1_if {
	
	public static void main(String[] args) {
	
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//분기문과 반복문으로 나뉜다
		
		//분기문 : if, switch
		//반복문 : for, while
		
		//if문 : 조건식에 따라 참과 거짓을 판단하는 연산자
		//if( 조건식 ){ <- 조건식 : 결과가 참, 거짓인 모든 질문
		//	조건식이 참일때 실행되는 영역
		//}
		
		int n = 51;
		String str = "안녕하세요";//쌍따옴표 안에 여러글자를 저장 가능한 문자열 자료형 
		
		if( n == 50 ) {
			
			str = "n은 50입니다";
			
		}
	
		System.out.println(str);
		
	}//main
	
	
}
