package ex2_singleFor;

import java.util.Scanner;

public class Ex2_singleFor {
	
	public static void main(String[] args) {
		
		//1���� 100���� �ݺ��ϴ� for������ 3�� ����� ����Ͻÿ�
		for(int i = 0; i <= 100; i++) {
			
			if( i % 3 == 0) { 
				System.out.println(i+"�� 3�� ���");
			}//if
			
		}//for
		
		System.out.println("-------------------------------------------");
		
		//Ű���忡�� ���� n�� �Է¹޴´�
		//1���� n������ ���� ����Ͽ� ����� ���
		//(������� 5�� �Է¹޾Ҵٸ�, 1+2+3+4+5�� ����� 15�� ���)
		
		//���� : 5
		//15
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� : ");
		int n = sc.nextInt();
		
		int res = 0;
		
		for( int i = 1; i <= n; i++ ) {
			res += i;
		}
		
		System.out.println(res);
		
	}//main

}
