package day11.abstract_.good;

public class SeoulStore extends Store { // 상속 받으면 바로 빨간 줄 생기는데 unimplement method 택하면 됨, 오버라이딩 강제화

	@Override // = 어노테이션 : 특정한 기능을 가지거나 명명할 때 사용함
	public void melon() {
		System.out.println("서울 지점 멜론 500원");
		
	}

	@Override
	public void apple() {
		System.out.println("서울 지점 사과 600원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울 지점 오렌지 700원");
		
	}

}
