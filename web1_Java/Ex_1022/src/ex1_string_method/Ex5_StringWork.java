package ex1_string_method;

import java.util.Scanner;

public class Ex5_StringWork {
	public static void main(String[] args) {
		
		//Ű���忡�� ���� ���� ȸ�������� �Ǵ��ϱ�
		
		//�Է� : a123a
		//a123a ��(��) ȸ������ �ƴմϴ�
		
		//�Է� : ab1c1ba
		//ab1c1ba ��(��) ȸ���� �Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String str = sc.next();
		
		String reStr = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reStr += str.charAt(i);
		}
		
		if( str.equals(reStr)) {
			System.out.println(str+" ��(��) ȸ�����Դϴ�");
		}else {
			System.out.println(str+" ��(��) ȸ������ �ƴմϴ�");
		}

	}//main
}
