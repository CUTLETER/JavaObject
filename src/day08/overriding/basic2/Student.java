package day08.overriding.basic2;

public class Student extends Person {
	// 상속 받고 싶은 클래스 extends Person 붙임
	

	String studentId; // 고유한 기능만 남겨둠
	
	String info() {
		return "이름 :" +name + ", 나이 :"+age+", 학번 :"+studentId;
	}


}
