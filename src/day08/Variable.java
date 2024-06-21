package day08;

public class Variable {
	
	// 멤버 변수
	int a; // 기본값으로 자동으로 초기화
	
	// 지역 변수
	void printNum(int c) {
		int b = 1;
		
		System.out.println("멤버 변수:" + a);
		System.out.println("지역 변수" + b);
		System.out.println("매개 변수:" + c); // 지역 변수
	}

}
