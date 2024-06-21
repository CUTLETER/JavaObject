package day09.modi.member.pac1;

public class A {

	// 멤버 변수
	public int var1;
	int var2;
	private int var3;
	
	// 반환유형 이름() {}
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	public A() {
		var1 = 1;
		var2 = 2;
		var3 = 3;
		method01();
		method02();
		method03();
	}
	
	/////////////////////////////////////
	// 같은 패키지 안에서만 접근이 가능함
	// 단 패키지가 다르더라도 상속 관계의 super 키워드를 통해 접근 가능함
	protected int var;
	protected A(int i) {}
	protected void method() {}

	
	
	
	
	
	
	
	
}
