package ex1_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		
		Child c1 = new Child();
		//��Ӱ����� ��ü���� �ڽ�Ŭ������ �θ� ���� �Ӽ��̳� �޼��带
		//������� �����ٰ� ����� �� �ִ�
		System.out.println( c1.car );
		System.out.println( c1.money );
		System.out.println( c1.str );
		
		Parent p1 = new Parent();
		//�θ�Ŭ������ �ڽ��� �Ӽ��� ������ �� ����.
		System.out.println( p1.money );
		System.out.println( p1.str );
		
		//ChildŬ������ Parent�� ��ӹ޾����Ƿ�
		//Child�� ������ �� Parent�� ������ �Բ� �����ȴ�.
		if( c1 instanceof Parent ) {
			System.out.println( "c1�� Parent�� �ڽ�");
		}
		
	}//main
}
