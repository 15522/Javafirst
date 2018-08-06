package multicast;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

public class MulticastSend {

	public static void main(String[] args) {
		try {
			// ������ ��Ƽĳ��Ʈ ������ ����
			MulticastSocket ms = new MulticastSocket();
			// ���ڿ��� �Է¹ޱ� ���� ��ĳ�� �����
			Scanner sc = new Scanner(System.in);
			// �г��� �����ϱ�
			System.out.print("�г��� �Է�:");
			String nick = sc.nextLine();
			while (true) {
				System.out.println("�޽���(����� end):");
				String msg = sc.nextLine();
				if (msg.equals("end")) {
					msg = nick + "���� �����ϼ̽��ϴ�.";
					// ������ ��Ŷ ����� - ����,����,�������� �ּ�, ��Ʈ��ȣ
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("FF7E:230::1234"), 9999);
					// ������ ����
					ms.send(dp);
					// ��Ĺ�� ��ĳ�� �ݱ�
					ms.close();
					sc.close();
					break;
				} else {
					// �޽��� �����
					msg = nick + ":" + msg;
					// ������ ��Ŷ �����
					DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.getBytes().length,
							InetAddress.getByName("FF7E:230::1234"), 9999);
					// ������ ����
					ms.send(dp);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
