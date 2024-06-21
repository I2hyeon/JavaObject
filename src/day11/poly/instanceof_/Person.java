package day11.poly.instanceof_;

public class Person extends Object {
	
	// 부모 클래스 - 공통으로 사용될 기능
	
	 String name;
	 int age;
	 
	 // 생성자
	 // 생성자 연결 - 생성자의 첫번째 줄에서 this()를 생성자 간 연결이 가능
	 Person(String name, int age) {
		 this.name = name;
		 this.age = age;
//		 System.out.println("두 개짜리 생성자로 호출됨");
	 }
	 
	 Person(String name) {
		 this(name, 1);
	 }
	 
//	 Person() {
//		this("이름없음", 1);
//	 }
	 
	 
	 String info() {
		 return "이름:" + name + ", 나이:" + age;
	 }

}
