package ex1_string_method;

import java.util.Scanner;

public class Ex4_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 이메일을 입력받고, @앞의 문장의 길이가
		//6미만이거나 10초과일때는 '잘못된 형식'이라는 메세지를 출력
		
		//abc@n.com
		//잘못된 형식입니다
		
		//aabbcc@k.com
		//aabbcc님 로그인 성공
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		
		int len = email.indexOf('@');
		
		if(len < 6 || len > 10) {
			System.out.println("잘못된 형식");
		}else {
			System.out.println(email.substring(0,len)+"님 로그인 성공");
		}

	}//main

}
