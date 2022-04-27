package ex4_operator;

public class Ex2_operator {
	
	public static void main(String[] args) {
		
		//비교연산자
		//변수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//비교연산자를 통한 연산의 결과는 반드시 boolean형태
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("< : " + res);
		
		res = n1 >= n2;
		System.out.println(">= : " + res);
		
		res = n1 == n2;
		System.out.println("== : " + res);
		
		res = n1 != n2;
		System.out.println("!= : " + res);
		
		
		System.out.println("---------------------------------------------");
		
		
		//증감연산자
		//1씩 증가시키거나 1씩 감소시키는 연산자
		//선행증감과 후행증감의 차이점을 알아두자!!
		int a = 10;
		System.out.println("a : " + ++a);
		
		int b = 10;
		System.out.println("b : " + b++);
		System.out.println(b);
		
		++b;
		++b;
		b--;
		--b;
		b++;
		b--;
		--b;
		++b;
		System.out.println(b++);//11
		
	}//main

}
