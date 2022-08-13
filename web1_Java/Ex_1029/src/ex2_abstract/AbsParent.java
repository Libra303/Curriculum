package ex2_abstract;

//추상 : 미완성의 개념(abstract 키워드를 사용한다)
public abstract class AbsParent {
	
	//추상메서드를 한개 이상 가지고 있는 클래스는
	//abstract를 통해 반드시 추상클래스화 되어 있어야 동작한다.

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//추상 메서드는 body가 없다. abstract키워드를 사용한다
	abstract public void setValue(int n);
	
}
