package ex2_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(1000, 200, 400, 600);
		f.setLayout(null);
		
		//이미지 가져오기
		ImageIcon img = new ImageIcon("img2.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 200, 400);
		
		//-----------------------------
		
		//버튼으로 사용할 이미지 가져오기
		ImageIcon img2 = new ImageIcon("img1.png");
		JButton btn = new JButton();
		btn.setIcon(img2);
		btn.setBounds(20,200,150,150);
		
		f.add(btn);
		f.add(jl);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
}
