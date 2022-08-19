package ex4_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String res = "일요일";
	
	public static void main(String[] args) {
		
		Frame f = new Frame("choice 선택상자");
		f.setLayout(null);//자동배치 끄기
		f.setBounds(1000, 300, 300, 100);
		
		//Choice 객체 생성
		Choice day = new Choice();
		//Choice 객체의 높이는 안에 있는 요소의 사이즈로 결정되므로
		//0으로 해도 된다.
		day.setBounds(50, 50, 150, 0);
		
		day.add("일요일");
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		
		//choice에 이벤트 감지자 등록
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				res = day.getSelectedItem();
				System.out.println(res);
			}
		});
		
		f.add(day); //프레임에 초이스 객체 추가
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
