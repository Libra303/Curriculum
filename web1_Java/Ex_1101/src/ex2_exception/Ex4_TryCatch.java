package ex2_exception;

import java.util.Scanner;

public class Ex4_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		
		String str = sc.next();
		
		try {
			int n = Integer.parseInt(str);
			System.out.println("�Է¹��� �� : " + n);
		} catch (Exception e) {
			System.out.println( str + "��(��) ������ �ƴմϴ�");
		}
		
	}//main

}