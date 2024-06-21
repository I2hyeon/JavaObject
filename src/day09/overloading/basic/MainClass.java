package day09.overloading.basic;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(2);
		b.input("홍길동");
		b.input(1, 3.14);
		b.input(3.14, 1);
		
		
		// 사실 이미 오버로딩된 메서드를 쓰고 있었음
		
		// System.out.println( Arrays.toString(arr) );
		
	}
	
}
