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
		ActionListener al = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//ActionEvent e : Ŭ���� �߻��� ��ư�� ������ �ľ��ϴ� ��ü e
				String s = e.getActionCommand();//Ŭ���� ��ư�� ������ �ؽ�Ʈ
				
				System.out.println(s + " Ŭ����");
//				switch(s) {
//				case"��ư1":
//					System.out.println("�ȳ��ϼ���");
//					break;
//					
//				case"��ư2":
//					System.out.println("�ݰ����ϴ�");
//					break;
//					
//				case"��ư3":
//					System.out.println("�Ǹ�����");
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
