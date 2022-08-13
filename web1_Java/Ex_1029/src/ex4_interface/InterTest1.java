package ex4_interface;

public interface InterTest1 {
	//추상클래스와 유사하지만, 서비스의 요청에 따른 중개자 역할을 하는 클래스
	//인터페이스에는 '상수'와 '추상메서드'이외에는 아무것도 정의할 수 없다.
	
	final int VALUE = 100; //상수는 변수명을 전부 대문자로 작성하는 것이 관례
	abstract int getTest();
	//final, abstract는 생략가능하다.
	
	
	
}
