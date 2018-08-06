package bytestream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamMain {

	public static void main(String[] args) {
		// 파일에서 바이트 단위로 버퍼링을 이용해서 읽기
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream("C:\\Users\\503-22\\Documents\\김태완\\박문석선생님\\수업자료\\0703.hwp"));
			while(true) {
				byte [] b = new byte[5120];
				int r = bis.read(b);
				System.out.println(new String(b));
				if(r <= 0) {
					break;
				}
			}
			
		}
		catch(Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}
		finally {
			try {
				if(bis != null)
					bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
