package day07;

public class Variable {

	// 멤버변수
	int a; // 이 상태에서는 기본값으로 자동 초기화
	
	// 지역변수
	void printNum(int c) {
		int b=1;
		System.out.println("멤버변수 : "+a);
		System.out.println("지역변수 : "+b);
		System.out.println("매개변수 : "+c); // 지역변수의 일종
		
		
	}
	
	
	
	
}
