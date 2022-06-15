package ex1_single_array;

import java.util.Random;

public class Ex4_singleArray {
	public static void main(String[] args) {
		
		//변수 money에 10 ~ 5000 사이의 난수를 만든다.
		//단, 3450, 2100과 같이 1의 자리는 반드시 0이 되어야 한다
		
		int money = 0;
		money = new Random().nextInt(500)+1;
		money *= 10;
		
		System.out.println( "금액 : " + money );
		
		int[] coin = {500, 100, 50, 10};
		
		for(int i : coin) {
			System.out.println(i+"원 : "+money/i);
			money %= i;
		}
		
		
		//이하 선생님 풀이================================
		
		for( int i =0; i < coin.length; i++) {
			int res = money / coin[i];
			
			if( res > 0 ) {
				System.out.println( coin[i] + "원 : " + res);
				money %= coin[i];
			}
			
		}//for
		
		
		
	}//main

}
