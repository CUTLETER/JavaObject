package day12.exception.trycatch;

public class TrycatchEx02 {
	
	public static void main(String[] args) {
		
		// 반복문에서 예외 처리
		
		String[] arr = {"홍길동", "홍길자", "이순신"};
		
		/*
		int i = 0;
		while (i<4) { // 예외 발생 - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
			
			System.out.println(arr[i]); 
			
			i++;
		}
		*/
		
		int i = 0;
		while (i<4) { // 반복문 안에 trycatch 넣으면 예외 발생해도 끝까지는(ex_ 프로그램 정상 종료 출력) 돌아감
			
			try {
				System.out.println(arr[i]); 
			} catch (Exception e) { // Exception -  Exception이 예외클래스들의 최상위 부모클래스이기 때문에 모든 예외를 처리 가능함, 위에처럼 일일이 긁어다가 붙여넣기 할 순 없음

				System.out.println("배열 참조 범위를 벗어남");
			} finally {  // 자원 해제 할 때 많이 사용됨, 자원 해제란 Scanner 쓰고 scan.close() 같은 걸 말함, br.close(); bw.close(); 등
				System.out.println("예외 발생 여부 상관없이 무조건 실행됨");
			}
			

			i++;
		}
		
		System.out.println("프로그램 정상 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
