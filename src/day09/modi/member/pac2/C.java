package day09.modi.member.pac2;

import day09.modi.member.pac1.A;

public class C {
	
	public C() {
		
		A a = new A();
		a.var1 = 1;
		//a.var2 = 2; default X
		// a.var3 = 3; private X
		a.method01();
		//a.method02(); default X
		// a.method03(); private X
		
		/////////////////////////////////
		// protected
		//A aa = new A(1);
		//aa.var = 1;
		//aa.method();
		
		
		
	}
	
}
