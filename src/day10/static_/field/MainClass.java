package day10.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.a++;
		c.b++;
		System.out.println("일반변수"+c.a);
		System.out.println("정적변수"+c.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		System.out.println("일반변수"+c2.a);
		System.out.println("정적변수"+c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		System.out.println("일반변수"+c3.a);
		System.out.println("정적변수"+c3.b);
		
		
		c3.b=100;
		c2.b++;
		System.out.println(c.b);
		System.out.println(c2.b);
		System.out.println(c3.b);
		
		
		//static 멤버는 클래스 바깥에서 생성됨
		//클래스에 속하며 모든 객체가 공유함
		//그래서 b값만 증가함 (맨위 c.b 값이 ++증가하여 1이 되고 c2.b 에서 '공유받은 c.b값'에 다시 ++하는 방식)
		//a는 c.a c2.a c3.a 객체마다 존재함
		Count.b = 100; //객체 생성없이 static 변수는 클래스명.변수명으로 접근함
		System.out.println(Count.b);
	}
}
