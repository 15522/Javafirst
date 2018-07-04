//유사한 역할을 하는 메소드들의 이름이 서로 다르면 기억해야 할 메소드의 개수가 늘어납니다.
//유사한 역할을 수행하는 메소드들의 이름은 서로 동일한게 좋습니다.
//Terran 과 Zerg 와 Protoss 클래스 들 간에 아무런 관계도 없어서 세개의 변수를 만들어서 메소드를 호출했습니다.
//상위 클래스 타입의 변수에 하위 클래스 타입의 인스턴스 주소를 대입할 수 있는 문법을 이용하면 하나의 변수에 3개 클래스의 인스턴스 주소를 대입할 수 있습니다.
//3개 클래스의 상위 클래스가 될 Starcraft 클래스를 생성
//3개 클래스에 starcraft 클래스를 상속 (extends Starcraft )
//Main 클래스 수정
//하나의 변수를 가지고 3개의 인스턴스를 전부 대입받을 수는 있지만 메소드 호출은 안됩니다.
//변수는 오버라이딩된 메소드만 하위 클래스의 것을 호출할 수 있기 때문입니다.
//오버라이딩을 만들어주기 위해서 Starcraft 클래스에 attack()을 추가
//Starcraft 클래스 수정
//이렇게 만들면 Main 을 제외한 클래스들은 복잡해지지만 Main 클래스는 간결해집니다.
//Main 클래스는 유저가 사용하는 클래스이고 나머지 클래스는 보조적인 역할을 수행하는 클래스입니다.
//Main 이 간결해지면 유저는 편리해지고 개발자는 피곤해집니다.

package polymorphism1;

public class Main {

	public static void main(String[] args) {
		// 3개 클래스의 공격하는 메소드를 호출해보기
		Starcraft star = new Terran();
		star.attack();
		
		star = new Zerg();
		star.attack();
		
		star = new protoss();
		star.attack();
	}

}
