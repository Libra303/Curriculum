package ex4_work;

import java.util.Scanner;

public class Ex2_work {
	
	public static void main(String[] args) {
		
		//소수 : 약수가 1과 내 자신만 존재하는 수
		
		//수 : 7
		//소수입니다
		
		//수 : 8
		//소수가 아닙니다
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 : ");
		int su = sc.nextInt();
		
		int i = 0;
		for( i = 2; i <= su; i ++ ) {
			if(su % i == 0 ) break;
		}
		
		if( i == su ) {
			System.out.println("소수입니다");
		}else {
			System.out.println("소수가 아닙니다");
		}
		
	}//main
}
