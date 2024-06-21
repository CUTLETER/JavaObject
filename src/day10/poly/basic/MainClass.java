package day10.poly.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Child c = new Child();
	
		Parent p = c; // 형 변환
		p.method1(); // 상속 받은 메소드
		p.method2(); // 오버라이딩 된 메소드
		// p.method3(); 다형성이 적용되면 자식이 가진 본래 메소드는 사용 불가, 부모에게 상속받은 메소드만 사용 가능(기본 전제), but 오버라이딩 된 메소드 또한 사용 가능(예외)
		
		System.out.println(c);
		System.out.println(p);
		System.out.println(c==p);
		// 주소값이 같음 - 본래의 모습은 같음 - 자식이 일시적으로 부모로 형 변환됨
		
		
		System.out.println("--------아래는 클래스 캐스팅--------");
		
		
		/*
		 * 클래스 캐스팅이란?
		 * 다형성이 적용된 객체는 클래스 캐스팅을 통해서 다시 자기 자신으로 돌아올 수 있음
		 */
		Parent pp = new Child(); // 자식 생성 -> 부모 저장
		Child cc = (Child)pp; // 다시 (Child)로 깎아서(=캐스팅) 데이터 타입 Child에 담음, 원래 타입으로 돌아옴
		cc.method1();
		cc.method2();
		cc.method3(); // 이러면 3번 기능 쓸 수 있음
		
		
		Parent ppp = new Parent();
		Child ccc = (Child)ppp;
		//다형성이 적용되지 않았을 때 - 문법은 맞으나 실행 시 오류 발생함
		
		
	}

}
