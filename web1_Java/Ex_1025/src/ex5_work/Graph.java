package ex5_work;

import java.util.Random;

public class Graph {
	
	public static void main(String[] args) {
		
		//���� Ŭ������ ���� --------------------------------
		int[] res = new int[10];
		String nums = "";
		
		for(int i = 0; i < 100; i++) {
			int n = new Random().nextInt(10);
			nums += n;
			res[n] += 1;
		}
		
		System.out.println("100�� ���� ���� : " + nums);
		
		
		//show Ŭ������ ����( �ĸ����� int[] res )-------------
		for(int i = 0; i < res.length; i++) {
			System.out.print(i+"�� �� �� : ");
			for(int j = 0; j < res[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" "+res[i]);
		}
		
	}//main

}
