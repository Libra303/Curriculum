package ex1_file;

import java.io.File;

public class Ex2_File {

	public static void main(String[] args) {
		
		String path = "C:\\Curriculum";
		File f1 = new File(path);
		
		if( f1.isDirectory() ) {
			
			String[] names = f1.list();//f1��ü�� ������ ���ϸ��� names�迭�� ����
			
			
			for( int i = 0; i < names.length; i++) {
				
				System.out.println( names[i] );
				
			}
			
		}
		
		
	}//main

}