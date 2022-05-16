package ex2_switch;

public class Ex1_switch {
	
	public static void main(String[] args) {
		
		//switch-case문 :
		//조건값과 비교값을 통해 결과를 출력하는 제어문
		
		/*switch( 비교값 ){
			case 조건값:
				비교값과 조건값이 일치하면 실행되는 영역
				break;
		*/
		
		int n = 3;
		
		switch( n ) {//비교값
		
		case 1: //조건값
			System.out.println("1.게임시작");
			break;//switch문을 통째로 빠져나옴
			
		case 2:
			System.out.println("2.게임설명");
			break;
			
		case 3:
			System.out.println("3.게임종료");
			break;
		}//switch
		
	}//main
	
}
