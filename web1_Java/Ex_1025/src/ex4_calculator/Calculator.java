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
		default: System.out.println("오류) 잘 못 된 입력"); return;
		}//switch
		
		System.out.println("결과 : " + res);
	}
	
}