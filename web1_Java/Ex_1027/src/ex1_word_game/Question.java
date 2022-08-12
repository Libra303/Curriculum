package ex1_word_game;

import java.util.Random;

public class Question {
	
	private String[] strArr = {"HOPE", "APPLE", "DOCTOR"};
	private String shake = ""; //������ ���ڿ�
	
	//���� ��ȯ �޼���
	public String getAnswer() {
		int idx = new Random().nextInt(strArr.length);
		return strArr[idx];
	}//getAnser()
	
	
	
	//������ ����� �޼���
	public String getQuestion(String s) {
		
		//���� �ܾ ������ �ʵ��� �����ϱ� ���� �迭
		int[] inArr = new int[s.length()];
		
		//������� inArr�迭�� �� �濡 ��ġ�� �ʴ� ������ �߻����� �ִ´�
		outer : for( int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt(s.length());
			
			//�ߺ��� ��
			for(int j = 0; j < i; j++) {
				
				if( inArr[i] == inArr[j] ) {
					continue outer;
				}
				
			}//inner
			
			i++;
		}//outer
		
		for( int i = 0; i < inArr.length; i++ ) {
			shake += s.charAt(inArr[i]);
		}
		
		return shake;
	}//getQuestion()
	           
}
