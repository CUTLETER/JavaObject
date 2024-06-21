package day08.overloading.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.input(10);
		b.input("쾌차하세요");
		b.input(5.0, 23);
		b.input(26, 0.2);
		b.input('A', 6, "빠샤");

		
		
	}
}
