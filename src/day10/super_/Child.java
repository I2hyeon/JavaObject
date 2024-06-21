package day10.super_;

public class Child extends Parent {
	
//	Child() {
//		super(); // 부모의 기본 생성자 즉, 아무것도 쓰지 않아도 super 가 생략되어 있음
//	}
	
	/*
	 * 자식은 super() 통해서 부모의 생성자와 연결되어 있음
	 * 
	 * 해결방법
	 * 1. 부모의 기본 생성자를 만든다.
	 * 2. 부모님의 생성자 타입과 강제 연결
	 */
	
	Child(String father, String mother) { // 2번
		super(father, mother);
	}

}
