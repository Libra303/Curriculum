package ex3_file_ouput;

import java.io.FileOutputStream;

public class Ex2_FileOutput {
	
	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\fileOutput����.txt";
		
		try {
			
			FileOutputStream fos = new FileOutputStream( path );
			
			String msg1 = "fileOutput������";
			String msg2 = "�� �ٵ� �ȴ�";
			
			//StringŸ���� ��ü�� byte[] �������� �ٲ��ִ� getBytes() �޼���
			fos.write(msg1.getBytes());
			fos.write('\n');
			fos.write(msg2.getBytes());
			
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}//main

}