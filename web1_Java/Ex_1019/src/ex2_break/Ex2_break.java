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
				System.out.println("���� 3�̾�");
				break;//switch�� break�� �ݺ��� Ż���� �ƴ� switch���� �������´�
				
			case 4:
				System.out.println("���� 4��");
				break;
			
			}//switch
			
			num++;
			
		}//while

	}//main
}
