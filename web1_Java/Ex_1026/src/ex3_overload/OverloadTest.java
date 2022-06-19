package ex3_overload;

public class OverloadTest {
	//오버로딩 : 메서드의 '중복정의'라고 하며, 하나의 클래스 내에서 같은 이름을 가진 메서드가
	//여러개 정의되는 것을 말한다.
	//**오버로딩의 규칙**
	//1) 인자의 갯수가 다른경우
	//2) 인자의 갯수가 같아도 차입이 다른경우
	//3) 인자의 순서가 다른 경우
	
	
	public void getResult() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void getResult( int n ) {
		System.out.println("인자로 정수를 받는 메서드");
	}
	
	public void getResult( char c ) {
		System.out.println("인자로 문자를 받는 메서드");
	}
	
	public void getResult( String s ) {
		System.out.println("인자로 문장을 받는 메서드");
	}
	
	public void getResult( int n, String s ) {
		System.out.println("인자로 정수, 문장을 받는 메서드");
	}
	
	public void getResult( String s, int n ) {
		System.out.println("인자로 뮨장, 정수를 받는 메서드");
	}
	
}
