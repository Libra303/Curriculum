package ex4_work;

import java.util.Scanner;

public class Ex2_work {
	
	public static void main(String[] args) {
		
		//�Ҽ� : ����� 1�� �� �ڽŸ� �����ϴ� ��
		
		//�� : 7
		//�Ҽ��Դϴ�
		
		//�� : 8
		//�Ҽ��� �ƴմϴ�
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		int su = sc.nextInt();
		
		int i = 0;
		for( i = 2; i <= su; i ++ ) {
			if(su % i == 0 ) break;
		}
		
		if( i == su ) {
			System.out.println("�Ҽ��Դϴ�");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�");
		}
		
	}//main
}
