package ex2_break;

public class Ex1_Break {
	
	public static void main(String[] args) {
		//break�� : �ݺ��� ������ ���������� ���� ����� �ݺ����� �������� �� ���
		for( int i = 1; i <= 2; i++) {
			
			for(int j = 1; j <= 10; j++) {
				
				if( j % 2 == 0) {
					break;
				}
				System.out.print(j+" ");
			}//inner
			System.out.println();
		}//outer
		
		
	}//main

}
