package day13.exception.trycatch;

public class TrycatchEx01 {
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 0;
		
		try {
		
			System.out.println(x + y);
			System.out.println(x - y);
			System.out.println(x / y); // 0으로 나눌 수 없음
			System.out.println(x * y);
			
		} catch(ArithmeticException e) { // 예외의 종류가 들어감
			System.out.println("0으로 나눌 수 없습니다");
			
		}
		
		System.out.println("프로그램 정상종료");
		
		
	}

}
