package day11.inter.basic3;

public class Lg implements Printed {

// LG에 맞춰서 실행될 수 있도록 내용물을 구현함	
	
	public String logo = "Life is good";
	
	@Override
	public void print(String document) {
		System.out.println(logo);
		System.out.println("문서 출력 : "+document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println(logo);
		System.out.println("문서 출력 : "+document+ ", 색상 : "+color);
		
	}

	@Override
	public int copy(int cnt) {
		System.out.println(logo);
		System.out.println("문서 복사 : "+cnt);
		return cnt;
	}


}
