package ex4_calculator;

public class Calculator {
	
	public void getResult(int su1, int su2, String op) {
		int res = 0;
		
		switch (op) {
		case "+": res = su1 + su2; break;
		case "-": res = su1 - su2; break;
		case "*": res = su1 * su2; break;
		case "/": res = su1 / su2; break;
		case "%": res = su1 % su2; break;	
		default: System.out.println("����) �� �� �� �Է�"); return;
		}//switch
		
		System.out.println("��� : " + res);
	}
	
}