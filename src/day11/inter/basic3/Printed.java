package day11.inter.basic3;

public interface Printed {
	
// 마이크로소프트의 프린트 소프트웨어를 사용하려면 이 메소드를 구현하면 됨	
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int cnt);
	
	

}
