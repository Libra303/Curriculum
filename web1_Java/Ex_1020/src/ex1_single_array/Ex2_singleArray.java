package ex1_single_array;

public class Ex2_singleArray {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//�迭�� ����,����,�ʱ�ȭ�� �ѹ���
		char[] ch2 = {'J','A','V','A'};
		
		//�迭 ch�� ������ �ִ� ��� ���� ����غ��ÿ�
		//JAVA
		
		for(int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		
		System.out.println("\n--------------------------------");
		
		for(char i : ch2) {
			System.out.print(i);
		}
		
		String[] sArr = new String[3];
		sArr[0] = "A";
		System.out.println(sArr[1]);
		
		
	}//main
}
