package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setAge(20);
		p1.setGender("����");
		
		System.out.println("�̸� : " + p1.getName());
		System.out.println("���� : " + p1.getAge());
		System.out.println("���� : " + p1.getGender());
		
		System.out.println("------------------------------");
		
		Person p2 = new Person();
		p2.setProp("������", 30, "��");
		
		System.out.println( p2.getName() );
		
	}//main
}
