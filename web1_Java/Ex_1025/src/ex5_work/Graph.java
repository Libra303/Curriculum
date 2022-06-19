package ex5_work;

import java.util.Random;

public class Graph {
	
	public static void main(String[] args) {
		
		//·£´ý Å¬·¡½º·Î »©±â --------------------------------
		int[] res = new int[10];
		String nums = "";
		
		for(int i = 0; i < 100; i++) {
			int n = new Random().nextInt(10);
			nums += n;
			res[n] += 1;
		}
		
		System.out.println("100ÀÚ ·£´ý ¼ýÀÚ : " + nums);
		
		
		//show Å¬·¡½º·Î »©±â( ÆÄ¸®¹ÌÅÍ int[] res )-------------
		for(int i = 0; i < res.length; i++) {
			System.out.print(i+"ÀÇ °¹ ¼ö : ");
			for(int j = 0; j < res[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" "+res[i]);
		}
		
	}//main

}
