package ex3_window_listener;

import java.awt.Color;
import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("�̺�Ʈ ������");
		f.setBackground( Color.yellow );
		
		//f.setSize(400, 300);
		//f.setLocation(1000, 400);
		f.setBounds(1000, 400, 400, 300);
		
		//f�� �̺�Ʈ ������ ���
		f.addWindowListener(new MyEvent());
		
		f.setVisible(true);
	}//main
}
