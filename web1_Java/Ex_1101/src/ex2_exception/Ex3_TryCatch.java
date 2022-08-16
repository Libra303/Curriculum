package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		
		try {
			int ans = sc.nextInt();
			System.out.println("입력받은 수 : " + ans);
		} catch (Exception e) {
			System.out.println("정수만 입력할 수 있습니다.");
		}
		
		
	}//main

}
