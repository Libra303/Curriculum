package ex2_exception;

public class Ex2_TryCatch {
	public static void main(String[] args) {
		
		//이렇게 예외처리 하지 말자
		//예측 가능한 오류에만 사용하자
		//ex) 키보드로 값 받기
		
		try {
			
			int[] arr = {10, 20, 30};
			
			for( int i = 0; i <= arr.length; i++) {
				System.out.println( arr[i] );
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}//main

}
