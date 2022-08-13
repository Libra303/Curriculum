package ex3_override;

public class CalculatorMain {
	
	public static void main(String[] args) {
		Plus plus = new Plus();
		Minus minus = new Minus();
		Multi multi = new Multi();
		
		System.out.println("´õÇÏ±â : " + plus.getResult(5, 2));
		System.out.println("»©±â : " + minus.getResult(5, 2));
		System.out.println("°öÇÏ±â : " + multi.getResult(5, 2));
				
	}//main
}
