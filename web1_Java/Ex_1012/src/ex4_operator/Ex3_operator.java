package ex4_operator;

public class Ex3_operator {
	
	public static void main(String[] args) {
		
		//삼항(조건)연산자
		//하나의 조건을 정의하고 그 조건의 결과에 따라 
		//서로 다른 값을 출력(대입)할 수 있도록 해 주는 연산자
		
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b ? true : false;
		System.out.println(res);
		
		int res2 = (a += 4) >= b ?  100 : 200 ;
 		System.out.println(res2);
 		
 		System.out.println("------------------------------------------------");
 		
 	
 		//논리연산자
 		//비교연산자가 2개 이상 있을 때 사이를 연결해주는 연산자
 		int age = 30;
 		int limit = 35;
 		
 		
 		//&&(and)연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다
 		//참 && 참 => 참
 		//참 && 거짓 => 거짓
 		//거짓 && 참 => 거짓
 		//거짓 && 거짓 => 거짓
 		res = limit - age >= 5 && age > 30;
 		System.out.println( "&&연산 : " + res );
 		
 		res = limit - age >= 5 && (age += 2 ) > limit;
 		System.out.println(res);
 		System.out.println("앞에가 참 : " + age);
 		
 		res = limit - age < 3 && (age += 2 ) > limit;
 		System.out.println(res);
 		System.out.println("앞에가 거짓 : " + age);
 		
 	
 		//||(or)연산자 : 앞의 연산이 참이면 뒤쪽 연산을 수행하지 않는다
 		//거짓 || 거짓 => 거짓
 		//거짓 || 참 => 참
 		//참 || 거짓 => 참
 		//참 || 참 => 참
 		int n1 = 10;
 		int n2 = 20;
 		res = ( n1 += 10 ) > 20 || n2 - 10 == 11;
 		System.out.println("||연산 : " + res);
 		
 	
 		//!(not) 연산자 : 변수앞에 붙여서 참과 거짓을 바꾸는 연산자
 		boolean test = false;
 		System.out.println( !test );
 		System.out.println( test );
 		
 		test = !test;
 		System.out.println( test );
 		
 		System.out.println("---------------------------------------------");
 		
 		a = 10;
 		b = 12;
 		char ch = ++a >= b || 2 + (b - 5) <= b && 13 - b >= 0 && ( a += b ) - ( b % a ) > 10 ? 'O' : 'X' ;
 		System.out.println(ch);
 		
	}//main

}
