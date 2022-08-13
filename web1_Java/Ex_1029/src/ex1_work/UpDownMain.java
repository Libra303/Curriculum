package ex1_work;

import java.util.Scanner;

public class UpDownMain {
	public static void main(String[] args) {
		
		Check ck = new Check();
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		
		while( true ) {
			
			System.out.print("Á¤¼ö : ");
			answer = sc.nextInt();
			
			if(ck.check(answer)) break;
			
		}//while
		
		
	}//main

}
