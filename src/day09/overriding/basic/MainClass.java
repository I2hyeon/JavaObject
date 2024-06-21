package day09.overriding.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // 물려받은 메서드
		c.method02(); // 오버라이딩된 메서드
		
	}

}
