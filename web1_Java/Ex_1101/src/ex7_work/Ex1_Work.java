package ex7_work;

import java.util.TreeSet;

public class Ex1_Work {
	public static void main(String[] args) {
		
		//아래의 배열의 값 중 가장 큰 값을 찾아 출력하시오
		int[] arr = {22, 54, 71, 35, 62};
		
		//선생님 방식-----------------------------------
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if( arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		//내 방식------------------------------------
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i : arr) ts.add(i);
		System.out.println(ts.last());
		
	}//main
}
