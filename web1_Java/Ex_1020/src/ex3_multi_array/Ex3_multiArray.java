package ex3_multi_array;

public class Ex3_multiArray {
	public static void main(String[] args) {
		
		//2차원 배열 arr에 담긴 모든 값의 합과 평균을 출력
		
		int[][] arr = {
				{14,22,1},{15,21,10,23},{11,1,2,3,4,5},{10, 8}
		};
		
		int count = 0, total = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				
				total += arr[i][j];
				count++;
				
			}//inner
		}//outer
		
		float avg  = (float)total / count;
		
		System.out.println("모든 값의 합 : "+total+" 평균 : "+avg);
		
	}//main

}
