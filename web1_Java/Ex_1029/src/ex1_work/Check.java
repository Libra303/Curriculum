package ex1_work;

import java.util.Random;

public class Check {
	
	private int random = new Random().nextInt(50) + 1;
	private int count = 0;
	private boolean result = false;
	
	//정답을 확인하고 프로그램을 종료할 것인지를 판단하는 메서드
	public boolean check( int n ) {
		count ++;
		
		if( n < random ) {
			System.out.println("UP!!");
		}else if( n > random ) {
			System.out.println("DOWN!!");
		}else {
			System.out.println( count + "회 만에 정답!");
			result = true;
		}
		
		return result;
	}//check()

}
