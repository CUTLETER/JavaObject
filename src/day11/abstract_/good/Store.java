package day11.abstract_.good;

public abstract class Store { // 추상 메소드를 품고 있으면 덩달아 추상 클래스가 되어야 함
	
	/*
	 * 1. 추상 메소드는 abstract를 붙이고 반드시 자식이 오버라이딩 하게 됨
	 * 2. 추상 메소드는 {}가 없는 메소드
	 * 3. 추상 메소드를 갖게 되면 클래스도 덩달아 추상 클래스가 되어야 함
	 * 4. 추상 클래스는 객체로 생성할 수 없음
	 *    대신 일반 멤버변수, 생성자, 일반 메소드 모두 가질 수 있음
	 */
	
	private String name = "과일 지점"; // 추상 클래스여도 일반 멤버변수도 가질 수 있음
	
	public Store() {
		System.out.println("추상 클래스의 생성자 호출"); // 추상 클래스여도 생성자 가질 수 있음
	}
	
	
	public abstract void melon();
	public abstract void apple();
	public abstract void orange();
	
	public void mango() { // 추상 클래스여도 일반 메소드 가질 수 있음
		System.out.println("본점 한정 판매 태국산 망고");
	}
	
	public String getName() {
		return "상호명 : " + name;
	}
	
	

}
