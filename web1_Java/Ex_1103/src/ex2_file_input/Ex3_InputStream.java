package ex2_file_input;

import java.io.IOException;

public class Ex3_InputStream {
	
	public static void main(String[] args) {
		
		System.out.print("�� : ");
		
		//Scanner sc = new Scanner(System.in);
		//String res = sc.next();
		
		byte[] keyboard = new byte[100];
		
		//ǥ���Է���ġ(Ű����)�� ���� �о���� ���� ���
		try {
			System.in.read( keyboard );
			
			String str = new String( keyboard ).trim();
			
			System.out.println( str );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//main

}
