package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	
	public static void main(String[] args) {
		
		//String은 두가지 특징을 가지고 있다.
		//1) 객체 생성법이 두가지( 암시적, 명시적 ) 
		//2) 한 번 생성된 내용은 변하지 않는다(불변적 특징)
		
		String s1 = "abc";//암시적 객체생성
		String s2 = "abc";
		
		//명시적 객체 생성
		//명시적 객체생성은 heap메모리에 이미 같은 값을 가진 영역이 존재하더라도
		//무조건 새로운 영역을 생성하여 값을 저장하는 방법
		String s3 = new String("abc");
		String s4 = new String("abc");
		
		if(s1 == s3) {
			//==은 변수간 비교에서는 값을 비교하지만
			//객체간 비교에서는 주소릴 비교한다.
			System.out.println("주소가 같습니다");
		}else {
			System.out.println("주소가 다릅니다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("값 : ");
		String str = sc.next();
		
		//equals() : String 객체의 '값'이 서로 같은지를 비교하는 기능
		if( s1.equals(str) ) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
		System.out.println("--------------------------------------------------------");
		
		String greet = "안녕";
		greet += "하세요";
		System.out.println( greet );

		 
	}//main
	
}
