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
		
		Frame frame = new Frame("간단 메모장");
		frame.setBounds(1000, 300, 250, 400);
		frame.setLayout(null);
		
		//폰트
		Font font = new Font("궁서", Font.PLAIN, 20);
		
		//키보드의 값을 입력받기위한 클래스
		TextField tf = new TextField();
		tf.setFont(font);
		tf.setBounds(10, 35, 150, 30);
		
		//버튼
		Button btnOk = new Button("입력");
		btnOk.setBounds(165, 34, 75, 30);
		btnOk.setEnabled(false);//버튼 클릭을 비활성화
		
		//TextField처럼 키보드 값을 받을 수 있으나, 새로로 넓은 영역을 포함하는 클래스
		TextArea ta = new TextArea("",0,0,TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setBounds(5, 70, 240, 275);
		ta.setEditable(false);//TextArea에 텍스트를 직접 입력받지 못하도록 함
		
		//저장버튼
		Button btnSave = new Button("저장");
		btnSave.setBounds(75, 352, 100, 30);
		frame.add(btnSave);
		
		frame.add(tf);
		frame.add(btnOk);
		frame.add(ta);
		frame.add(btnSave);
		
		//-----------------------------------------------
		//이벤트처리
		
		//tf에 값이 들어있는 경우에만 입력버튼 활성화
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
		
		//입력버튼 클릭시 tf의 값을 ta에 추가
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append( tf.getText() + "\n");
				
				tf.setText("");
				tf.requestFocus();//TextField로 커서가 이동
			}
		});
		
		//저장버튼
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//TextArea의 값
				String msg = ta.getText();
				
				try {
					//저장경로 지정
					FileDialog fd = new FileDialog(frame,"저장",FileDialog.SAVE);
					fd.setVisible(true);
					
					//fd.getDirectory() : 저장할 폴더 경로
					//fd.getFile() : 저장할 파일명
					String path = fd.getDirectory()+fd.getFile();
					
					FileWriter fw = new FileWriter(path); 
					fw.write(msg);
					fw.close();
					
					if( fd.getFile() == null) {
						JOptionPane.showMessageDialog(frame, "저장취소");
					}else {
						JOptionPane.showMessageDialog(frame, "저장완료");
					}
							
				}catch (Exception e2) {

				}
				
			}
		});
		
		
		
		
		//-----------------------------------------------
		
		//frame.setResizable(false);//프레임의 크기 변경 불가
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}//main	
}
