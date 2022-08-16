package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		
		//Try-Catch(����ó��)
		//�ڹٿ��� ���α׷��� ����Ǵ� ���� ����(����)�� �߻��ϸ� 
		//�� �������� ���α׷��� ���������� ����ȴ�
		//�̰��� �ùٸ� �Ǵ�������, ���δ� ���� ������ ������ ���� ��
		//�̸� �����ϰ� ���������� �ڵ带 �Ϸ��ؾ� �� ���� �ִ�
		//����ó���� ���� ���������� ���Ḧ ���� �� �ִ�.
		
		int result = 0;
		int[] arr = new int[2];
		
		try {
			arr[2] = 100;
			result = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			//try �������� ���ܰ� �߻��ϸ� �ݵ�� ȣ��Ǵ� ����
			//printStackTrace(); <= ���� ��� �� ��� ����
			System.out.println("�迭�� �������� �ʴ� index���� ���� ���� ������");
			
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�");
		} finally {
			//���ܹ߻� ���ο� ������� �ݵ�� ȣ��Ǵ� ����
			System.out.println("finally ����");
		}
		
		System.out.println("��� : " + result);
		
		
	}//main

}
