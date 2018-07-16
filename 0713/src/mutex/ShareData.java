package mutex;

import java.util.ArrayList;

//공유 자원을 가진 클래스

public class ShareData {
	//저장 공간을 생성
	public static ArrayList<Character> List = new ArrayList<>();

//데이터를 저장하는 메소드
	public synchronized void save(char ch) {
		if(List.size() > 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		List.add(ch);
		System.out.println(ch + "를 저장했습니다.");
		//wait 중인 스레드 깨우기
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//리스트에서 하나를 꺼내서 출력하는 메소드
	public synchronized void get() {
		if(List.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		char ch = List.remove(0);
		System.out.println(ch + "를 소비했습니다.");
		notifyAll();
	}
}
