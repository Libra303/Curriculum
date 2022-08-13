package ex2_abstract;

public class AbsMian {
	public static void main(String[] args) {
		
		AbsChild ch = new AbsChild();
		ch.setValue(0);
		
		//추상클래스는 인스턴스를 직접 가질 수 없다.(단독으로 객체화가 불가능)
		AbsParent p = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}//main
}
