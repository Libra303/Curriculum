package ex5_filewriter;

import java.io.FileWriter;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\fileWriter����.txt";
		
		try {
			FileWriter fw = new FileWriter(path);
			fw.write("���� fileWriter�� ������\n");
			fw.write( "���ٵ� �� �� ������");
			
			fw.flush();
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}
