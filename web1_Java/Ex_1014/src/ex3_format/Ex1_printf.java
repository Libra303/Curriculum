package ex3_format;

public class Ex1_printf {
	
	public static void main(String[] args) {
		
		int age = 31;
		System.out.printf("�� ���̴� %d�� �Դϴ�\n", age);
		
		int year = 2021;
		int month = 10;
		int day = 4;
		//2021�� 10�� 14��
		//2021.10.14
		System.out.printf("%d�� %d�� %d��\n", year,month,day);
		System.out.printf("%d.%2d.%02d\n", year,month,day);
		
		float temp = 15.2f;
		//������ ����� 15.2�� �Դϴ�
		System.out.printf("������ ����� %.1f�� �Դϴ�\n", temp);
		
		char bt = 'o';
		System.out.printf("���� %c�� �Դϴ�\n", bt);
		
		System.out.printf("���� �̸��� %s�̰� ��� ���� %s�� �Դϴ�\n", "ȫ�浿","����");
		
		System.out.printf("%s, %s, %s", 10, 11.3f, 'A');
		
		//formatter�� ��Ģ
		//1) %d : ����
		//2) %f : �Ǽ�
		//3) %c : ����
		//4) %s : ���ڿ��� ������ ��� �⺻ �ڷ���
		//5) %o : 8����
		//6) %x : 16����
		
	}//main

}
