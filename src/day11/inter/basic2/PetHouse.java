package day11.inter.basic2;

import java.util.Arrays;

public class PetHouse {
	
	
	
	/*
	 * 1번 메소드 - carePet()
	 * 매개변수 타입 - 펫들의 공통부모 타입
	 * 기능 instanceof 사용해서 적합한 펫타입으로 캐스팅 진행함
	 * 반환 XXX
	 */
	
	
	
	public void carePet(IPet pet) {
		if (pet instanceof Dog) {
			Dog dd = (Dog)pet;
			dd.eating();
			dd.playing();
		}
		if (pet instanceof Cat) {
			Cat cc = (Cat)pet;
			cc.eating();
			cc.playing();
		}
		if (pet instanceof GoldFish) {
			GoldFish gg = (GoldFish)pet;
			gg.playing();
			gg.swimming();
		}
		return;
	}
	
	
	
	

	/*
	 * 2번 메소드 - petInfo()
	 * 매개변수 타입 - IPet[]
	 * 기능 - 배열 반복
	 * 반환 XXX
	 */
	
	public void petInfo(IPet[] arr) {
		for (IPet pet : arr) {
			pet.playing();
		}
		return;
	}





	
	
	
	

}
