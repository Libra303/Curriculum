package ex1_single_array;

public class Ex2_singleArray {
	public static void main(String[] args) {
		
		char[] ch = new char[4];
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		//ch[4] = '!';
		
		//배열의 선언,생성,초기화를 한번에
		char[] ch2 = {'J','A','V','A'};
		
		//배열 ch가 가지고 있는 모든 값을 출력해보시오
		//JAVA
		
		for(int i = 0; i < ch2.length; i++) {
			System.out.print(ch2[i]);
		}
		
		System.out.println("\n--------------------------------");
		
		for(char i : ch2) {
			System.out.print(i);
		}
		
		String[] sArr = new String[3];
		sArr[0] = "A";
		System.out.println(sArr[1]);
		
		
	}//main
}
