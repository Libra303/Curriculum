package ex2_animal;

public class Snake extends Animal{

	String sensor = "감각";
	
	//오버라이딩 : 메서드를 '제정의'의 의미를 가진다
	@Override
	public int getLeg() {
		return 0;
	}
	
}
