package ex1_if;

public class Ex3_else_if {
	
	public static void main(String[] args) {
		
		//else if문 : 여러개의 조건을 비교하고자 할 때 사용
		
		/*if( 조건식1 ){
			조건식1이 참일때 실행되는 영역
		  }else if( 조건식2 ){
		  	조건식2가 참일때 실행되는 영역
		  }......
		*/
		
		int kor = 34;
		String str = "";
		
		if( kor >= 90 ) {
			str = "A";
		}else if( kor >= 80 ) {
			str = "B";
		}else if( kor >= 70 ) {
			str = "C";
		}else if( kor >= 60 ) {
			str = "D";
		}else{
			//위의 모든 조건이 거짓일때 반드시 호출되는 영역
			str = "F";
		}
		
		System.out.println(str);
		
		
	}//main

}
