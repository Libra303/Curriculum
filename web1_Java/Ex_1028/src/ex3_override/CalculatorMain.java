package ex3_override;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Plus plus = new Plus();
		Minus minus = new Minus();
		Multi multi = new Multi();
		
		System.out.println("���ϱ� : " + plus.getResult(5, 2));
		System.out.println("���� : " + minus.getResult(5, 2));
		System.out.println("���ϱ� : " + multi.getResult(5, 2));
				
	}//main
}
