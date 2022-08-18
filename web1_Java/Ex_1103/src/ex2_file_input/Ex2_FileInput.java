package ex2_file_input;

import java.io.File;
import java.io.FileInputStream;

public class Ex2_FileInput {

	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\test.txt";
		File f1 = new File(path);
		
		byte[] b_read = new byte[ (int)f1.length() ];
		
		if( f1.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f1);
			
				fis.read(b_read);//fis�� �о�� �����͸� b_read�迭�� ���������� 1byte�� ����
				
				//b_read�� result��� ���ڿ��� ������
				String result = new String( b_read ).trim();
				
				System.out.println(result);
				
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}//main
	
}
