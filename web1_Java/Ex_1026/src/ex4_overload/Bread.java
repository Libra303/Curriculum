package ex4_overload;

public class Bread {
	
	public void makeBread(){
		System.out.println("���� ��������ϴ�");
	}

	public void makeBread( int n ){
		for(int i = 0 ; i < n ; i++) {
			System.out.println("���� ��������ϴ�");
		}
		System.out.println("��û�Ͻ� "+ n +"���� ���� ��������ϴ�.");
	}
	
	public void makeBread( String bread, int n){
		for(int i = 0 ; i < n ; i++) {
			System.out.println(bread+"�� ��������ϴ�");
		}
		System.out.println("��û�Ͻ� "+ n +"���� "+bread+"�� ��������ϴ�.");
	}

}
