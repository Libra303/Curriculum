package ex2_switch;

public class Ex4_switch {
	
	public static void main(String[] args) {
		
		 //6���� 30�ϱ��� �ֽ��ϴ�
		 //2���� 28�� ���� �ֽ��ϴ�
		
		int month = 5;
		
		switch( month ) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month+"���� 31�ϱ��� �ֽ��ϴ�");
			break;
			
		case 4, 6, 9, 11:
			System.out.println(month+"���� 30�ϱ��� �ֽ��ϴ�");
			break;
			
		case 2:
			System.out.println("2���� 28�ϱ��� �ֽ��ϴ�");
			break;
			
		default:
			System.out.println(month+"���� �������� �ʽ��ϴ�");
			break;
			
		}//switch
		
	}//main

}
