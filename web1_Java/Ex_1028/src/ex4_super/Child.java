package ex4_super;

public class Child extends Parent {
	
	//super ���1
	public void setEye(int eye) {
		//this.eye = eye; ���Ұ�
		super.eye = eye;
	}
	
	//super ���2
	public Child() {
		//super : �θ�Ŭ����
		super(2);
		System.out.println("Child ������");
	}
	
	//super ���3
	@Override
	public String test() {
		//Parent.test();
		//�θ� Ŭ������ test()�޼���� ȣ������
		return super.test();
	}

}
