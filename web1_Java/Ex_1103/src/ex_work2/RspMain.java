package ex_work2;

import java.util.Random;
import java.util.Scanner;

public class RspMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int win = 0;
		int draw = 0;
		int lose = 0;
		
		while( true ) {
			
			//0:����, 1:����, 2:��
			int com = new Random().nextInt(3);
			
			System.out.print("����(s) | ����(r) | ��(p) : ");
			String user = sc.next();
		
			int userCount = 0;
			
			if( user.equals("s") ) {
				userCount = 0;
			}else if( user.equals("r") ) {
				userCount = 1;
			}else if( user.equals("p") ) {
				userCount = 2;
			}
			
			switch(com) {
			case 0:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				break;
			case 1:
				System.out.println("��ǻ�Ͱ� ������ �½��ϴ�.");
				break;
			case 2:
				System.out.println("��ǻ�Ͱ� ���� �½��ϴ�.");
				break;
			}
			
			//����� ��
			if( userCount - com == 1 || userCount - com == - 2 ) {
				System.out.println("�̰���ϴ�");
				win++;
			}else if( userCount - com == 0 ) {
				System.out.println("�����ϴ�");
				draw++;
			}else {
				System.out.println("�����ϴ�");
				lose++;
			}
			
			System.out.printf("%d ��, %d ��, %d ��\n",win,draw,lose);
			
		}//while
		
	}//main

}
