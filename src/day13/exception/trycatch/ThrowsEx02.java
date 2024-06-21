package day13.exception.trycatch;

public class ThrowsEx02 {

	
	// 생성자
	public ThrowsEx02() throws Exception {
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
	//
	public void aaa() throws Exception {
		System.out.println("aaa 호출");
		bbb();
		System.out.println("aaa 종료");
	}
	
	public void bbb() throws Exception {
		System.out.println("bbb 호출");
		
		System.out.println(10 / 0);
		
//		try {
//			
//			System.out.println(10 / 0); // 예외
//			
//		} catch (Exception e) {
//			System.out.println("예외 처리 완료");
//		}

		System.out.println("bbb 종료");
	}
	
}
