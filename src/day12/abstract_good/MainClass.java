package day12.abstract_good;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 추상 클래스는 객체 생성이 안됩니다
		// 추상 클래스를 사용하려면 자식으로 생성해서 부모 타입에 저장하고 이것을 객체 추상화라고 부릅니다.
//		Store s = new Store();
		
//		SeoulStore s = new SeoulStore();
//		Store s = new SeoulStore(); // 다형성
		Store s = new BusanStore(); 
		
		s.melon();
		s.apple();
		s.orange();
		s.mango(); // 부모님에게 상속받은 메서드
		
		String name = s.getname(); // 부모님에게 상속받은 메서드
		System.out.println(name);
		
	}

}
