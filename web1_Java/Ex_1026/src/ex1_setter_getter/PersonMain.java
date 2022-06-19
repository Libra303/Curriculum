package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setGender("여자");
		
		System.out.println("이름 : " + p1.getName());
		System.out.println("나이 : " + p1.getAge());
		System.out.println("성별 : " + p1.getGender());
		
		System.out.println("------------------------------");
		
		Person p2 = new Person();
		p2.setProp("말똥이", 30, "남");
		
		System.out.println( p2.getName() );
		
	}//main
}
