package ex7_work;

import java.util.TreeSet;

public class Ex1_Work {
	public static void main(String[] args) {
		
		//�Ʒ��� �迭�� �� �� ���� ū ���� ã�� ����Ͻÿ�
		int[] arr = {22, 54, 71, 35, 62};
		
		//������ ���-----------------------------------
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if( arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		//�� ���------------------------------------
		TreeSet<Integer> ts = new TreeSet<Integer>();
		for(int i : arr) ts.add(i);
		System.out.println(ts.last());
		
	}//main
}
