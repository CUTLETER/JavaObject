package day07;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone red = new Phone(); // new 생성자()
		red.info();
		
		Phone black = new Phone("검정"); // Phone(String pColor)
		black.info();
		
		Phone white = new Phone("하양",10000000);
		white.info();
		
		Phone blue = new Phone(10000000,"파랑");
		blue.info();
		
		// Phone 생성자 만들기 -  색상, 가격, 모델 값을 받음
		// 객체로 생성하기
		
		Phone orange = new Phone("한라봉",10,"샤오미3");
		orange.info();
		
		
		
		
	}
}
