package day10.static_.basic;

public class Calculator {
	
	// static을 언제 쓰면 좋을까?
	/*
	 * 계산기마다 다른 값을 가져야 하면 일반 멤버변수가 됨
	 * 계산기마다 원주율은 동일하기 때문에 static으로 선언하면 좋음
	 */
	
	
	private String color; // 계산기 색상
	private int result; // 계산기 값
	public static double pi = 3.14; // 원주율
	
	
	static { // static{} = static블록
		// 클래스가 호출될 때 딱 1번만 실행되는 특징을 가짐, 가장 먼저 실행됨, 딱 1번만 실행됨
		pi = 3.14; // static 변수의 초기화
		System.out.println("static 블록 실행됨"); 
	}
	
	
	
	
	
	
	
	
	
	public void setColor(String color) { // static을 쓰면 this.사용XXXX / static은 클래스 바깥에 만들어지기 때문에 this. 붙이면 오류남
										// 일반 멤버변수, 일반 메소드를 참조하는 메소드는 일반 메소드로 만듦
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	
	/*
	 * 메소드 내부에서 일반 멤버 변수를 쓰지 않고
	 * 범용성 있게 사용할 메소드는 static을 붙이면 좋음
	 */
	public static double circle(int r) {
		return pi*r*r;
	}
	
	
	

}
