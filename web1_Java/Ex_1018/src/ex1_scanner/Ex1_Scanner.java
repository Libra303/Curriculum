package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	
	public static void main(String[] args) {
		
		//키보드에서 입력받은 값을 처리하기 위한 Scanner
		Scanner sc = new Scanner( System.in );
		
		System.out.println("수1 : ");
		int month = sc.nextInt();
		System.out.println(month);
		
		System.out.println("수2 : ");
		int su2 = sc.nextInt();
		
		System.out.println(month + su2);
		
		System.out.println("연산자 : ");
		String op = sc.next();//키보드에서 문자열을 입력받는 코드
		System.out.println(op);
		
	}//main
	
}
