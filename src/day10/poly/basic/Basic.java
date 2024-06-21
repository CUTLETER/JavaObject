package day10.poly.basic;



class A{}
//하나의 클래스 파일에는 여러 클래스 선언이 가능함 but 클래스 파일명과 동일한 클래스가 있어야 하고 해당 클래스만 public이어야 함
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}




public class Basic {
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; // B -> A  클래스 형변환
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	// 모두 상속관계로 이어져서 담을 수 있음, B랑 E는 상속 관계 아니라서 XXXX
	
	Object o1 = new A();
	Object o2 = 3.14;
	Object o3 = "유선화";
	Object o4 = b;
	// Object는 최상위 부모이기에 다 담아낼 수 있음
	
	
	
	
	
	
	

}
