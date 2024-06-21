package day11.final_.field;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
		System.out.println(p1.nation); // 사용은 가능
		// p1.nation = "미국"; final 변수에 붙으면 값 변경 불가
		System.out.println(p1.ssn); // 사용은 가능
		
		Person p2 = new Person("333333", "이순신");
		System.out.println(p2.ssn);
		
		
		/* 지역 변수 final
		final int a = 1;
		a = 2;
		*/
		
		
		System.out.println("---------------");
		
		
		
		// 상수의 사용 - static이 붙어 있어서 클래스명.변수명으로 소환 가능함
		System.out.println(Constant.PI);
		System.out.println(Constant.EARTH_RARIUS);
		System.out.println(Constant.VERSION);
		
		System.out.println(Math.E); // 상수는 자동 완성에 SF 딱지 붙어 있음
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		
		
		
	}

}
