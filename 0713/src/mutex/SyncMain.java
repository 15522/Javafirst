package mutex;

public class SyncMain {

	public static void main(String[] args) {
		ShareData ShareData = new ShareData();
		
		Producer p = new Producer(ShareData);
		Customer c = new Customer(ShareData);
		
		p.start();
		c.start();
	}

}
