package ex4_static;

public class StaticTest {
	
	String str1 = "�ɹ�����";
	static String str2 = "static ����";
	
	public void test() {
		str1 = "�� ���� ����";
		
		//�Ϲ����� �޼��忡���� static������ ������ ������ ����� �� �ִ�.
		str2 = "���� ���� ������";
	}
	
	public static void test2() {
		
		//static �޼��忡���� �Ϲ� ��������� �����ؼ� �� �� ����.
		//str1 = "���� ��¼��?";
		str2 = "���� ���� �ɱ�?";
		
	}
	
}
