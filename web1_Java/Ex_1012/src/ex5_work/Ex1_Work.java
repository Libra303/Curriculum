package ex5_work;

public class Ex1_Work {
	
	/*
	 과수원이 있다.
	 배, 사과, 오렌지를 키우고 있는데 하루에 생산되는 과일의 양은
	 각각 5개, 7개, 5개다.
	 
	 1)과수원에서 하루에 생산되는 과일의 총 갯수를 출력.
	 2)시간당 전체 과일의 평균 생산 갯수를 출력
	 
	 단, 과일의 갯수를 저장할 변수는 정수타입으로,
	 하루생산량을 저장할 변수는 정수타입으로,
	 시간당 평균 생산 갯수를 저장할 변수는 float자료형으로 만드시오
	 
	 결과-----
	 하루생산량 : 17
	 시간당 평균 : 0.708.....
	 */
	public static void main(String[] args) {
		int day_pear = 5;
		int day_apple = 7;
		int day_orange = 5;
		
		int day_all = day_pear + day_apple + day_orange;
		System.out.println("하루 생산량 : " + day_all);
		
		float hour_avg = day_all / 24f; //또는 (float)day_all / 24;
		System.out.println("시간당평균 : " + hour_avg);
		
	}//main 

}
