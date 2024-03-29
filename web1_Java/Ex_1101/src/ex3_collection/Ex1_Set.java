package ex3_collection;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		//컬랙션 : 다수의 데이터를 쉽고 효과적으로 처리할 수 있는
		//클래스들의 집합.
		//배열처럼 사용하지만 index의 제한 없이 원하는 값을 추가하거나 삭제가 가능한 클래스들
		
		//컬랙션 인터페이스 종류
		//Set, Map, List

		//Set : 특정 코드에서 중복된 값의 허용이 있어서는 안될 때 사용
		//HashSet : 정렬기능 X
		//TreeSet : 오름차순 정렬
		
		//<> : 제너릭타입 -> 컬랙션 객체가 앞으로 저장해서 사용하고자 할 타임을 미리 지정
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(10);
		hs.add(100);
		hs.add(100);
		hs.add(20);
		hs.remove(20);
		System.out.println( hs.size() );//hs의 방 갯수
		System.out.println( hs );
		hs.removeAll(hs);//h2에 담긴 모든 값을 삭제
		
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
