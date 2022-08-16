package ex6_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		
		ArrayList<Person> arr = new ArrayList<Person>();
		Scanner sc = new Scanner(System.in);
		//Person p = new Person(id, pwd); : �̷��� ����
		
		outer : while( true ) {
			System.out.print("id : ");
			String id = sc.next();
			
			//id �ߺ� üũ
			for( Person i : arr ) {
				if( i.getId().equals(id) ) {
					System.out.println("�ߺ��� id");
					System.out.println("---------------------------------");
					continue outer;
				}
			}
			
			System.out.print("pwd : ");
			int pwd = sc.nextInt();
			
			Person p = new Person(id, pwd);
			arr.add(p);
			
			for(Person i : arr) {
				System.out.printf("%s / %d \n", i.getId(), i.getPwd());
			}
			System.out.println("---------------------------------");
		}
		
	}//main

}
