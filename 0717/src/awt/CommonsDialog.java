package awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;

public class CommonsDialog extends Frame {
	public CommonsDialog() {
		setBounds(200,200,600,600);
		setTitle("���� ��ȭ ����");
		//���� ��ȭ���� �����
		FileDialog fileDialog = new FileDialog(this,"���� ��ȭ����" );
		//���丮 ����
		fileDialog.setDirectory("C:\\Users");
		
		//���� ��ȭ���ڸ� ȭ�鿡 ���
		fileDialog.setVisible(true);
		
		//������ ���� ��� ��������
		String filepath = fileDialog.getDirectory() + fileDialog.getFile();
		
		//System.out.println(filepath);
		
		Label label = new Label(filepath);
		add(label);
		
		
		setVisible(true);
	
	}
}
