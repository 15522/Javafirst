package thread;

public class Bank {
	// 잔액을 저장할 변수
	private int balance = 1000;

	// 잔액을 변경하는 메소드
	public void job(String msg) {
		//this - 내 자신의 자원을 사용 하는경우 이코드는 한번에 수행되도록 설정
		synchronized (this) {
			System.out.println(msg + "현재 잔액:" + balance);
			balance = balance - 100;
			// 1초대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(msg + "작업 후 현재 잔액:" + balance);
		}
	}

}
