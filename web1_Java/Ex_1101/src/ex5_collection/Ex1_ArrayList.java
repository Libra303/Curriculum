package ex5_collection;

import java.util.ArrayList;

public class Ex1_ArrayList {
	public static void main(String[] args) {
		
		//ArrayList : 배열처럼 index를 가지고 접근이 가능한 구조로써
		//방 갯수에 제한이 없으므로 값을 추가하거나 삭제하는데 매우 용이
		
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
