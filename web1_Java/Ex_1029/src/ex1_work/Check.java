package ex1_work;

import java.util.Random;

public class Check {
	
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean result = false;
	
	//������ Ȯ���ϰ� ���α׷��� ������ �������� �Ǵ��ϴ� �޼���
	public boolean check( int n ) {
		count ++;
		
		if( n < random ) {
			System.out.println("UP!!");
		}else if( n > random ) {
			System.out.println("DOWN!!");
		}else {
			System.out.println( count + "ȸ ���� ����!");
			result = true;
		}
		
		return result;
	}//check()

}
