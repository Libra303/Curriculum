package ex1_single_array;

public class Ex1_singleArray {
	
	public static void main(String[] args) {
		
		//배열 : '같은 자료형 끼리 모아둔 하나의 묶음'이다.
		//효율적인 자료 관리를 위해 반드시 필요.
		
		int su1 = 100;
		int su2 = 200;
		int su3 = 300;
		int su4 = 400;
		
		System.out.println(su1);
		System.out.println(su2);
		System.out.println(su3);
		System.out.println(su4);
		
		System.out.println("------------------------------------");
		
		//1) 배열 선언
		int[] arr;
		
		//2) 배열 생성
		arr = new int[4];
		
		//3) 배열 초기화
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		//arr[4] = 500; --> 배열의 존재하지 않는 index에 값을 추가할 수 없다
		
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println( arr[i] );
		}
		
		System.out.println("------------------------------------");

		//선언과 생성을 동시에
		int[] myArr = new int[4];
		for( int i = 0; i < myArr.length; i++ ) {
			myArr[i] = (i + 1) * 100;
			System.out.println(myArr[i]);
		}
		
		
		
		
	}//main
}
