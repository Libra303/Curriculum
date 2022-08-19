package ex1_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Memo {
	public static void main(String[] args) {
		
		Frame frame = new Frame("���� �޸���");
		frame.setBounds(1000, 300, 250, 400);
		frame.setLayout(null);
		
		//��Ʈ
		Font font = new Font("�ü�", Font.PLAIN, 20);
		
		//Ű������ ���� �Է¹ޱ����� Ŭ����
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10, 35, 150, 30);
		
		//��ư
		Button btnOk = new Button("�Է�");
		btnOk.setBounds(165, 34, 75, 30);
		btnOk.setEnabled(false);//��ư Ŭ���� ��Ȱ��ȭ
		
		//TextFieldó�� Ű���� ���� ���� �� ������, ���η� ���� ������ �����ϴ� Ŭ����
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setBounds(5, 70, 240, 275);
		ta.setEditable(false);//TextArea�� �ؽ�Ʈ�� ���� �Է¹��� ���ϵ��� ��
		
		//�����ư
		Button btnSave = new Button("����");
		btnSave.setBounds(75, 352, 100, 30);
		frame.add(btnSave);
		
		frame.add(tf);
		frame.add(btnOk);
		frame.add(ta);
		frame.add(btnSave);
		
		//-----------------------------------------------
		//�̺�Ʈó��
		
		//tf�� ���� ����ִ� ��쿡�� �Է¹�ư Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			@Override
			public void textValueChanged(TextEvent e) {
				if(tf.getText().trim().equals("")) {
					btnOk.setEnabled(false);
				}else {
					btnOk.setEnabled(true);
				}
			}
		});
		
		//�Է¹�ư Ŭ���� tf�� ���� ta�� �߰�
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append( tf.getText() + "\n");
				
				tf.setText("");
				tf.requestFocus();//TextField�� Ŀ���� �̵�
			}
		});
		
		//�����ư
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextArea�� ��
				String msg = ta.getText();
				
				try {
					//������ ����
					FileDialog fd = new FileDialog(frame,"����",FileDialog.SAVE);
					fd.setVisible(true);
					
					//fd.getDirectory() : ������ ���� ���
					//fd.getFile() : ������ ���ϸ�
					String path = fd.getDirectory()+fd.getFile();
					
					FileWriter fw = new FileWriter(path); 
					fw.write(msg);
					fw.close();
					
					if( fd.getFile() == null) {
						JOptionPane.showMessageDialog(frame, "�������");
					}else {
						JOptionPane.showMessageDialog(frame, "����Ϸ�");
					}
							
				}catch (Exception e2) {

				}
				
			}
		});
		
		
		
		
		//-----------------------------------------------
		
		//frame.setResizable(false);//�������� ũ�� ���� �Ұ�
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main	
}
