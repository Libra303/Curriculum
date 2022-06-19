package ex4_overload;

public class Bread {
	
	public void makeBread(){
		System.out.println("빵을 만들었습니다");
	}

	public void makeBread( int n ){
		for(int i = 0 ; i < n ; i++) {
			System.out.println("빵을 만들었습니다");
		}
		System.out.println("요청하신 "+ n +"개의 빵을 만들었습니다.");
	}
	
	public void makeBread( String bread, int n){
		for(int i = 0 ; i < n ; i++) {
			System.out.println(bread+"을 만들었습니다");
		}
		System.out.println("요청하신 "+ n +"개의 "+bread+"을 만들었습니다.");
	}

}
