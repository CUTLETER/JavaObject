package day10.static_.method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		
		Count c = new Count(); // 다른 건 '객체 생성'하고 소환해야 함 (2)
		c.a = 10;
		c.method01();
		c.method02();
		
		//static 메소드의 사용법 - 클래스명.메소드명() , static 끼리만 이렇게 바로 소환 가능함, 다른 일반 메소드는 먼저 '객체 생성'하고 소환해야 함 (1)
		Count.method02();
		
		MainClass m = new MainClass(); // 다른 건 '객체 생성'하고 소환해야 함 (2)
		m.test();
		
		
		Math.random();
		Arrays.toString(new int[3]);
		Integer.toString(10);
		
	}

	public void test() {
		
	}
	
	
	
}
