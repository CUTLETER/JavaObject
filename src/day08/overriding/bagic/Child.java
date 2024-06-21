package day08.overriding.bagic;

public class Child extends Parent {

	/*
	 * 오버라이딩 - 부모한테 물려받은 메소드의 내용을 바꿔쓰는 것
	 * 규칙 - 부모의 메소드 원형과 동일하게 만들 것
	 * 
	 */
	
	void method02() {
		System.out.println("자식의 오버라이딩된 메소드 2번 실행");
	}
	
}
