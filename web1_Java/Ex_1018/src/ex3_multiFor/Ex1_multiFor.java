package ex3_multiFor;

import java.util.Scanner;

public class Ex1_multiFor {
	
	public static void main(String[] args) {
		
		//다중 for문 : for문 안에 for 문이 포함되어 있는 경우
		
		//1 2 3
		//1 2 3
		
		for(int i = 0; i < 2; i ++) { //y축(행)
			
			for(int j = 1; j < 4; j++) { //x축(열)
				System.out.print(j+ " ");
			}//inner
			
			System.out.println();//줄바꿈
		}//outer
		
		System.out.println("----------------------------------------------");
		//1 2 3 4 6 6
		//1 2 3 4 5 6
		//1 2 3 4 5 6
		//1 2 3 4 5 6
		
		for(int i = 0; i < 4; i ++) { //y축(행)
			
			for(int j = 1; j < 7; j++) { //x축(열)
				System.out.print(j+ " ");
			}//inner
			
			System.out.println();//줄바꿈
		}//outer
		
		System.out.println("----------------------------------------------");
		
		//01 02 03 04
		//05 06 07 08
		int num = 1;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.printf("%02d ", num);
				num++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		//A B C D
		//E F G H
		//I J K L
		char c = 65;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

		System.out.println("----------------------------------------------");
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		//        *
		//      * * *
		//    * * * * *
		//  * * * * * * *
		//* * * * * * * * *
		for(int i = 1; i <= 5; i++) {
			for(int j = 5 - i; j > 0; j--) {
				System.out.print("  ");
			}
			
			for(int j = 0; j < 2*i-1 ; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		System.out.println("----------------------------------------------");
		
		System.out.print("1이상 홀수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		if( row < 1 || row % 2 == 0) {
			System.out.println("잘 못 된 값");
		}else {
			
			for(int i = 1; i <= row; i++) {
				
				for(int j = row - i ; j > 0; j--) {
					System.out.print("  ");
				}//빈칸
				
				for(int j = 0; j < 2*i-1; j++) {
					System.out.print("* ");
				}//별
				System.out.println();
				
			}
			
			System.out.println("----------------------------------------------");
			//        *
			//      * * *
			//    * * * * *
			//  * * * * * * *
			//* * * * * * * * *
			//  * * * * * * *
			//    * * * * *
			//      * * *
			//        *
			
			for(int i = 1; i <= row; i++) {
				
				for(int j = row - i ; j > 0; j--) {
					System.out.print("  ");
				}//빈칸
				
				for(int j = 0; j < 2*i-1; j++) {
					System.out.print("* ");
				}//별
				System.out.println();
			}
			
			for(int i = row-1; i > 0; i--) {
				
				for(int j = row - i ; j > 0; j--) {
					System.out.print("  ");
				}//빈칸
				
				for(int j = 0; j < 2*i-1; j++) {
					System.out.print("* ");
				}//별
				System.out.println();
			}
			
		}
		
	}//main

}
