package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	
	public static void main(String[] args) {
		
		//Ű���忡�� �Է¹��� ���� ó���ϱ� ���� Scanner
		Scanner sc = new Scanner( System.in );
		
		System.out.println("��1 : ");
		int month = sc.nextInt();
		System.out.println(month);
		
		System.out.println("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.println(month + su2);
		
		System.out.println("������ : ");
		String op = sc.next();//Ű���忡�� ���ڿ��� �Է¹޴� �ڵ�
		System.out.println(op);
		
	}//main
	
}
