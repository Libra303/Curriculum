package ex4_work;

import java.util.Scanner;

public class Ex1_work {
	
	public static void main(String[] args) {
		//�ִ����� : �� ���� ����� ����� ���� ū �� 
		//Ű���忡�� ���� �޾Ƽ� �� ���� �ִ������� ���
		
		//�� 1 : 10
		//�� 2 : 4
		//�ִ� ����� : 2
		//(��, ū ���� ���� ����)
		
		//�� 1 : 7
		//�� 2 : 3
		//�ִ����� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� 1 : ");
		int su1 = sc.nextInt();		
		System.out.print("�� 2 : ");
		int su2 = sc.nextInt();
		
		int res = 1;
		for(int i = su2; i > 1; i--) {
			if( su2 % i == 0 && su1 % i == 0) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
		
		System.out.println("------------------------------------------------------");
		int i = 0;
		for( i = su2; i >= 1 ; i--) {
			if( su2 % i == 0 && su1 % i == 0) break;
		}
		
		System.out.println(i);
	}//main
}
