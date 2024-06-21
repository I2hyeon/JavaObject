package day12.final_.method;

public class Child extends Parent {
	
//	public void method01() {		
//	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // final 메서드는 사용이 가능함(오버라이딩만 금지)
		
	}

}
