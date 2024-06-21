package day10.super_;

public class Student extends Person { // 상속받기
	
	String studentId;
	
	// name, age 부모로부터 상속 (super 사용)
	Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	
	String info() {
		return super.info() + ", 학번:" + studentId;
	}

}
