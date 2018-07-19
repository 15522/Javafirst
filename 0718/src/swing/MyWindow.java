package swing;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

//������ Ŭ����
public class MyWindow extends JFrame {

	public MyWindow() {
		// ��ġ�� ũ�� ����
		setBounds(100, 100, 800, 800);
		// ���� ����
		setTitle("������ �̿��� ������");
		// ���� ��ư �̺�Ʈ ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// �г��� ����
		JPanel panel = new JPanel();
		ImageIcon icon = new ImageIcon("C:\\Users\\503-22\\Documents\\���¿�\\�ڹ���������\\0.png");
		JLabel label = new JLabel(icon);
		label.setToolTipText("�ȳ��ϼ���");
		// TitledBorder border = new TitledBorder("��輱");
		EtchedBorder border = new EtchedBorder(Color.RED, Color.PINK);
		label.setBorder(border);
		panel.add(label);

		JButton btn = new JButton("��ư");
		panel.add(btn);
		
		// �г��� �����ӿ� ����
		add(panel);

		// ȭ�� ���
		setVisible(true);

		// �׸����� �̸��� �迭�� �����
		// �迭�� ����� ũ�� ������ �ȵ˴ϴ�.
		String[] images = { "0.png", "1.png", "2.png", "3.png" };

		// ����Ʈ�� ũ�� ������ ������ �迭�Դϴ�.
		ArrayList<String> list = new ArrayList<String>();
		list.add("0.png");
		list.add("1.png");
		list.add("2.png");
		list.add("3.png");

		// �̹����� ����Ǵ� ���ȿ��� �ٸ� �۾��� �� �� �־�� �ϹǷ� �̹��� ������ ������� ����
		Thread th = new Thread() {
			public void run() {
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(100);
						ImageIcon icon = new ImageIcon("C:\\Users\\503-22\\Documents\\���¿�\\�ڹ���������\\" + images[idx%images.length]);
						//list.get(idx%list.size())); ����Ʈ
								label.setIcon(icon);
						idx = idx + 1;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th.start();

	}

}
