package ex1_if;

public class Ex3_else_if {
	
	public static void main(String[] args) {
		
		//else if�� : �������� ������ ���ϰ��� �� �� ���
		
		/*if( ���ǽ�1 ){
			���ǽ�1�� ���϶� ����Ǵ� ����
		  }else if( ���ǽ�2 ){
		  	���ǽ�2�� ���϶� ����Ǵ� ����
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
			//���� ��� ������ �����϶� �ݵ�� ȣ��Ǵ� ����
			str = "F";
		}
		
		System.out.println(str);
		
		
	}//main

}
