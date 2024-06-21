package day09.modi.construct.pac1;

public class A {

	// A() {} =  A의 생성자
	
	A a = new A(1); // public O
	A a2 = new A(true); // default O
	A a3 = new A("류"); // private O
	
	
	public A(int a) {}
	A(boolean a) {}
	private A(String a) {} // 외부에서 객체를 생성하지 못하게 할 때 private을 붙임







}
