package day09.encap.obj;

public class Hotel {
	
	//호텔이 셰프를 필요로 한다면?
	// Chef chef; 데이터 타입_변수명
	private Chef chef; // 접근 제어자_데이터 타입_변수명

	
	/*
	public Hotel() { // 매개변수 x -> new 써서 생성
		this.chef = new Chef();
	}
	*/
	
	
	//호텔이 생성될 때 셰프를 초기화?
	public Hotel(Chef chef) { // 매개변수로 객체인 Chef 받겠다? -> 괄호 안에서 타입_변수명으로 선언
		this.chef = chef;
	}

	
	
	// getter-setter 객체를 매개변수로 받는, 객체를 반환하는 모형
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() { // Chef = 반환받을 값의 데이터 타입
		return chef;
	}
	
	
	
	
}
