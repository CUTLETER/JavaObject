package day11.abstract_.good;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Store s = new Store();  추상 클래스라 객체 생성 불가
		
//		추상 클래스를 사용하려면, 자식으로 생성해서 부모 타입에 저장하고 '객체 주상화' 시킨다고 함
		Store s = new SeoulStore(); // 자식 생성 - 부모 저장. 다형성 - 객체 추상화
//		SeoulStore s = new SeoulStore(); 자식 생성 - 자식 저장
		
//		Store s = new BusanStore(); 로 바꾸면 부산 지점 메소드가 실행됨
		
		s.melon();
		s.apple();
		s.orange();
		s.mango();
		
		String name = s.getName();
		System.out.println(name);
		
		System.out.println("----------------");
		
		
		
		
	}

}
