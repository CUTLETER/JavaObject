package day12.exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {

//		대신 예외처리를 진행함
		
		try {
		
			System.out.println(sum(10));
			System.out.println(sum(-5));
			
			
		} catch (Exception e) {
			System.out.println("양수로 전달해야 합니다.");
//			e변수에 접근하면 Exception 클래스의 여러 기능을 사용할 수 있음
			System.out.println(e.getMessage()); // e.getMessage() 예외 메세지를 얻는 getter 메소드
			e.printStackTrace(); // **예외 발생 시 예외 경로를 추적하는 메세지를 출력해줌 (**예외 원인을 찾을 때 매번 사용됨)
		}
		
		System.out.println("프로그램 정상 종료");
		
	}
	
	// 1 부터 양수까지의 합
	public static int sum(int a) throws Exception {
		
//		음수가 들어가면 예외를 발생시키고 메소드를 강제 종료시킴
		
		if (a < 0) {
			
//			예외를 생성하게 되면 예외를 처리할 try구문이나 throws구문을 사용해서 예외 처리를 진행함
			throw new Exception("###예외 메세지를 여기다 전달시킴###"); // 예외 생성문
		}
		
		int sum = 0;
		for (int i=1; i<=a; i++) {
			sum+=i;
		}
		
		return sum;
	}
	
	
	
	

}
