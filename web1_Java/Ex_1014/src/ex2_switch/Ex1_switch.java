package ex2_switch;

public class Ex1_switch {
	
	public static void main(String[] args) {
		
		//switch-case�� :
		//���ǰ��� �񱳰��� ���� ����� ����ϴ� ���
		
		/*switch( �񱳰� ){
			case ���ǰ�:
				�񱳰��� ���ǰ��� ��ġ�ϸ� ����Ǵ� ����
				break;
		*/
		
		int n = 3;
		
		switch( n ) {//�񱳰�
		
		case 1: //���ǰ�
			System.out.println("1.���ӽ���");
			break;//switch���� ��°�� ��������
			
		case 2:
			System.out.println("2.���Ӽ���");
			break;
			
		case 3:
			System.out.println("3.��������");
			break;
		}//switch
		
	}//main
	
}
