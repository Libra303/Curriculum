package ex_work;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex_Work {
	public static void main(String[] args) {
		
		Frame frame = new Frame("�ܺ�������");
		frame.setBounds(500, 400, 500, 400);
		
		
		
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				Frame innerFrame = new Frame("����������");
				innerFrame.setLayout(null);
				innerFrame.setBounds(550, 450, 400, 300);
				innerFrame.setVisible(true);
				
				Font font = new Font("���ü",Font.PLAIN,20);
				Label lb = new Label("������ �����Ͻðڽ��ϱ�?");
				lb.setFont(font);
				lb.setBounds(10, 10, 400, 100);
				
				//Ȯ�ΰ� ��ҹ�ư
				Button btnYes = new Button("��");
				btnYes.setBounds(50, 120, 135, 100);

				Button btnNo = new Button("�ƴϿ�");
				btnNo.setBounds(215, 120, 135, 100);
				
				//��ư�鿡�� �������߰�
				btnYes.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				
				btnNo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						innerFrame.dispose();
					}
				});
				
				innerFrame.add(lb);
				innerFrame.add(btnYes);
				innerFrame.add(btnNo);
				
			}
		});
	
	}//main
}
