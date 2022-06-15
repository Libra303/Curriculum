package ex1_single_array;

import java.util.Random;

public class Ex4_singleArray {
	public static void main(String[] args) {
		
		//���� money�� 10 ~ 5000 ������ ������ �����.
		//��, 3450, 2100�� ���� 1�� �ڸ��� �ݵ�� 0�� �Ǿ�� �Ѵ�
		
		int money = 0;
		money = new Random().nextInt(500)+1;
		money *= 10;
		
		System.out.println( "�ݾ� : " + money );
		
		int[] coin = {500, 100, 50, 10};
		
		for(int i : coin) {
			System.out.println(i+"�� : "+money/i);
			money %= i;
		}
		
		
		//���� ������ Ǯ��================================
		
		for( int i =0; i < coin.length; i++) {
			int res = money / coin[i];
			
			if( res > 0 ) {
				System.out.println( coin[i] + "�� : " + res);
				money %= coin[i];
			}
			
		}//for
		
		
		
	}//main

}
