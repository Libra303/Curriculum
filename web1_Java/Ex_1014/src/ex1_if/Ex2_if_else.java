package ex1_if;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if-else�� : ���� ������ ���� ������� ��� ó���� �� �ִ� if��
		
		/*if( ���ǽ� ){
			���ǽ��� ���϶� ����Ǵ� ����
		  }else{
		  	���ǽ��� �����϶� ����Ǵ� ����
		  }
		*/
		
		int n = 45;
		String str = "";
		
		if( ++n >= 50 ){
			str = "n�� 50�̻��� ��";
		}else {
			//������ �����̸� �ݵ�� ����Ǵ� ����
			str = "n�� 50�̸��� ��";
		}
		
		System.out.println(str);
		
		System.out.println("-------------------------------------");
		
		//age��� ������ ����� ���̸� �����Ѵ�
		//������ ���̰� 30�� �̻��̸� '��Ǹ�ŭ ��̱���'��, �׷��� ������
		//'���� �� ��ŵ� �� ��'�� ����ϴ� if���� ����
		
		int age = 30;
		
		if( age >= 30) {
			System.out.println("��Ǹ�ŭ ��̱���");
		}else {
			System.out.println("���� �� ��ŵ� �� ��");
		}
		
		//���� �ڵ带 ���׿����ڷ� �����غ��ÿ�
		
		String str2 = age >= 30 ? "��Ǹ�ŭ ��̱���": "���� �� ��ŵ� �� ��";
		System.out.println(str2);
		
		
	}//main

}
