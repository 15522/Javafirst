package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class Ex1 extends Frame {
	//������ - �ν��Ͻ��� ������ �� ȣ���ϴ� �޼ҵ�
	public Ex1() {
		//��ġ�� ũ�⸦ ����
		setBounds(100,100, 500,500);
		//���� ����
		setTitle("�����ȭ����");
		
		//FileDialog ��ü�� �����ؼ� ȭ�鿡 ����ϰ� ������ ���� ��θ� ���̺� ���
		//FileDialog�� ������ �� ù��° �Ű������� Dialog �� Framed�� �ּ��ε� ������ ���� this�� �����ϸ� �˴ϴ�.
		
		//FileDialog �ν��Ͻ� ����
		FileDialog fd = new FileDialog(this);
		//ȭ�� ���
		fd.setVisible(true);
		//������ ���丮�� �����̸��� ��������
		String filepath = fd.getDirectory() + fd.getFile();
		
		//���̺� ����
		Label label = new Label(filepath);
		add(label);
		
		
		//ȭ�� ���
		setVisible(true);
		
	}
	
	
}
