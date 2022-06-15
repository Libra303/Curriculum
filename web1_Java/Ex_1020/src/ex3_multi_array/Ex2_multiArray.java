package ex3_multi_array;

public class Ex2_multiArray {
	public static void main(String[] args) {
		
		//int[] a = {1,2,3,4,5};
		
		String[][] student = { {"¿µÈñ","99","97","98"}, 
				               {"Ã¶¼ö","45","32"} };
		
		//¿µÈñ 99 97 98
		//Ã¶¼ö 45 32 
		
		for(int i = 0; i < student.length; i++ ) {
			for(int j = 0; j < student[i].length; j++) {
				
				System.out.print(student[i][j] + " ");
				
			}//inner
			System.out.println();
		}//outer
		
	}//main
}
