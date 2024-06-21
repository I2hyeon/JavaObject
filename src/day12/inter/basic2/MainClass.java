package day12.inter.basic2;

public class MainClass {
	
	public static void main(String[] args) {
		
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		Animal[] arr = {dog, cat, tiger};
		
		for(Animal ani : arr) {
			ani.eating();
		}
		
		System.out.println("-------------");
		
		// IPet 배열을 생성하고, IPet에 들어갈 수 있는 타입은 Dog, Cat, GoldFish
		IPet[] arr2 = new IPet[3];
		
		arr2[0] = (IPet)dog; // Animal과 IPet 관계가 없지만 dog가 상호연관성이 있으면, 형변환
		arr2[1] = (IPet)cat;
//		arr2[2] = (IPet)tiger;
		arr2[2] = new GoldFish(); // 자동 형변환(금붕어 -> IPet으로 자동 형변환)
		
		for(IPet pet : arr2) {
			pet.playing();
		}
		
		System.out.println("-----------------------------");
		
		PetHouse house = new PetHouse();
		house.carePet( (IPet)dog );
		house.carePet( (IPet)cat );
		house.carePet( new GoldFish() ); // 새로 만들어준다

		house.petInfo(arr2);
		
	}

}
