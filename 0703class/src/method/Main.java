package method;

import java.util.Scanner;

// 실행 클래스 - main 메소드를 소유한 클래스
public class Main {

	public static void main(String[] args) {
		// Member 클래스의 인스턴스를 생성
		Member member1 = new Member();
		Scanner sc = new Scanner(System.in);
		
		
		
		//인스턴스 변수를 호출해서 데이터 저장
		System.out.print("이메일:");
		String Email = sc.nextLine();
		member1. setEmail("asdf@naver.com");
		
		System.out.print("패스워드:");
		String Password = sc.nextLine();
		member1.setPassword("1234");
		
		System.out.print("닉네임:");
		String Nickname = sc.nextLine();
		member1.setNickname("중앙처리장치");
		
		System.out.print("나이:");
		int age = sc.nextInt();
		member1.setAge(15);
		
		sc.close();
		
		//member1.display();
		System.out.println(member1);
		
		System.out.println(Member.sum(10,30));
		System.out.println(Member.sum(10,20,30));
		System.out.println(Member.sum(10));
	}	

}
