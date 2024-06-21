package day11.inter.basic;

public class Basic implements Inter1, Inter2 {
	
	/*
	 * 1. 인터페이스의 구현(=상속) 키워드 : implements
	 * 2. 인터페이스에 선언된 추상 메소드는 자식에서 반드시 오버라이딩 해야 함
	 */
	
	@Override
	public void method01() {
		System.out.println("Inter1의 오버라이딩된 1번 메소드");
		
	}

	@Override
	public void method02() {
		System.out.println("Inter2의 오버라이딩된 2번 메소드");
		
	}
	
	public void method03() {
		System.out.println("자신의 메소드 3번");
	}
	
	
	

}
