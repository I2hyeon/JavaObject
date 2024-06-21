package day11.static_.method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.a = 10;
		
		c.method01();
		c.method02();
		
		// static 메서드의 사용 - 클래스명.메서드명()
		Count.method02();
		
		MainClass m = new MainClass();
		m.test();
		
		// 비밀
		Math.random();
		Arrays.toString(new int[3]);
		String.valueOf(false);
		Integer.parseInt("3"); 
		
		
	}
	
	public void test( ) {
		
		
		
	}

}
