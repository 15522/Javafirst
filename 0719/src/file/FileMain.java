package file;

import java.io.File;
import java.sql.Date;


public class FileMain {

	public static void main(String[] args) {
		//���Ͽ� ���� ������ Ȯ���� �� �ִ� Ŭ������ �ν��Ͻ��� ����
		File f = new File("C:\\Users\\503-22\\Documents\\���¿�\\�ڹ���������\\���ϵ�\\16.IO.pptx");
		//������ ���� ����
		System.out.println(f.exists());
		
		//������ ũ��
		long size = f.length();
		System.out.println(size/1024 + "k");
		
		//������ ���� �����ð�
		Date date = new Date(f.lastModified());
		System.out.println(date);

		File file = new File("C:\\Users\\503-22\\Documents\\Visual Studio 2017\\16.IO.pptx");
		String parent = file.getParent();
		String filename = file.getName();
		//filename ���� 15. �� ������ �κ��� ��������
		//.�� ��ġ�� ã�Ƽ� . ������ ���ڿ� ��������
		int idx = filename.indexOf('.');
		System.out.println(idx);
		//. �� ���� �Ѵٸ� : ��ġ�� ã�� �޼ҵ�� ã���� �ϴ� �����Ͱ� ������ ������ ����
		if(idx >= 0) {
			//���ڿ��� ��ġ�� ������ �ڸ��� �޼ҵ�
			//substring
			filename = filename.substring(idx +1);
		}
		System.out.println(filename);
		//�̸� �ٲٱ�
		//String newFile = parent + filename;
		//System.out.println(newFile);
		//file.renameTo(new File(parent,filename));
	}

}
