package day10.static_.method;

import day09.modi.cls.pac2.C;

public class Count {
	
	public int a;
	public static int b;
	
	//일반 메소드 - 일반변수, 정적변수 모두 사용가능
	public int method01() {
		 a=10;
		 b++;
		 return b;
	}

	//정적 메소드 - static 멤버만 사용 가능함, 일반멤버는 사용XXX
	public static int method02() {
		//a=10;
		Count c = new Count();
		c.a = 10;
		//a는 객체를 통해서 사용할 수는 있음(대신 위에서 선언된 오리지널 a랑은 다름)
		
		b++;
		return b;
		
	}
	
	
	
}
