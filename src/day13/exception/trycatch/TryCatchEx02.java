package day13.exception.trycatch;

public class TryCatchEx02 {
	
	public static void main(String[] args) {
		
		// 반복문에서 예외처리
		
		String[] arr = {"홍길동", "홍길자", "이순신"};
		
		int i = 0;
		
		while( i < 4 ) {
			
			try {
				
				System.out.println(arr[i]);
				
			} catch (Exception e) { // 모든 예외를 처리할 수 있음
				System.out.println("배열 참조 범위를 벗어났습니다");
			} finally {
				System.out.println("예외 여부와 상관없이 실행됩니다"); // 자원해제할 때 많이 사용됨
			}
			
			
			i++;
		}
		
		System.out.println("프로그램 정상종료");
		
	}

}
