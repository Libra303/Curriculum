package ex4_overload;

public class BreadMain {
	public static void main(String[] args) {
		
		//1) 방을 만들었습니다
		//-------------------
		//2) 빵을 만들었습니다
		//	 빵을 만들었습니다
		//   요청하신 2개의 빵을 만들었습니다
		//-------------------
		//3) 팥빵을 만들었습니다
		//	 팥빵을 만들었습니다
		//   요청하신 2개의 팥빵을 만들었습니다

		Bread bread = new Bread();
		
		bread.makeBread();//호출1
		
		System.out.println("-------------------------------");

		bread.makeBread(2);//호출2
		
		System.out.println("-------------------------------");

		bread.makeBread("피자빵", 5);//호출3
		
		
	}

}
