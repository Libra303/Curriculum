package ex4_file_reader;

import java.io.FileReader;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\file.txt";
		int upper = 0;
		int lower = 0;
		
		try {
			FileReader fr = new FileReader(path);
			int count = 0;
			
			while( (count = fr.read()) != -1 ) {
				
				if( count >= 65 && count <= 90 ) {
					upper++;
				}else if( count >= 'a' && count <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main

}
