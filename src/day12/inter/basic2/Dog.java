package day12.inter.basic2;

public class Dog extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("강아지는 고구마를 먹어요");
	}

	@Override
	public void playing() {
		System.out.println("강아지는 원반 던지기를 하며 놀아요");
	}

}
