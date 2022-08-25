package ex2_button_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_buttonEvent {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);//�������� �ڵ���ġ�� ����
		f.setBounds(1000, 400, 800,500);
		
		Button btn1 = new Button("��ư1");
		//�����ӿ� �ڵ���ġ�� �����ִ� ���¶�� �����ӿ� �߰��� �ڽ� Ŭ��������
		//�������� ��ġ����(location) ũ�Ⱚ (size)�� ������ �־���Ѵ�.
		btn1.setBounds(50, 100, 200, 300);
		
		Button btn2 = new Button("��ư2");
		btn2.setBounds(300, 100, 200, 300);

		Button btn3 = new Button("��ư3");
		btn3.setBounds(550, 100, 200, 300);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		
		//��ư�鿡�� �̺�Ʈ ������ �߰�
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 1���� Ŭ����!!");
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 2���� Ŭ����!!");
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư 3���� Ŭ����!!");
			}
		});
		
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main

}