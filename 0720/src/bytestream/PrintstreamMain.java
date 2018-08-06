package bytestream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintstreamMain {

	public static void main(String[] args) {
		PrintStream ps = null;
		
		try {
			ps = new PrintStream(new FileOutputStream("./data.dat",true));
		ps.println("�ݰ����ϴ�.");
		ps.println("�ٷ� �ٷ� ó���մϴ�.");
		ps.flush();
		}
		catch(Exception e){
			System.out.println("���Ͼ��� ����:" + e.getMessage());
		}
		finally {
			
				if (ps != null)
					ps.close();
			}
		}
		

	}

