package ex5_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("값 : ");
			String str = sc.next();
			
//			for(int i = 0; i < arr.size(); i++) {
//				if( arr.get(i).equals(str) ) {
//					System.out.println("중복된 값");
//				}
//			}

			if( arr.contains(str) ) {
				System.out.println("중복된 값");
			}else {
				arr.add(str);
				System.out.println(arr);
			}
		}
		
	}//main

}
