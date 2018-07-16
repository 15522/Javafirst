package mutex;


public class Producer extends Thread {
	private ShareData ShareData;
	
	//생성자
	public Producer(ShareData ShareData) {
		this.ShareData =ShareData;
	}
//스레드로 동작할 메소드
	public void run() {
		for(int i = 0; i < 26; i = i +1) {
			//65에 i 를 더해서 문자로 변경한 후 save 메소드에게 전달
			ShareData.save((char)(65+i));
		}
	}
	
}
