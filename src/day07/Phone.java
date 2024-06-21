package day07;

public class Phone {

	
	//멤버변수
	String model;
	int price;
	String color;
	
	
	// 생성자는 클래스명과 동일하고 반환유형이 없음, 보통은 멤버변수 다음에 만들어줌
	Phone() {
		System.out.println("생성자 호출");
		// 보통 멤버변수를 초기화 하는 용도로 사용함
		model = "갤럭시S20";
		price = 20000000;
		color = "빨강";
	}
	
	
	// 생성자는 중복해서 여러 개 선언할 수도 있음
	// 단!!!! 생성자의 매개변수, 종류, 개수가 달라야 함
	Phone(String pColor) {
		 color = pColor;
		 price = 10000000;
		 model = "아이폰13";
		
	}
	
	
	
	Phone(String pColor, int pPrice) {
		color = pColor;
		price = pPrice;
		model = "아이폰16";
	}
	
	
	
	Phone(int pPrice, String pColor) {
		color = pColor;
		price = pPrice;
		model = "구글 픽셀3";
	}
	
	
	
	// 멤버변수 개수만큼 매개변수로 받아주는 생성자
	Phone(String pColor,int pPrice, String pModel) {
		color = pColor;
		price = pPrice;
		model = pModel;
	}
	
	
	
	void info() {
		System.out.println("---스마트폰 정보---");
		System.out.println("모델 : "+model);
		System.out.println("가격 : "+price);
		System.out.println("색상 : "+color);
	}
	
	
	
	
}
