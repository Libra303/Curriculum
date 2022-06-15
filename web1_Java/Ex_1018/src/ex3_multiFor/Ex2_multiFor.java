package ex3_multiFor;

public class Ex2_multiFor {
	
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		// 	      ....
		//10 1 2 3 4 5 6 7 8 9
		
		
		for(int i = 1 ; i <= 10; i++) {
			int a = i;
			for(int j = 0; j < 10; j++) {
				System.out.printf("%02d ",a++);
				if(a>10) a = 1;
			}
			System.out.println();
		}
		
		
	}//main

}
