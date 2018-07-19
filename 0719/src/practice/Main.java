package practice;


public class Main {

	public static void main(String[] args) {
		Object obj = new Object();
		//obj 인스턴스의 toString 결과 출력
		//직접 호출하나 인스턴스 이름만 설정하나 결과는 같음
		System.out.println(obj.toString());
		System.out.println(obj);
		
		Integer i = 100;
		//toString의 결과가 저장하고 있는 데이터인 100입니다.
		System.out.println(i.toString());
		System.out.println(i);
		


	}

}
