package ex3_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyEvent implements WindowListener {

	@Override
	public void windowOpened(WindowEvent e) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("x버튼을 클릭함");
		System.exit(0);//열려있는 모든 프레임을 종료
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("최소화 버튼 누름");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("원래크기로 돌아옴");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
	}

}
