package day08.overloading.basic;

public class Basic {
	
	/*
	 * 오버로딩 - 같은 이름의 메소드를 여러 개 만드는 것
	 * 규칙 - 메소드 이름은 '동일하게' 매개변수의 개수나 유형 또는 순서 등은 '다르게'
	 * 반환유형은 전혀 상관없음
	 */
	
	
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
	
	/*
	int input(int a) { // 반환유형 다르건 같건 상관없이 input(int a) 괄호 부분이 달라야 함
		
	}
	*/

	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력");
	}
	
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 (순서만 바꿔도 괜찮음)");
	}
	
	void input(char c, int a, String s) {
		System.out.println("문자 1개, 정수 1개, 문자열 1개 입력");
	}
	
}
