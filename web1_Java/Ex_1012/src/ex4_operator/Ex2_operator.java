package ex4_operator;

public class Ex2_operator {
	
	public static void main(String[] args) {
		
		//�񱳿�����
		//������ ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		//�񱳿����ڸ� ���� ������ ����� �ݵ�� boolean����
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("< : " + res);
		
		res = n1 >= n2;
		System.out.println(">= : " + res);
		
		res = n1 == n2;
		System.out.println("== : " + res);
		
		res = n1 != n2;
		System.out.println("!= : " + res);
		
		
		System.out.println("---------------------------------------------");
		
		
		//����������
		//1�� ������Ű�ų� 1�� ���ҽ�Ű�� ������
		//���������� ���������� �������� �˾Ƶ���!!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		++b;
		++b;
		b--;
		--b;
		b++;
		b--;
		--b;
		++b;
		System.out.println(b++);//11
		
	}//main

}
