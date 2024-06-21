package day11.inter.basic3;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 인터페이스 타입으로 선언하고 구현체에 따라서 다른 클래스가 호출됨
		 * 
		 * 예시) 콘센트 220v - 뭘 꽂았냐에 따라 같은 전기로 다르게 작동함
		 */
		
		Printed print = new Samsung(); //new Lg(); 로 바꾸면 Lg 데이터 나옴
		print.print("hello world");
		print.colorPrint("goodbye", "red");
		print.copy(5);
		
		
		
// MainClass (마이크로소프트) 에서 위에 해당 회사 print() 데이터 불러올 때
// 바로 Lg Class 가서 print() 를 가져오는 게 아니라
// 인터페이스인 Printed의 print()를 거쳐서(=통해서) Lg 데이터 가져옴
// MainClass 와 Lg 또는 Samsung은 Printed를 중간에 끼고 이어짐
// 인터페이스 = 프로그램과 프로그램 또는 프로그램과 유저 간의 중간 연결고리 역할
		 
		
		
		
		
		
		
	}

}
