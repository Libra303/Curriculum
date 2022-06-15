package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	
	public static void main(String[] args) {
		//최대공약수 : 두 수의 공통된 약수중 가장 큰 수 
		//키보드에서 값을 받아서 두 수의 최대공약수를 출력
		
		//수 1 : 10
		//수 2 : 4
		//최대 공약수 : 2
		//(단, 큰 수를 먼저 받음)
		
		//수 1 : 7
		//수 2 : 3
		//최대공약수 없음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 1 : ");
		int su1 = sc.nextInt();		
		System.out.print("수 2 : ");
		int su2 = sc.nextInt();
		
		int res = 1;
		for(int i = su2; i > 1; i--) {
			if( su2 % i == 0 && su1 % i == 0) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		
		System.out.println("------------------------------------------------------");
		int i = 0;
		for( i = su2; i >= 1 ; i--) {
			if( su2 % i == 0 && su1 % i == 0) break;
		}
		
		System.out.println(i);
	}//main
}
