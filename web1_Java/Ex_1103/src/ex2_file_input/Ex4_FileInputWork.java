package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInputWork {
	
	public static void main(String[] args) {
		
		//"C:\\Curriculum\\web1_Java_IO_test\\test.txt"의 내용을 읽어들인 후
		//내용이 회문수 인지 아닌지를 판단하시오
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\test.txt";
		File f = new File(path);
		byte[] b = new byte[ (int)f.length() ];
		byte[] b2 = new byte[ (int)f.length() ];
		String ori = "";
		String rev = "";
		
		
		try {
			
			FileInputStream fis = new FileInputStream(f);
			fis.read(b);
			
			ori = new String( b );
			rev = "";
			
			for(int i = ori.length()-1; i >= 0; i--) {
				rev += ori.charAt(i);
			}
			
//			아래 방법은 1byte씩 비교라 한글은 안된다==================
//			int count = 0;
//			for(int i = 0; i < b.length; i++) {
//				if( b[i] != b[b.length-1-i]) break;
//				count++;
//			}
//			
//			if(count == b.length) {
//				System.out.println("회문수 입니다.");
//			}else {
//				System.out.println("회문수가 아닙니다.");
//			}
//			==================================================
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if( ori.equals(rev) ) {
			System.out.println("회문수 입니다.");
		}else {
			System.out.println("회문수가 아닙니다.");
		}
	}//main

}

