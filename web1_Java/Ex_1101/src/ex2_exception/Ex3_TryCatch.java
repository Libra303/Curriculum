package ex2_exception;

import java.util.Scanner;

public class Ex3_TryCatch {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		
		try {
			int ans = sc.nextInt();
			System.out.println("�Է¹��� �� : " + ans);
		} catch (Exception e) {
			System.out.println("������ �Է��� �� �ֽ��ϴ�.");
		}
		
		
	}//main

}
