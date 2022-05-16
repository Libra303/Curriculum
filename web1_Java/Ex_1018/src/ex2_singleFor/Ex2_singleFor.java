package ex2_singleFor;

import java.util.Scanner;

public class Ex2_singleFor {
	
	public static void main(String[] args) {
		
		//1부터 100까지 반복하는 for문에서 3의 배수만 출력하시오
		for(int i = 0; i <= 100; i++) {
			
			if( i % 3 == 0) { 
				System.out.println(i+"는 3의 배수");
			}//if
			
		}//for
		
		System.out.println("-------------------------------------------");
		
		//키보드에서 정수 n을 입력받는다
		//1부터 n까지의 합을 계산하여 결과를 출력
		//(예를들어 5를 입력받았다면, 1+2+3+4+5의 결과인 15가 출력)
		
		//정수 : 5
		//15
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int n = sc.nextInt();
		
		int res = 0;
		
		for( int i = 1; i <= n; i++ ) {
			res += i;
		}
		
		System.out.println(res);
		
	}//main

}
