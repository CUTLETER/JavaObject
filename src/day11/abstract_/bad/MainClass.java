package day11.abstract_.bad;

public class MainClass {
	
	public static void main(String[] args) {
		
		SeoulStore s = new SeoulStore();
		
		s.apple();  // 오버라이딩이 되지 않아서 잘못된 메소드가 실행됨
		s.melon();
		s.orange(); // 오버라이딩이 되지 않아서 잘못된 메소드가 실행됨
		
		
	}

}
