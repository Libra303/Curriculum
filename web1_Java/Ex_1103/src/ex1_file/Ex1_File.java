package ex1_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		
		//IO( Input, Output )
		//IO는 입출력 스트림을 의미한다
		//스트림이란, 데이터를 입출력하기 위한 일종의 통로
		//JVM에서 콘솔로 값을 내보내면 Output
		//콘솔의 값을 JVM에서 읽는 경우는 Input
		
		String path = "C:\\Curriculum\\web1_Java_IO_test\\test.txt";
		File f1 = new File(path);
		
		if( !f1.isDirectory() ) {
			System.out.println("파일크기 : " + f1.length() + "byte");
		}
		
	}

}
