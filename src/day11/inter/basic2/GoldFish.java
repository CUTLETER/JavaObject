package day11.inter.basic2;

public class GoldFish extends Fish implements IPet {

	@Override
	public void swimming() {
		System.out.println("금붕어는 어항에서 헤엄쳐요");
		
	}

	@Override
	public void playing() {
		System.out.println("금붕어는 뭐하고 노는지 잘 모르겠어요");
		
	}

}
