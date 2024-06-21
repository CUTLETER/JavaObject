package day07.import_ex;

public class StringEquals {

	public static void main(String[] args) {
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동"); // 문자열은 객체라 사실 new 써서 이렇게도 만들 수 있음
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		// 주소값 비교
		System.out.println(str1 == str2); // true
		System.out.println(str1 == str3); // false 
		// 동일한 문자를 동일 클래스에서 선언하면 동일한 주소값을 가지게 됨
		// but 다른 클래스에서 넘어오거나 new를 써서 직접 생성하면 String이 각각의 다른 주소를 가지게 됨
		
		// 그래서 문자열 비교시에는 == 말고 .equals()를 이용해서 문자열 안에 담긴 내용을 비교하면 됨
		
		if(str1.equals(str3)) {
			System.out.println("문자열이 같다");
		}
		
	}
}
