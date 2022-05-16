package ex2_switch;

public class Ex3_switch {
	
	public static void main(String[] args) {
		
		//switch문의 조건값으로 사용할 수 있는 자료형 타입
		//1) long을 제외한 정수타입
		//2) char
		//3) String
		
		char gender = '여';
		
		switch( gender ) {
		
		case '남':
			System.out.println("나는 남자");
			//break;
			
		case '여':
			System.out.println("나는 여자");
			break;
			
		default:
			System.out.println("성별을 올바르게 입력하세요");
			break;

		}//switch
		
	}//main

}
