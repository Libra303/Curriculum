package ex1_single_array;

import java.util.Random;

public class Ex5_work {
	public static void main(String[] args) {
		//1 ~ 45 사이의 난수를 발생시켜 로또번호 생성하기
		//11 6 19 22 41 23
		
		int[] lotto = new int[6];
		
		int count = 0;
		again : while( count < 6 ) {
			int n = new Random().nextInt(45)+1;
			
			for(int i = 0 ; i < count; i++) {
				if(lotto[i] == n) continue  again;
			}
			
			System.out.print(n+" ");
			lotto[count] = n;
			count++;
		}
		
	}//main
}
