package day12.exception.trycatch;

public class TrycatchEx01 {
	
	public static void main(String[] args) {
		
		/*
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x/y); // 예외 발생 - Exception in thread "main" java.lang.ArithmeticException: / by zero
		System.out.println(x*y);
		*/
		
		int x = 1;
		int y = 0;
		
		
		try {
			
		
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x/y); 
//			System.out.println(x*y); 예외 발생하고 catch로 넘어갔기에 곱하기는 실행XX
			
		} catch(ArithmeticException e) { // ()안에는 예외의 종류가 들어감
			System.out.println("0으로는 나누기 불가");
		}
		
		System.out.println(x*y); // 이렇게 바깥으로 빼면 실행됨
		System.out.println("프로그램 정상 종료");
		
		
		
		
		
		
		
		
	}
	
	

}
