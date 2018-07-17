package awt;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

public class LoginWindow extends Frame {

	//생성자 - 인스턴스를 만들 때 호출하는 메소드
	public LoginWindow() {
		//크기와 위치 및 타이틀 설정
		setSize(500,500);
		setLocation(200,200);
		setTitle("로그인");
		
		//패널을 생성
		Panel panel = new Panel();
		Label lblid = new Label("아이디");
		TextField txtld = new TextField(20);
		panel.add(lblid);
		panel.add(txtld);
		
		Label lblpw = new Label("비밀번호");
		TextField txtpw = new TextField(20);
		txtpw.setEchoChar('*');
		panel.add(lblpw);
		panel.add(txtpw);
		
		//여러 줄 입력할 수 있는 텍스트 영역 만들기
		TextArea ta = new TextArea(10,50);
		panel.add(ta);
		//패널을 프레임에 부착
		add(panel);
		
		//메뉴 바 만들기
		MenuBar menuBar = new MenuBar();
		
		//메뉴 생성
		Menu file = new Menu("파일(F)");
		
		//메뉴를 메뉴 바에 부착
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("새로만들기");
		file.add(newFile);
		MenuItem save = new MenuItem("저장");
		file.add(save);
		
		Menu edit = new Menu("편집>");
		MenuItem copy = new MenuItem("복사");
		edit.add(copy);
		file.add(edit);
		
		
		//메뉴 바를 윈도우에 배치
		setMenuBar(menuBar);
		
		
		//화면 출력
		setVisible(true);
	}
	
}
