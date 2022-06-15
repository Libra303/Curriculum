package ex3_multi_array;

import java.util.Scanner;

public class Ex4_multiArray {
	public static void main(String[] args) {
	
		 
		 int[][] arr;
		 int num = 1;//시작수
		 int size = 0;//마방진 사이즈
		 int y = 0;//행(y)
		 int x = 0;//열(x)
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 : ");
		 size = sc.nextInt();
		 
		 x = size / 2;
		 arr = new int[size][size];
		 
		 while( num <= size * size) {
			 
			 arr[y][x] = num;
			 
			 if( num % size == 0 ) {
				 y++;
			 }else {
				 y--;
				 x++;
			 }
			 
			 if( y < 0 ) {
				 y = size - 1 ;
			 }
			 
			 if( x == size ) {
				 x = 0;
			 }
			 
			 num++;
		 }//while
		 
		 for( int i = 0; i < size; i++) {
			 for(int j = 0; j < size; j++) {
				 System.out.printf("%02d ",arr[i][j]);
			 }//inner
			 System.out.println();
		 }//outer
		
		 
	}//main
	
}
