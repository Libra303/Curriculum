package ex1_string_method;

import java.util.Scanner;

public class Ex3_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 아무값이나 마구잡이로 입력을 받는다
		//입력받은 값에 소문자 a가 몇 개 있는지 갯수를 출력하시오
		
		//입력 : afdsaf43re
		//a의 개수 : 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 숫자나 입력 : ");
		String str = sc.next();
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if( str.charAt(i) == 'a' ) {
				count++;
			}
		}
		
		System.out.println("a의 개수 : "+count);
		
	}//main
}
