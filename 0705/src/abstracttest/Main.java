package abstracttest;

public class Main {

	public static void main(String[] args) {
		SmartPhone SmartPhone = new Iphone();
		SmartPhone.call();
		
		SmartPhone = new Android();
		SmartPhone.call();
		
		//SmartPhone의 인스턴스 생성
		//SmartPhone = new SmartPhone();
		
		SmartPhone = new WinPhone();
		SmartPhone.call();
		
		//final 변수 - 값을 변경할 수 없습니다.
		//지역변수지만 전역변수처럼 메모리에서 소멸되지 않습니다.
		//final int ZERO = 0;
		//ZERO = 1; 변경이 안되니까 에러남.
	}

}
