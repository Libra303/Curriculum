package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	
	public static void main(String[] args) {
		
		//String�� �ΰ��� Ư¡�� ������ �ִ�.
		//1) ��ü �������� �ΰ���( �Ͻ���, ����� ) 
		//2) �� �� ������ ������ ������ �ʴ´�(�Һ��� Ư¡)
		
		String s1 = "abc";//�Ͻ��� ��ü����
		String s2 = "abc";
		
		//����� ��ü ����
		//����� ��ü������ heap�޸𸮿� �̹� ���� ���� ���� ������ �����ϴ���
		//������ ���ο� ������ �����Ͽ� ���� �����ϴ� ���
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1 == s3) {
			//==�� ������ �񱳿����� ���� ��������
			//��ü�� �񱳿����� �ּҸ� ���Ѵ�.
			System.out.println("�ּҰ� �����ϴ�");
		}else {
			System.out.println("�ּҰ� �ٸ��ϴ�");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String str = sc.next();
		
		//equals() : String ��ü�� '��'�� ���� �������� ���ϴ� ���
		if( s1.equals(str) ) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�");
		}
		
		System.out.println("--------------------------------------------------------");
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println( greet );

		 
	}//main
	
}
