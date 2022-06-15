package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//난수 만들기
		//예) 2 ~ 9 사이의 난수를 만들고 싶다
		//new Random().nextInt( 발생시킬 난수의 범위 ) + 작은 수;
		//new Random().nextInt( 큰 수 - 작은 수 + 1 ) + 작은 수;
		int rnd = new Random().nextInt( 9 - 2 + 1 ) + 2;
		System.out.println(rnd);
		
	}//main
}
