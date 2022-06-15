package ex1_single_array;

public class Ex3_singleArray {
	public static void main(String[] args) {
		
		//배열 arr에 담겨있는 모든 값의 합을 출력
		//결과 : 97
		int[] arr = {10,25,7,50,5};
		
		int result = 0;//총 합을 출력할 변수
		
		for( int i = 0; i < arr.length; i++) {
			result += arr[i];
		}//for
		
		System.out.println("결과 : " + result);
		
		//나의 풀이 ==============================
		int sum = 0;
		for(int i : arr ) sum += i;
		System.out.println(sum);
		
	}//main
}
