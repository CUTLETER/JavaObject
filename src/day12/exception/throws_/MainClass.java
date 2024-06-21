package day12.exception.throws_;

public class MainClass {

	public static void main(String[] args) {
		
//		new ThrowsEx02();  예외 떠넘기기(4) - 여기서 수정하면 됨, 모든 메소드를 try 구문에 넣는 건 때에 따라 적절치 않아서 호출한 곳에서 한번에 처리하는 게 간단할 수도 있음
		
		try {
			
			new ThrowsEx02();
			
		} catch (Exception e) {
			System.out.println("예외 처리 완료");
		}
		
		System.out.println("프로그램 정상 종료");

		
		
		
		
		
		
		
		
		
		
		
	}
}
