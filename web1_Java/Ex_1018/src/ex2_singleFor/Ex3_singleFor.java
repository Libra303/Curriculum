package ex2_singleFor;

import java.util.Scanner;

public class Ex3_singleFor {
	
	public static void main(String[] args) {
		
		//Scanner�� ���� Ű���忡�� 2 ~ 9������ ���� �Է� �޴´�
		//�Է¹��� ���� �ش��ϴ� �������� ���
		//��, 2 ~ 9 ������ ���ڰ� �Էµ��� �ʾ��� ��쿡��
		//�������� ǥ�������� �ƴմϴ�. �� ����ϼ���
		
		//�� : 1
		//�������� ǥ�������� �ƴմϴ�.
		
		//�� : 3
		//3 * 1 = 3
		//3 * 2 = 6
		// ...
		//3 * 9 = 27
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int dan = sc.nextInt();
		
		if( dan < 2 || dan > 9) {
			System.out.println("�������� ǥ�������� �ƴմϴ�.");
		}else {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d * %d = %d\n", dan,i,dan*i);
			}			
		}
		
		
		
	}//main

}
