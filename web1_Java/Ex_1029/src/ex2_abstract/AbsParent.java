package ex2_abstract;

//�߻� : �̿ϼ��� ����(abstract Ű���带 ����Ѵ�)
public abstract class AbsParent {
	
	//�߻�޼��带 �Ѱ� �̻� ������ �ִ� Ŭ������
	//abstract�� ���� �ݵ�� �߻�Ŭ����ȭ �Ǿ� �־�� �����Ѵ�.

	int value = 100;
	
	public int getValue() {
		return value;
	}
	
	//�߻� �޼���� body�� ����. abstractŰ���带 ����Ѵ�
	abstract public void setValue(int n);
	
}
