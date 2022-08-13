package ex4_super;

public class Child extends Parent {
	
	//super 사례1
	public void setEye(int eye) {
		//this.eye = eye; 사용불가
		super.eye = eye;
	}
	
	//super 사례2
	public Child() {
		//super : 부모클래스
		super(2);
		System.out.println("Child 생성자");
	}
	
	//super 사례3
	@Override
	public String test() {
		//Parent.test();
		//부모 클래스의 test()메서드룰 호출하자
		return super.test();
	}

}
