package ex2_singleFor;

import java.util.Scanner;

public class Ex3_singleFor {
	
	public static void main(String[] args) {
		
		//Scanner를 통해 키보드에서 2 ~ 9사이의 값을 입력 받는다
		//입력받은 수에 해당하는 구구단을 출력
		//단, 2 ~ 9 사이의 숫자가 입력되지 않았을 경우에는
		//구구단의 표현범위가 아닙니다. 를 출력하세요
		
		//단 : 1
		//구구단의 표현범위가 아닙니다.
		
		//단 : 3
		//3 * 1 = 3
		//3 * 2 = 6
		// ...
		//3 * 9 = 27
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 : ");
		int dan = sc.nextInt();
		
		if( dan < 2 || dan > 9) {
			System.out.println("구구단의 표현범위가 아닙니다.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan,i,dan*i);
			}			
		}
		
		
		
	}//main

}
