package ex3_continue;

public class Ex1_continue {
	
	public static void main(String[] args) {
		//continue�� : �ݺ��� ������ Ư�� ������ ������ �ǳʶٰ��� �� �� ���
		for( int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 5; j++ ) {
				
				if( j % 2 == 0 ) {
					continue;//����� for���� ���������� �̵�
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
//					continue;//����� �ݺ����� �������� ���ٸ� ���ǽ����� �̵�					
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
				continue;//�ݺ��� ������ switch������ continue ��� ����
				
			case 2:
				continue;
				
			}//switch
		}//while
		
	
	}//main
	
}
