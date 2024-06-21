
package day10.super_;

public class Employee extends Person {
	
	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
//		this.name = name; // super 를 쓰면서 같은 코드를 반복하고 있으므로 지워도 ok
//		this.age = age;
		this.department = department;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
