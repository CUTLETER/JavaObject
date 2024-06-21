package day08.this_;

public class Student extends Person {
	// 상속 받고 싶은 클래스 extends Person 붙임
	

	String studentId; // 고유한 기능만 남겨둠
	
	Student (String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	String info() {
		return "이름 :" +name + ", 나이 :"+age+", 학번 :"+studentId;
	}


}
