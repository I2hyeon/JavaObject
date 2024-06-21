package day12.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 인터페이스 타입으로 선언하고, 구현체에 따라서 다른 클래스가 호출됩니다
		 * 
		 * ex)
		 * 콘센트 220v
		 */
		
		Printed print = new Samsung(); // new Lg(); // Samsung에 저장하면 직접적으로 호출되고 printed에 저장하면 간접적으로 호출된다(너와 나의 연결고리)
		print.print("hello world");
		print.colorPrint("good by...", "검정");
		print.copy(5);
		
	}

}
