package ex1_if;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if-else문 : 참과 거짓에 대한 결과값을 모두 처리할 수 있는 if문
		
		/*if( 조건식 ){
			조건식이 참일때 실행되는 영역
		  }else{
		  	조건식이 거짓일때 실행되는 영역
		  }
		*/
		
		int n = 45;
		String str = "";
		
		if( ++n >= 50 ){
			str = "n은 50이상의 수";
		}else {
			//조건이 거짓이면 반드시 실행되는 영역
			str = "n은 50미만의 수";
		}
		
		System.out.println(str);
		
		System.out.println("-------------------------------------");
		
		//age라는 변수를 만들고 나이를 대입한다
		//대입한 나이가 30세 이상이면 '드실만큼 드셨군요'를, 그렇지 않으면
		//'조금 더 드셔도 될 듯'을 출력하는 if문을 구현
		
		int age = 30;
		
		if( age >= 30) {
			System.out.println("드실만큼 드셨군요");
		}else {
			System.out.println("조금 더 드셔도 될 듯");
		}
		
		//위의 코드를 삼항연산자로 변경해보시오
		
		String str2 = age >= 30 ? "드실만큼 드셨군요": "조금 더 드셔도 될 듯";
		System.out.println(str2);
		
		
	}//main

}
