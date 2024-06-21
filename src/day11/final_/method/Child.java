package day11.final_.method;

public class Child extends Parent {

//	public void method01() {	
//	}
	
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // method에 붙으면 상속 받은 자식이 오버라이딩(변경) 불가, but 상속은 받았기에 자식이 사용 자체는 가능함 (2)
		
	}
}
