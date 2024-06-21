package day10.static_.singleton;

public class Singleton {

	// 객체가 단 1개만 생성되도록 클래스를 구성하는 디자인 패턴 중 하나
	
	// 1. 외부에서 직접 객체를 생성할 수 없도록 생성자를 1개로 제한하고 private을 붙임
	private Singleton() {
		
	}

	// 2. 멤버변수로 스스로 객체를 1개 만듦 (static)
	//	  멤버변수에 private도 붙임 - 값을 못 가져가게
	private static Singleton instance = new Singleton();
	
	// 3. 클래스 외부에서 객체를 요구할 때 getter 메소드를 통해서 2번에 생성해둔 단 1개의 객체를 반환함
	public static Singleton getInstance() { // static 없으면 main에 호출 못해서 붙여야 함
		return instance;
	}
	
	//////////////////////////////////////////////
	private String name = "홍길동";
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
