package ex2_switch;

public class Ex5_switch {
	
	public static void main(String[] args) {
		
		//10 + 20 = 30
		
		int su1 = 20;
		int su2 = 10;
		char op = '%';
		
		switch ( op ) {
		
		case '+':
			System.out.printf("%d %c %d = %d", su1,op,su2,su1+su2);
			break;
			
		case '-':
			System.out.printf("%d %c %d = %d", su1,op,su2,su1-su2);
			break;
			
		case '*':
			System.out.printf("%d %c %d = %d", su1,op,su2,su1*su2);
			break;
			
		case '/':
			System.out.printf("%d %c %d = %d", su1,op,su2,su1/su2);
			break;
			
		case '%':
			System.out.printf("%d %c %d = %d", su1,op,su2,su1%su2);
			break;
	
		default:
			System.out.println("잘 못 된 연산자");
		}
		
	}//main

}
