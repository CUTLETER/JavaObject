package day11.inter.basic2;

public class Cat extends Animal implements IPet {

	@Override
	public void eating() {
		System.out.println("고양이는 츄르를 먹어요");
		
	}

	@Override
	public void playing() {
		System.out.println("고양이는 박스 갖고 놀아요");
		
	}

}
