package day07;

public class PenMain {
	
	public static void main(String[] args) {
		

	
		//클래스명 변수명 = new 클래스명();
		Pen black = new Pen(); // 객체가 만들어짐
		black.ink = "검정색";
		black.price = 2000;
		black.company = "모나미";
		
		black.write();
		
		//빨간펜
		Pen red = new Pen(); // Pen() 생성자 // 메소드랑 헷갈리지 말기
		red.ink = "빨간색";
		red.price = 2000;
		red.company = "하이테크";
		
		red.write();
		
		black.info();
		red.info();
		
		
		//////////////////////
		Variable v = new Variable(); // Variable() 생성자 // 메소드랑 헷갈리지 말기
		v.printNum(10);
		
	}
}
