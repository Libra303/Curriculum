package ex2_abstract;

public class AbsMian {
	public static void main(String[] args) {
		
		AbsChild ch = new AbsChild();
		ch.setValue(0);
		
		//�߻�Ŭ������ �ν��Ͻ��� ���� ���� �� ����.(�ܵ����� ��üȭ�� �Ұ���)
		AbsParent p = new AbsParent() {
			
			@Override
			public void setValue(int n) {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}//main
}
