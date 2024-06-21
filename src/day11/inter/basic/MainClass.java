package day11.inter.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Inter1 inter = new Inter1();  인터페이스라 객체 생성XXX
		Basic b = new Basic();
		b.method01();
		System.out.println(Basic.PI); // 상수 소환 b.PI XXXXX
		System.out.println(Inter1.PI); 
		b.method02();
		System.out.println(Inter2.ABC);
		b.method03();

		
		System.out.println("--------------");
		
		
		
//		인터페이스도 다형성처럼 부모 타입으로 사용될 수 있음, 부모 타입에 있는 기능만 사용할 수 있고 오버라이딩된 메소드는 먼저 실행됨
		Inter1 i1 = new Basic();
		i1.method01();
//		i1.method02();
	
		
		
		System.out.println("---------------");
		
		
		// 인터페이스도 클래스 캐스팅을 할 수 있음
		Basic b2 = (Basic)i1;
		b2.method01();
		b2.method02();
		b2.method03();
		
		
		
		
		
		
	}

}
