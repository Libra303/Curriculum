package ex5_collection;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		//ArrayList : �迭ó�� index�� ������ ������ ������ �����ν�
		//�� ������ ������ �����Ƿ� ���� �߰��ϰų� �����ϴµ� �ſ� ����
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(20);
		list.add(100);
		list.add(150);
		list.add(1, 70);
		list.set(2, 30);
		list.remove(3);
		
		System.out.println( list );

//		for( int i : list ) {
//			System.out.println(i);
//		}
		
		for( int i = 0; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
	}//main

}
