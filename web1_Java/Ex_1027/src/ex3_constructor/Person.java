package ex3_constructor;

public class Person {
	
	private String name;
	private int age;
	
	//�����ڰ� �����ε��Ǿ� ���� ��,
	//�⺻�����ڸ� �������� ������ �⺻�����ڴ� �ڵ����� ȣ����� �ʴ´�.
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void myFreind() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("--------------------");
	}
	
}
