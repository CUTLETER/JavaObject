package day12.exception.trycatch;

public class TrycatchEx03 {

	public static void main(String[] args) {
		
//		다중 catch문		
		
		/*
		 * main 메소드에서 실행 시 매개값을 주는 방법
		 * 
		 * Run 탭 - run configration(실행 설정) - arguments 탭 - 띄어쓰기 기준으로 값이 들어감, ${string_prompt} 적어 넣으면 메소드 실행할 때마다 인자값 넣어줄 수 있음
		 */
		
		/*
		String a = args[0];
		String b = args[1];
		
// 		문자열을 숫자로 바꾸는 코드
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		System.out.println("두 수의 합 : "+(x+y));
		*/
		
		

		try {
			
			String a = args[0];
			String b = args[1];
			
//	 		문자열을 숫자로 바꾸는 코드
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			
			System.out.println("두 수의 합 : "+(x+y));
			
			// 예외 발생
			String str = null;
			str.charAt(0);
			
			
		} catch (ArrayIndexOutOfBoundsException | ClassCastException e) { // 2항 연산자인 or구문으로 여러 예외 동시에 처리 가능함
			System.out.println("실행 시에 매개값을 2개 입력하세요.");
		} catch (NumberFormatException e) {
			System.out.println("매개값을 숫자로 입력하세요.");
		}  catch (Exception e) { 	// Exception은 항상 맨밑에
			System.out.println("기타 예외");
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
