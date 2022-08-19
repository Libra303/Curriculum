package ex5_window_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("����� Ȱ��");
		f.setBounds(1000, 400, 400, 300);
		
		WindowAdapter wa = new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		};
		
		f.addWindowListener(wa);
		
//		f.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.out.println("����");
//				System.exit(0);
//			}
//		});
		
		f.setVisible(true);
		
	}//main
}
