package ex1_single_array;

public class Ex3_singleArray {
	public static void main(String[] args) {
		
		//�迭 arr�� ����ִ� ��� ���� ���� ���
		//��� : 97
		int[] arr = {10,25,7,50,5};
		
		int result = 0;//�� ���� ����� ����
		
		for( int i = 0; i < arr.length; i++) {
			result += arr[i];
		}//for
		
		System.out.println("��� : " + result);
		
		//���� Ǯ�� ==============================
		int sum = 0;
		for(int i : arr ) sum += i;
		System.out.println(sum);
		
	}//main
}
