package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.util.Random;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		//위치와 크기를 설정
		setBounds(100,100,500,500);
		//제목 설정
		setTitle("레이아웃 연습");
		
		Panel panel = new Panel();
		
		//panel의 레이아웃을 설정
		//panel.setLayout(new FlowLayout());
		/*
		 panel.setLayout(new BorderLayout());
		
		
		//Button btn = null;
		//컴포넌트 배치
		for(int i = 0; i <10; i = i +1) {
			Button btn = new Button("버튼" + i);
			panel.add(btn);
		}
		*/
		
		/*
		panel.setLayout(new BorderLayout());
		
		Button btnWest = new Button("서쪽");
		panel.add("West",btnWest);
		
		Button btnEast = new Button("동쪽");
		panel.add("East",btnEast);
		
		Button btnCenter= new Button("중앙");
		panel.add("Center",btnCenter);
		
		//panel.setLayout(new GridLayout(2,3,10,10));
		//for(int i = 0; i < 6; i = i +1) {
		//	Button btn = new Button("버튼" + i);
		//	panel.add(btn);
	//	}
		*/
		//컴포넌트의 크기와 위치를 마음대로 변결할 수 있습니다.
		panel.setLayout(null);
		Label label = new Label("@");
		label.setBounds(10,50,30,50);
		add(label);
		
		
		add(panel);
		//화면 크기 조절을 못하도록 설정
		setResizable(false);
		//화면출력
		setVisible(true);
		
		Thread th = new Thread() {
			public void run() {
				//무한 반복
				while(true) {
					//현재 레이블의 위치를 가져오기
					int x = label.getLocation().x;
					int y = label.getLocation().y;
					//label.setLocation(x + 10,y);
					Random r = new Random();
					label.setLocation(r.nextInt(300),r.nextInt(300));
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		th.start();
		
	}
	
}
