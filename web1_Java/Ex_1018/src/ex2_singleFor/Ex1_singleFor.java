package ex2_singleFor;

public class Ex1_singleFor {
	
	public static void main(String[] args) {
		
		//for�� : Ư�� ��ɹ��� ���ϴ� ��ŭ �ݺ������� ó���� �� ���
		/*for( �ʱ��; ���ǽ�; ������ ){
			���ǽ��� ���� �� ����Ǵ� ����
		  }
		*/
		
		for( int i = 0; i <= 5; i++ ) {
			//�������� i
			System.out.println(i);
			
		}//for
		
		//�������� i�� for�������� ��� �����ϵ��� ������� �����Ƿ�
		//for���� ����� ����� �� ����.
		//System.out.println(i);
		
		int j = 0;//��������
		
		for( j = 0; j <= 10; j++ ) {
			
			System.out.println(j);
			
		}
		
		System.out.println(j);
		
		System.out.println("-------------------------------------------");
		
		//10���� 1���� �����ϴ� ���� for������ ���
		
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
