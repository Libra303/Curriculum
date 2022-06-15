package ex1_string_method;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//키보드에서 받은 값이 회문수인지 판단하기
		
		//입력 : a123a
		//a123a 은(는) 회문수가 아닙니다
		
		//입력 : ab1c1ba
		//ab1c1ba 은(는) 회문수 입니다
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		String reStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reStr += str.charAt(i);
		}
		
		if( str.equals(reStr)) {
			System.out.println(str+" 은(는) 회문수입니다");
		}else {
			System.out.println(str+" 은(는) 회문수가 아닙니다");
		}

	}//main
}
