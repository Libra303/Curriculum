package ex2_singleFor;

import java.util.Scanner;

public class Ex4_singleFor {
	
	public static void main(String[] args) {
		
		//Ű���忡�� n1, n2�� ������ ���� �Է¹޴´�
		//n1���� n2������ ���� ���
		//(������� 2�� 5�� �޾Ҵٸ� 2+3+4+5�� ����� 14�� ���)
		
		//��1 : 2
		//��2 : 5
		//14
		
		//��1 : 5
		//��2 : 2
		//14
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.print("��2 : ");
		int su2 = sc.nextInt();
		
		if(su1 > su2) {
			int temp = su1;
			su1 = su2;
			su2 = temp;
		}
		
		int res = 0;
		
		for(int i = su1; i <= su2; i++) {
			res += i ;
		}
		
		System.out.println("��� : " + res);
		
	}//main

}
