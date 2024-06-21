package day11.final_.field;

public class Person {
	
	/*
	public final String nation; // 초기화 하지 않으면 빨간 줄 뜸
	public final String ssn;	// 직접 값을 줘서 초기화 or 생성자 통해서 초기화
	public String name;
	*/
	
	public final String nation = "대한민국"; // 직접 초기화 하는 방식 = 대신 main 에서 값 변경 불가
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) { // 생성자 통해서 초기화 하는 방식, main 에서 객체를 새로 생성할 때마다 각각 다른 값 가질 수 있음, 그래서 얘 하나만 붙는다고 '상수'는 아님
		this.ssn = ssn;						 // 객체 생성 시 초기값이 지정됨
		this.name = name;
	}
	
}
