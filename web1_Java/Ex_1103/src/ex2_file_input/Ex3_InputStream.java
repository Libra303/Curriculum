package ex2_file_input;

import java.io.IOException;

public class Ex3_InputStream {
	
	public static void main(String[] args) {
		
		System.out.print("값 : ");
		
		//Scanner sc = new Scanner(System.in);
		//String res = sc.next();
		
		byte[] keyboard = new byte[100];
		
		//표준입력장치(키보드)의 값을 읽어오기 위한 방법
		try {
			System.in.read( keyboard );
			
			String str = new String( keyboard ).trim();
			
			System.out.println( str );
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}//main

}
