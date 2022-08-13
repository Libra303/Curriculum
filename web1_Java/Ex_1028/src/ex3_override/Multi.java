package ex3_override;

public class Multi extends Calculator{
	
	@Override
	public int getResult(int a, int b) {
		return a * b ;
	}

}
