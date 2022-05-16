package ex2_singleFor;

public class Ex1_singleFor {
	
	public static void main(String[] args) {
		
		//for문 : 특정 명령문을 원하는 만큼 반복적으로 처리할 때 사용
		/*for( 초기식; 조건식; 증감식 ){
			조건식이 참일 떄 실행되는 영역
		  }
		*/
		
		for( int i = 0; i <= 5; i++ ) {
			//지역변수 i
			System.out.println(i);
			
		}//for
		
		//지역변수 i는 for문에서만 사용 가능하도록 만들어져 있으므로
		//for문을 벗어나면 사용할 수 없다.
		//System.out.println(i);
		
		int j = 0;//전역변수
		
		for( j = 0; j <= 10; j++ ) {
			
			System.out.println(j);
			
		}
		
		System.out.println(j);
		
		System.out.println("-------------------------------------------");
		
		//10부터 1까지 감소하는 값을 for문으로 출력
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------------------");
		
		for( int i = 0; i < 3; ) {
			System.out.println(i);
			i++;
		}
	
	
	}//main

}
