package bytestream;



import java.io.FileWriter;
import java.io.IOException;

public class FilewriterMain {

	public static void main(String[] args) {
		
	 FileWriter fw =null;
		
		try {
			fw = new FileWriter("./char.txt");
			fw.write("�ȳ��ϼ���");
			fw.write("�ݰ����ϴ�.\n");
			fw.write("���ڿ��� ���Ͽ� ����ϰ� �ֽ��ϴ�.");
			fw.flush();
			
			
		}catch(Exception e){
			System.out.println("��Ͽ���:" + e.getMessage());
		}finally {
			try {
				if (fw != null)
					fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	
}
	
}
