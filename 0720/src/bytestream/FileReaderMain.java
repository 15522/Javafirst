package bytestream;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) {

		FileReader fr = null;

		try {
			fr = new FileReader("./char.txt");
			char[] buf = new char[15];
			while (true) {
				//buf 의 크기만큼 읽어서 buf에 저장하고 읽은 개수를 r에 저장
				int r = fr.read(buf);
				if (r <= 0) {
					break;
				}
				//배열에서 0번째 부터 r 만큼만 문자열로 변환해서 출력
				System.out.println(new String(buf, 0 ,r));
			}
		} catch (Exception e) {
			System.out.println("기록예외:" + e.getMessage());
		} finally {
			if (fr != null)
				try {
					if (fr != null)
						fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
