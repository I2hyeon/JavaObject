package day09.this_;

public class Student extends Person { // 상속받기
	
	String studentId;
	
	// name, age 부모로부터 상속
	Student(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}

}
