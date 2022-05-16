package ex2_switch;

public class Ex4_switch {
	
	public static void main(String[] args) {
		
		 //6월은 30일까지 있습니다
		 //2월은 28일 까지 있습니다
		
		int month = 5;
		
		switch( month ) {
		
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month+"월은 31일까지 있습니다");
			break;
			
		case 4, 6, 9, 11:
			System.out.println(month+"월은 30일까지 있습니다");
			break;
			
		case 2:
			System.out.println("2월은 28일까지 있습니다");
			break;
			
		default:
			System.out.println(month+"월은 존재하지 않습니다");
			break;
			
		}//switch
		
	}//main

}
