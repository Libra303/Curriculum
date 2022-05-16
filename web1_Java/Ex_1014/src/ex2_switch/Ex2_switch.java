package ex2_switch;

public class Ex2_switch {
	
	public static void main(String[] args) {
		
		String str = "N";
		
		switch( str ) {//비교값
		
		case "A"://조건값
			System.out.println("90 ~ 100");
			break;
			
		case "B":
			System.out.println("80 ~ 89");
			break;
			
		case "C":
			System.out.println("70 ~ 79");
			break;
			
		case "D":
			System.out.println("60 ~ 69");
			break;
			
		case "F":
			System.out.println("59점 이하");
			break;
			
		default:
			//비교값과 조건값이 1도 일치하지 않는다면 실행되는 영역
			System.out.println("올바른 성적을 입력하세요");
			break;
			
		}//switch
		
	}//main

}
