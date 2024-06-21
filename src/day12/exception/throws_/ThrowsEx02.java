package day12.exception.throws_;

public class ThrowsEx02 {
	
	
	public ThrowsEx02() throws Exception { // 예외 떠넘기기(3), 예외 발견과 동시에 생성자 강제 종료
		System.out.println("생성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}

	public void aaa() throws Exception { //  예외 떠넘기기(2) ,  예외 발견과 동시에 aaa 강제 종료
		
		System.out.println("aaa 호출");
		bbb();
		System.out.println("aaa 종료");
	}
	

	public void bbb() throws Exception { //  예외 떠넘기기(1)
		System.out.println("bbb 호출");
		System.out.println(10 / 0); // 예외 발견과 동시에 bbb 강제 종료
/*		
		try {
			System.out.println(10 / 0); // 예외 추가
		} catch (Exception e) {
			System.out.println("예외 처리 완료"); // trycatch 쓰면 예외 발생해도 아래 "bbb 종료" 출력문까지 실행됨, 다만 try도 예외 발생 전까지의 코드만 실행되고 넘어감, throws는 강제 종료됨
			
		}
*/
		
		System.out.println("bbb 종료");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
