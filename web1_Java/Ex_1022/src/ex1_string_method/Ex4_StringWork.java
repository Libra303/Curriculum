package ex1_string_method;

import java.util.Scanner;

public class Ex4_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� �̸����� �Է¹ް�, @���� ������ ���̰�
		//6�̸��̰ų� 10�ʰ��϶��� '�߸��� ����'�̶�� �޼����� ���
		
		//abc@n.com
		//�߸��� �����Դϴ�
		
		//aabbcc@k.com
		//aabbcc�� �α��� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է� : ");
		String email = sc.next();
		
		int len = email.indexOf('@');
		
		if(len < 6 || len > 10) {
			System.out.println("�߸��� ����");
		}else {
			System.out.println(email.substring(0,len)+"�� �α��� ����");
		}

	}//main

}
