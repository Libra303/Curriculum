package ex3_overload;

public class OverMain {
	public static void main(String[] args) {
		
		OverloadTest ot = new OverloadTest();
		ot.getResult();
		ot.getResult(1);
		ot.getResult('A');
		ot.getResult("ABC");
		ot.getResult(100, "ABC");
		ot.getResult("ABC" , 100);
		
		System.out.println();
		
	}//main

}
