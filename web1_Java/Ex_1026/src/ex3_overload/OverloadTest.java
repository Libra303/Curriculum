package ex3_overload;

public class OverloadTest {
	//�����ε� : �޼����� '�ߺ�����'��� �ϸ�, �ϳ��� Ŭ���� ������ ���� �̸��� ���� �޼��尡
	//������ ���ǵǴ� ���� ���Ѵ�.
	//**�����ε��� ��Ģ**
	//1) ������ ������ �ٸ����
	//2) ������ ������ ���Ƶ� ������ �ٸ����
	//3) ������ ������ �ٸ� ���
	
	
	public void getResult() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void getResult( int n ) {
		System.out.println("���ڷ� ������ �޴� �޼���");
	}
	
	public void getResult( char c ) {
		System.out.println("���ڷ� ���ڸ� �޴� �޼���");
	}
	
	public void getResult( String s ) {
		System.out.println("���ڷ� ������ �޴� �޼���");
	}
	
	public void getResult( int n, String s ) {
		System.out.println("���ڷ� ����, ������ �޴� �޼���");
	}
	
	public void getResult( String s, int n ) {
		System.out.println("���ڷ� ����, ������ �޴� �޼���");
	}
	
}
