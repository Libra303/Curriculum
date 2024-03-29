package ex2_button_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex2_buttonEvent {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);//프레임의 자동배치를 끈다
		f.setBounds(1000, 400, 800,500);
		
		Button btn1 = new Button("버튼1");
		//프레임에 자동배치가 꺼져있는 상태라면 프레임에 추가될 자식 클래스들은
		//개별적인 위치값과(location) 크기값 (size)를 가지고 있어야한다.
		btn1.setBounds(50, 100, 200, 300);
		
		Button btn2 = new Button("버튼2");
		btn2.setBounds(300, 100, 200, 300);

		Button btn3 = new Button("버튼3");
		btn3.setBounds(550, 100, 200, 300);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		//버튼들에게 이벤트 감지자 추가
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ActionEvent e : 클릭을 발생한 버튼의 정보를 파악하는 객체 e
				String s = e.getActionCommand();//클릭한 버튼에 쓰여진 텍스트
				
				System.out.println(s + " 클릭함");
//				switch(s) {
//				case"버튼1":
//					System.out.println("안녕하세요");
//					break;
//					
//				case"버튼2":
//					System.out.println("반갑습니다");
//					break;
//					
//				case"버튼3":
//					System.out.println("또만나요");
//					break;
//				}//switch
			}
		};
		
		btn1.addActionListener(al);
		btn2.addActionListener(al);
		btn3.addActionListener(al);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main

}
