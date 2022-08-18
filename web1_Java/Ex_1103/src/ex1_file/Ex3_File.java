package ex1_file;

import java.io.File;

public class Ex3_File {
	
	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\aaa\\bbb";
		File f = new File(path);
		
		if ( !f.exists() ) {
			
			//System.out.println("경로가 존재하지 않습니다.");
			f.mkdirs();//폴더생성
			
		}
		
	}//main
}
