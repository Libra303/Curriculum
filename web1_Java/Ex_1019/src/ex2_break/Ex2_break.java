package ex2_break;

public class Ex2_break {
	
	public static void main(String[] args) {
		
		int n = 1;
		
		while( true ) {
			
			System.out.println(n);
			n++;
			
			if( n > 5 ) {
				break;
			}
			
		}//while
		
		System.out.println("---------------------------------");
		
		int num = 3;
		
		while( num < 10 ) {
			
			switch( num ) {
			
			case 3:
				System.out.println("나는 3이야");
				break;//switch의 break는 반복문 탈출이 아닌 switch문만 빠져나온다
				
			case 4:
				System.out.println("나는 4야");
				break;
			
			}//switch
			
			num++;
			
		}//while

	}//main
}
