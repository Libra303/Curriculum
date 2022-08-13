package ex5_interface;

public class Kitchen implements Menu3 {
//Menu1, Menu2 ,Menu3인데 Menu3에 다중상속함
//인터페이스는 다중 구현이 가능
	
	//Menu1
	@Override
	public String jjajang() {
		return "중면 + 춘장소스";
	}
	@Override
	public String jjambbong() {
		return "홍합 + 오징어";
	}
	
	
	//Menu2
	@Override
	public String tangsuyuck() {
		return "돼지고기 + 탕수육 소스";
	}
	
	
	//Menu3
	@Override
	public String boggembab() {
		return "이천쌀 + 각종야채";
	}

}
