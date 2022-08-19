package ex3_check_box;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Check_RadioMain2 {
	static boolean female = false;
	static boolean male = false;
	public static void main(String[] args) {
		
		Frame f = new Frame("üũ�ڽ��� ���� ��ư");
		f.setBounds(1000, 400, 800, 500);
		f.setLayout(null);//�ڵ���ġ ����
		
		//��Ʈ����
		//Font.ITALIC : ���ڸ� ��￩�� �����ش�
		//Font.PLAIN : �β��Ե�, ��������� ���� �⺻ ��Ʈ
		Font font = new Font("�ü�ü",Font.BOLD, 30); 
		
		Label q1 = new Label("����� ������ �����Դϱ�?");
		q1.setFont(font);
		q1.setBounds(10, 25, 380, 50);
		//q1.setBackground(Color.green);
		
		//������ư ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox c1 = new Checkbox("����", group, false);
		Checkbox c2 = new Checkbox("����", group, false);
		
		c1.setBounds(10, 80, 100, 50);
		c1.setFont(font);
		
		c2.setBounds(10, 140, 150, 50);
		c2.setFont(font);
		
		//üũ�ڽ��� �̺�Ʈ ������ ����
		ItemListener it = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				switch(e.getItem().toString()) {
				
				case "����":
					if( e.getStateChange() == 1) {
						female = true;
						System.out.println("�� ����");
					}else {
						female = false;
					}
					break;
					
				case "����":
					if( e.getStateChange() == 1) {
						male = true;
						System.out.println("�� ����");
					}else {
						male = false;
					}
					break;
				}
				
			}
		};
		
		//üũ�ڽ��� �̺�Ʈ ������ ���
		c1.addItemListener(it);
		c2.addItemListener(it);
		
		f.add(q1);//frame�� q1���̺� �߰�
		f.add(c1);
		f.add(c2);
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main
}
