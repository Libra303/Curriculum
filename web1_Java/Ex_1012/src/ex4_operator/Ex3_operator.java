package ex4_operator;

public class Ex3_operator {
	
	public static void main(String[] args) {
		
		//����(����)������
		//�ϳ��� ������ �����ϰ� �� ������ ����� ���� 
		//���� �ٸ� ���� ���(����)�� �� �ֵ��� �� �ִ� ������
		
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b ? true : false;
		System.out.println(res);
		
		int res2 = (a += 4) >= b ?  100 : 200 ;
 		System.out.println(res2);
 		
 		System.out.println("------------------------------------------------");
 		
 	
 		//��������
 		//�񱳿����ڰ� 2�� �̻� ���� �� ���̸� �������ִ� ������
 		int age = 30;
 		int limit = 35;
 		
 		
 		//&&(and)������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�
 		//�� && �� => ��
 		//�� && ���� => ����
 		//���� && �� => ����
 		//���� && ���� => ����
 		res = limit - age >= 5 && age > 30;
 		System.out.println( "&&���� : " + res );
 		
 		res = limit - age >= 5 && (age += 2 ) > limit;
 		System.out.println(res);
 		System.out.println("�տ��� �� : " + age);
 		
 		res = limit - age < 3 && (age += 2 ) > limit;
 		System.out.println(res);
 		System.out.println("�տ��� ���� : " + age);
 		
 	
 		//||(or)������ : ���� ������ ���̸� ���� ������ �������� �ʴ´�
 		//���� || ���� => ����
 		//���� || �� => ��
 		//�� || ���� => ��
 		//�� || �� => ��
 		int n1 = 10;
 		int n2 = 20;
 		res = ( n1 += 10 ) > 20 || n2 - 10 == 11;
 		System.out.println("||���� : " + res);
 		
 	
 		//!(not) ������ : �����տ� �ٿ��� ���� ������ �ٲٴ� ������
 		boolean test = false;
 		System.out.println( !test );
 		System.out.println( test );
 		
 		test = !test;
 		System.out.println( test );
 		
 		System.out.println("---------------------------------------------");
 		
 		a = 10;
 		b = 12;
 		char ch = ++a >= b || 2 + (b - 5) <= b && 13 - b >= 0 && ( a += b ) - ( b % a ) > 10 ? 'O' : 'X' ;
 		System.out.println(ch);
 		
	}//main

}
