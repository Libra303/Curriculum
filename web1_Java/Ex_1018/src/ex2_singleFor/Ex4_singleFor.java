package ex2_singleFor;

import java.util.Scanner;

public class Ex4_singleFor {
	
	public static void main(String[] args) {
		
		//키보드에서 n1, n2에 정수를 각각 입력받는다
		//n1부터 n2까지의 합을 출력
		//(예를들어 2와 5를 받았다면 2+3+4+5의 결과인 14를 출력)
		
		//수1 : 2
		//수2 : 5
		//14
		
		//수1 : 5
		//수2 : 2
		//14
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {
			int temp = su1;
			su1 = su2;
			su2 = temp;
		}
		
		int res = 0;
		
		for(int i = su1; i <= su2; i++) {
			res += i ;
		}
		
		System.out.println("결과 : " + res);
		
	}//main

}
