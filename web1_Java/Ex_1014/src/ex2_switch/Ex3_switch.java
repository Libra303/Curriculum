package ex2_switch;

public class Ex3_switch {
	
	public static void main(String[] args) {
		
		//switch���� ���ǰ����� ����� �� �ִ� �ڷ��� Ÿ��
		//1) long�� ������ ����Ÿ��
		//2) char
		//3) String
		
		char gender = '��';
		
		switch( gender ) {
		
		case '��':
			System.out.println("���� ����");
			//break;
			
		case '��':
			System.out.println("���� ����");
			break;
			
		default:
			System.out.println("������ �ùٸ��� �Է��ϼ���");
			break;

		}//switch
		
	}//main

}
