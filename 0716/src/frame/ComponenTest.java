package frame;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ComponenTest extends Frame {
	public ComponenTest() {
		setTitle("체크박스 테스트");
		setLocation(500,500);
		setSize(1000,1000);
		
		Panel p = new Panel();
		
		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("음악감상");
		Checkbox cb3 = new Checkbox("게임");
		Checkbox cb4 = new Checkbox("프로그래밍");
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);
		
		//라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);
		
		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		p.add(ch);
		
		
		p.add(man);
		p.add(woman);
		//5개를 보여주고 여러 개를 선택할 수 있도록 해주는 List
		List list = new List(5, true);
		list.add("C&C++");
		list.add("C#");
		list.add("Java");
		list.add("JavaScript");
		list.add("Objective-C");
		list.add("python");
		list.add("swift");
		list.add("Kotlin");
		list.add("Scala");
		p.add(list);
		//list의 remove(int idx)를 이용하면 idx 번째를 지울 수 있습니다.
		//list.remove(0);
		//첫번째 에 있는 C&C++ 과 5번째 있는 Objective-C를 제거
		//여러개를 지울 때는 뒤에서 부터 삭제해야 합니다.
		list.remove(4);
		list.remove(0);
		
		
		
		add(p);
		setVisible(true);
	}
}
