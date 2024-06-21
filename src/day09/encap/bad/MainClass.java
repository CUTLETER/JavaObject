package day09.encap.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 은닉이 없다면 타인으로부터 잘못된 값이 저장될 수 있음
		MyDate me = new MyDate();
		me.day = 32;
		me.month = 12;
		me.year  = 2325;
		me.ssn = "뭐임?";
				
		String ssn = me.ssn; // 또는 중요한 값을 누구나 가져갈 수 있음
		
		
		me.info();
	}

}
