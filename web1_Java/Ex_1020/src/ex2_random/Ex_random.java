package ex2_random;

import java.util.Random;

public class Ex_random {
	public static void main(String[] args) {
		
		//���� �����
		//��) 2 ~ 9 ������ ������ ����� �ʹ�
		//new Random().nextInt( �߻���ų ������ ���� ) + ���� ��;
		//new Random().nextInt( ū �� - ���� �� + 1 ) + ���� ��;
		int rnd = new Random().nextInt( 9 - 2 + 1 ) + 2;
		System.out.println(rnd);
		
	}//main
}
