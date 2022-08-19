package ex5_filewriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\fileWriter예제.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			fw.write("나는 fileWriter의 예제임\n");
			fw.write( "두줄도 쓸 수 있지렁");
			
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}
