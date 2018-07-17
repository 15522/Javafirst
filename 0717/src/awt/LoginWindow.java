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

	//������ - �ν��Ͻ��� ���� �� ȣ���ϴ� �޼ҵ�
	public LoginWindow() {
		//ũ��� ��ġ �� Ÿ��Ʋ ����
		setSize(500,500);
		setLocation(200,200);
		setTitle("�α���");
		
		//�г��� ����
		Panel panel = new Panel();
		Label lblid = new Label("���̵�");
		TextField txtld = new TextField(20);
		panel.add(lblid);
		panel.add(txtld);
		
		Label lblpw = new Label("��й�ȣ");
		TextField txtpw = new TextField(20);
		txtpw.setEchoChar('*');
		panel.add(lblpw);
		panel.add(txtpw);
		
		//���� �� �Է��� �� �ִ� �ؽ�Ʈ ���� �����
		TextArea ta = new TextArea(10,50);
		panel.add(ta);
		//�г��� �����ӿ� ����
		add(panel);
		
		//�޴� �� �����
		MenuBar menuBar = new MenuBar();
		
		//�޴� ����
		Menu file = new Menu("����(F)");
		
		//�޴��� �޴� �ٿ� ����
		menuBar.add(file);
		
		MenuItem newFile = new MenuItem("���θ����");
		file.add(newFile);
		MenuItem save = new MenuItem("����");
		file.add(save);
		
		Menu edit = new Menu("����>");
		MenuItem copy = new MenuItem("����");
		edit.add(copy);
		file.add(edit);
		
		
		//�޴� �ٸ� �����쿡 ��ġ
		setMenuBar(menuBar);
		
		
		//ȭ�� ���
		setVisible(true);
	}
	
}