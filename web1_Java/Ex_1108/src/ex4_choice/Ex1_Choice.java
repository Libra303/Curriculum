package ex4_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Choice {
	
	static String res = "�Ͽ���";
	
	public static void main(String[] args) {
		
		Frame f = new Frame("choice ���û���");
		f.setLayout(null);//�ڵ���ġ ����
		f.setBounds(1000, 300, 300, 100);
		
		//Choice ��ü ����
		Choice day = new Choice();
		//Choice ��ü�� ���̴� �ȿ� �ִ� ����� ������� �����ǹǷ�
		//0���� �ص� �ȴ�.
		day.setBounds(50, 50, 150, 0);
		
		day.add("�Ͽ���");
		day.add("������");
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		
		//choice�� �̺�Ʈ ������ ���
		day.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				res = day.getSelectedItem();
				System.out.println(res);
			}
		});
		
		f.add(day); //�����ӿ� ���̽� ��ü �߰�
		
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}//main
}
