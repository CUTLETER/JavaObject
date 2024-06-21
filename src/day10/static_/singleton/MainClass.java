package day10.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		// 3번의 getInstance()로 객체를 끄집어 냄
		Singleton s = Singleton.getInstance(); // 객체 생성 방법 - private이라 new 선언 못함
		Singleton s2 = Singleton.getInstance(); 
		
		System.out.println(s == s2);
		
		String name = s.getName();
		String name2= s.getName();
		
		System.out.println(name);
		System.out.println(name2);
	}
}
