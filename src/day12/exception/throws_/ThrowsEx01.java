package day12.exception.throws_;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		
//		 throws가 붙어 있는 메소드 or 생성자를 호출할 때는 예외가 발생할 수 있다는 의미이기 때문에 예외처리를 대신 진행해야 함		
//		 throws는 예외 처리를 강요할 때 사용함
		
		try {
			
			greeting(10); // 떠넘겨진 예외를 try-catch구문으로 처리하기
			
			
		} catch (Exception e) {
			System.out.println("잘못된 인덱스가 전달되었습니다.");
		}
	
		
//		throws로 만들어져 있는 대표적인 메소드 - Class.forName("클래스명");
		try {
			Class.forName("홍길동");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		}
		
		
	}
	
	
	private static String[] arr = {"홍길동", "이순신", "홍길자"};
	
	public static void greeting(int index) throws Exception { // throws - 메소드 뒤에 붙었으므로 해당 메소드 호출한 곳에 예외 떠넘기기
		System.out.println(arr[index]);
	}
	
	
	

}
