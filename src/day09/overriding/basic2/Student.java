package day09.overriding.basic2;

public class Student extends Person { // 상속받기
	
	String studentID;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentID;
	}

}
