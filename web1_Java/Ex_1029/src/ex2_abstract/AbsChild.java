package ex2_abstract;

public class AbsChild extends AbsParent {
	//�θ��� �߻�Ŭ������ �̿ϼ��� �߻�޼��带 ������ �����Ƿ�
	//�� �̿ϼ��� �޼��带 �ڽ��� ��ӹ޾Ƽ� �ϼ���Ű�� ���� �������� �д�

	@Override
	public void setValue(int n) {
		//�θ��� �̿ϼ� �޼��带 �ڽ��� �޾Ƽ�
		//�ڽ� ������ �µ��� ������ ������ �� �� �ִ�.
		value = n;
	}
	

}
