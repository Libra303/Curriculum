package ex4_interface;

public class InterMain {
	public static void main(String[] args) {
		
		InterChild ch = new InterChild();
		ch.getTest();
		
		
		//인터페이스도 추상과 마찬가지로
		//직접적인 구현능력을 가지고 있지 않기 때문에 객체화 불가능
		InterTest1 it = new InterTest1() {
			
			@Override
			public int getTest() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
	}//main
}
