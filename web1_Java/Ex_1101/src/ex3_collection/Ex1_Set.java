package ex3_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//�÷��� : �ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ�
		//Ŭ�������� ����.
		//�迭ó�� ��������� index�� ���� ���� ���ϴ� ���� �߰��ϰų� ������ ������ Ŭ������
		
		//�÷��� �������̽� ����
		//Set, Map, List

		//Set : Ư�� �ڵ忡�� �ߺ��� ���� ����� �־�� �ȵ� �� ���
		//HashSet : ���ı�� X
		//TreeSet : �������� ����
		
		//<> : ���ʸ�Ÿ�� -> �÷��� ��ü�� ������ �����ؼ� ����ϰ��� �� Ÿ���� �̸� ����
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(100);
		hs.add(100);
		hs.add(20);
		hs.remove(20);
		System.out.println( hs.size() );//hs�� �� ����
		System.out.println( hs );
		hs.removeAll(hs);//h2�� ��� ��� ���� ����
		
		System.out.println("-------------------------");
		
		while(true) {
			int r = new Random().nextInt(45)+1;
			
			hs.add(r);
			
			if(hs.size() == 6) {
				break;
			}
		}
		
		System.out.println( hs );
		
		System.out.println("-------------------------");

		TreeSet<Integer> ts = new TreeSet<Integer>();
		while( true ) {
			int r = new Random().nextInt(45)+1;
			ts.add(r);
			
			if(ts.size() == 6) {
				break;
			}
		}
		
		System.out.println( ts );
		
	}//main
}
