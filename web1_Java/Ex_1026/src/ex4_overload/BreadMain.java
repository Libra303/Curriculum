package ex4_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		//1) ���� ��������ϴ�
		//-------------------
		//2) ���� ��������ϴ�
		//	 ���� ��������ϴ�
		//   ��û�Ͻ� 2���� ���� ��������ϴ�
		//-------------------
		//3) �ϻ��� ��������ϴ�
		//	 �ϻ��� ��������ϴ�
		//   ��û�Ͻ� 2���� �ϻ��� ��������ϴ�

		Bread bread = new Bread();
		
		bread.makeBread();//ȣ��1
		
		System.out.println("-------------------------------");

		bread.makeBread(2);//ȣ��2
		
		System.out.println("-------------------------------");

		bread.makeBread("���ڻ�", 5);//ȣ��3
		
		
	}

}
