package day07;

public class ObjectBasic02 {

	public static void main(String[] args) {
		
		System.out.println("-1번 계산기-");
		
		Calculator cal1 = new Calculator();
		
		System.out.println(cal1.add(1));
		System.out.println(cal1.add(2));
		System.out.println(cal1.add(3));
	
		
		
		System.out.println("-2번 계산기-");
		
		Calculator cal2 = new Calculator();
		
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(20));
	}
	
	
	
}
