package ex3_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("�غ�", 100, false);
		t1.decEnergy();
		t1.decEnergy();
		System.out.println(t1.energy);
		
		Protoss p1 = new Protoss("��Ʋ", 150, true);
		p1.decEnergy();
		System.out.println(p1.energy);
		
		Zerg z1 = new Zerg("���۸�", 200, false);
		z1.decEnergy();
		System.out.println(z1.energy);
		
	}//main
}
