package ex5_work;

public class Ex1_Work {
	
	/*
	 �������� �ִ�.
	 ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ������ ����
	 ���� 5��, 7��, 5����.
	 
	 1)���������� �Ϸ翡 ����Ǵ� ������ �� ������ ���.
	 2)�ð��� ��ü ������ ��� ���� ������ ���
	 
	 ��, ������ ������ ������ ������ ����Ÿ������,
	 �Ϸ���귮�� ������ ������ ����Ÿ������,
	 �ð��� ��� ���� ������ ������ ������ float�ڷ������� ����ÿ�
	 
	 ���-----
	 �Ϸ���귮 : 17
	 �ð��� ��� : 0.708.....
	 */
	public static void main(String[] args) {
		int day_pear = 5;
		int day_apple = 7;
		int day_orange = 5;
		
		int day_all = day_pear + day_apple + day_orange;
		System.out.println("�Ϸ� ���귮 : " + day_all);
		
		float hour_avg = day_all / 24f; //�Ǵ� (float)day_all / 24;
		System.out.println("�ð������ : " + hour_avg);
		
	}//main 

}
