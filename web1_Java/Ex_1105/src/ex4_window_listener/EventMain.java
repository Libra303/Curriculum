package ex4_window_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f= new Frame("�̺�Ʈ2");
		f.setBounds(1000, 400, 400, 300);
		
		//f�� �̺�Ʈ ������ �߰�
		f.addWindowListener(new XClickListener());
		
		f.setVisible(true);
		
	}//main

}
