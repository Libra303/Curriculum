package ex4_interface;

public class InterMain {
	public static void main(String[] args) {
		
		InterChild ch = new InterChild();
		ch.getTest();
		
		
		//�������̽��� �߻�� ����������
		//�������� �����ɷ��� ������ ���� �ʱ� ������ ��üȭ �Ұ���
		InterTest1 it = new InterTest1() {
			
			@Override
			public int getTest() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
		
	}//main
}
