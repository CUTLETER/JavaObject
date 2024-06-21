package day09.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		/* 이 생성자로 만들 예정
		 * 	public void setChef(Chef chef) {
			this.chef = chef;
			}
		 */
		
		// Chef chef = new Chef(); 
		// Hotel hotel = new Hotel(chef); // 변수명으로 넣는 방법
		
		Hotel hotel = new Hotel(new Chef()); // 직접 생성해서 넣는 방법
		
		
		//setter
		Chef chef = new Chef();
		hotel.setChef(chef);
		
		
		// getter
		Chef c = hotel.getChef();
		c.cooking();
		
		
		
		
		
		
	}
}
