package ex3_multi_array;

public class Ex3_multiArray {
	public static void main(String[] args) {
		
		//2���� �迭 arr�� ��� ��� ���� �հ� ����� ���
		
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
		
		System.out.println("��� ���� �� : "+total+" ��� : "+avg);
		
	}//main

}
