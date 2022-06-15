package ex3_continue;

public class Ex1_continue {
	
	public static void main(String[] args) {
		//continue문 : 반복문 내에서 특정 문장을 강제로 건너뛰고자 할 때 사용
		for( int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					continue;//가까운 for문의 증감식으로 이동
				}
				
				System.out.print(j+" ");
				
			}//inner
			System.out.println();
		}//outer
		
		System.out.println("--------------------------------");
		
//		for( int i = 1; i <= 2; i++) {
//			
//			for(int j =1; j <= 5; ) {
//				
//				if( j % 2 == 0) {
//					continue;//가까운 반복문에 증감식이 없다면 조건식으로 이동					
//				}
//				System.out.println(j + " ");
//				j++;
//			}//inner	
//			System.out.println();
//		}//outer
	
		System.out.println("--------------------------------");

		int n = 0;
		
		while( n < 10 ) {
			n++;
			if( n % 3 == 0 ) continue;
			System.out.println(n);
		}//while
		
		System.out.println("--------------------------------");

		int num = 0;
		
		while( num < 3 ) {
			num ++;

			switch(num) {
			
			case 1:
				continue;//반복문 내부의 switch에서는 continue 사용 가능
				
			case 2:
				continue;
				
			}//switch
		}//while
		
	
	}//main
	
}
