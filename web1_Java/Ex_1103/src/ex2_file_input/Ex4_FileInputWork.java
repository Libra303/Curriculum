package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex4_FileInputWork {
	
	public static void main(String[] args) {
		
		//"C:\\Curriculum\\web1_Java_IO_test\\test.txt"�� ������ �о���� ��
		//������ ȸ���� ���� �ƴ����� �Ǵ��Ͻÿ�
		
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
			
//			�Ʒ� ����� 1byte�� �񱳶� �ѱ��� �ȵȴ�==================
//			int count = 0;
//			for(int i = 0; i < b.length; i++) {
//				if( b[i] != b[b.length-1-i]) break;
//				count++;
//			}
//			
//			if(count == b.length) {
//				System.out.println("ȸ���� �Դϴ�.");
//			}else {
//				System.out.println("ȸ������ �ƴմϴ�.");
//			}
//			==================================================
			
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if( ori.equals(rev) ) {
			System.out.println("ȸ���� �Դϴ�.");
		}else {
			System.out.println("ȸ������ �ƴմϴ�.");
		}
	}//main

}

