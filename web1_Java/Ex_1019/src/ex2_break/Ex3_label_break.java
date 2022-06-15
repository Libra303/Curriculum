package ex2_break;

public class Ex3_label_break {
	
	public static void main(String[] args) {
		
		//label : 일반적인 break, continue와는 달리
		//멀리 떨어져 있는 반복문까지 제어가 가능하도록 하는 키워드
		
		out : for( int i = 1; i <= 3; i++ ) {
			
			for( int j = 1; j <= 10; j++ ) {
				
				if( j % 2 ==0 ) {
					break out;
				}
				System.out.print(j + " ");
				
			}//inner
			System.out.println();
		}//outer
		
		
	}//main

}
